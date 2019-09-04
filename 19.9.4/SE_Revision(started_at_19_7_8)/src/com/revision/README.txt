SE:
多线程
类集
JVM
final finally finalize 区别

java 的方法都是---------值传递-----------  //需要详细研究

------------字符串--------------
//程序从右往左执行   abc进常量池  然后 new一个 对象  最后有两个
String str = new String ("abc");

字符串 用+ 拼接 就会变成StringBuilder  也就是其.append操作  最后变成String  用的是 toString方法
该方法  return了个  new String
纯常量的字符串拼接   和 之前相比的字符串相等

字符串拼接时  只有纯常量拼接  不会转为 StringBuilder
直接在常量池  中寻找  是否存在已有值
否则 只要 存在 一个 字符串 变量的 "+"  都会转为StringBuilder  调用append方法

----------异常------------

异常体系中  若finally 代码块中 存在 return  语句  则 try  catch  中的 return 失效
若  finally  中 无return         try  catch 中有  则  try  catch  代码块中 先暂存  代码块中的值
然后执行  finally  中的  值  最后返回 暂存值。

---------多线程-------------

三种方法 创建 多线程  Thread  Runnable  Callable

各种 锁  要理解

---------------集合类----------------

迭代遍历 一个集合的方式

-----------数据结构-----------
如何在o(n)的复杂度内  查找 100w个元素中的  第十大元素     //top key问题：快速排序  分区思想

如何在小于o(nlogn)时间内  找到 100w个元素中的前十个元素   ：优先级队列  一个堆

非递归中序遍历二叉树    ：   深度优先遍历：前中后序遍历   广度优先遍历：用栈的思想  层序遍历

数据结构的各个oj题 再做做  各个排序方法

------------数据库------------

_%

事务的ACID特性

多表查询

------------网络--------------

Tcp/ip

三次握手  四次挥手

HTTP  401  500服务器错误 301重定向

------------类集---------------

1.LinkedList ArrayList Vector 的关系与区别
    a.都是 List接口下的常用子类，其中ArrayList，Vector是基于数组实现的
        LinkedList 基于双向链表实现。

    b.ArrayList采用 懒加载策略，第一次添加元素时才初始化内部数组(大小为10)。
        扩容：ArrayList 扩容为原先数组的1.5倍。
        采用异步处理，线程不安全，性能较高。
        ArrayList使用场景： 在大部分场合 一般考虑使用 ArrayList

    c.Vector 在产生对象 时  初始化为一个大小为10的内部数组。(无参构造)
        扩容：Vector扩容为原先数组的2倍。
        Vector 采用synchronized 修饰常用的增删改查方法，线程安全，性能较低(读读互斥)。
        Java 提供的 栈实现 Stack 是 Vector的子类。

    d.LinkedList 在  任意位置  的插入和删除 需要考虑 LinkedList,Queue 接口的子类实现。
        //如何用双栈模拟队列  如何用双队列模拟栈。

2.请问了解JCL 的 fail-fast 策略吗fail-safe 又是什么？

    什么是fail-fast?
        优先考虑出现异常的场景，当异常产生时，直接抛出异常，程序终止。

    为何会产生 fail-fast?
        源码if(modCount != expectedModCount) throw new ConcurrentModificationException
        modCount  (存在于abstractList) 记录 List集合 被 修改(add,remove)的次数
        expectedModCount存在于内部迭代器实现，用来存储当前集合的修改次数。

    fail-fast 的 意义？
        保证多线程场景下  不产生 “脏读”。  您拿到的数据已经不是最新的了。


    fail-safe是啥？
        不抛出ConcurrentModificationException 的集合就是 fail-safe 集合
        juc包下线程安全的集合类(copyOnWriteArrayList,ConcurrentHashMap) 都不抛这个异常。

3.Set接口 和 Map接口 的区别？关系？

     Set实际上内部就是Map  保存单个元素存储在Map

     hashSet和TreeSet 的区别？
       Set不允许数据重复
       在hashSet中如何判断两个对象是否重复  依据的是equals 和 hashCode
       元素想要保存到treeSet中 要么元素本身所在的类实现Comparable接口
       要么通过一个外部传入一个比较器(外部排序)


4.hashCode 与 equals的关系

hashCode  取得任意一个对象的哈希码  如何把一个对象变成 整数
equals    比较两个对象是否相等

hashCode 返回值相等的两个对象 equals  不一定相等   (f(x) 和 x 的关系)
equals 返回值相等的两个对象  hashCode   一定相等

5.java 实现大小比较的方式 （内部排序，外部排序）
  --两个对象间--
  内部排序(实现了Comparable接口的子类，表示本类具备了天然的可比较特性)
  需要覆写一个方法 int compareTo(Object o)
  >0  本身 大于 目标对象
  =0  本身 等于 目标对象
  <0  本身 小于 目标对象

  外部排序(Comparator)
  类本身不具备可比较的特性 专门有一个类 比较 该类的大小  (这种类叫做比较器)
  策略模式

6.HashMap TreeMap 与 HashTable 的 关系 与 区别？

    a.三个类都是Map接口下的常用子类
        HashTable基于哈希表实现
        TreeMap基于红黑树实现
        HashMap基于哈希表-红黑树(1.8之后，jdk1.8基于哈希表)

        哈希表(k,v)：数组
        根据相应的哈希算法计算key值的下标  返回值即为value的存储下标

        哈希算法:(f(k))  根据一定的算法  传入key  算出 value  这个int的value 即为要存储的数组下标

        (1,"hello");
        (17,"world");
        哈希算法: %16

        查找  添加元素  的时间复杂度
        当哈希表的查找O(1)  添加O(1)

        哈希冲突(两个不同对象的哈希值相等的情况)解决思路
        eg: 1 % 16 == 17 % 16
        开放定址法
            寻找下一个为null的数组下标 然后将冲突元素存入
            没人用
        再散列法
            再次使用一个不同的哈希算法  再计算一次
            基本可以解决
        链地址法(拉链法)
            将所有冲突元素按照链表存储(hashMap就使用这样的方法解决的哈希冲突)
    b.关于null值
        HashMap允许key value 均为null
        HashTable key value均不允许为null
        TreeMap   key不能为空  因为要排序  不然空指针  value可以为空
    c.线程安全
      TreeMap HashMap 采用异步处理 线程不安全 性能较高
      HashTable 使用了 synchronized 同步方法 线程安全 性能较低 (锁的是整个哈希表 读读互斥)



7.HashMap 源码 解析  （负载因子  树化策略  内部 hash 策略  resize策略）
    内部属性
        final float loadFactor(默认值为0.75)(负载因子)

        int threshold = loadFactor * tab.length(实际容量)

        TREEIFY_THRESHOLD = 8(树化阈值)

        UNTREEIFY_THRESHOLD = 6(解除树化阈值)

        HashMap也采用懒加载策略  第一次put时初始化哈希表
            HashMap里的hash算法
                为何不直接用Object的hashCode方法？
                    将哈希码保存一般，将高低位都参与哈希运算，减少内存开销，减少哈希冲突
                具体是先全部右移16位，然后和自身进行一个异或算法
            第一次使用putVal时1.完成哈希表的初始化2.完成扩容
            1.哈希表索引下标计算：
                i = (n-1)&hash
            2.n:哈希表长度
                n必为2^n保证哈希表中所有的索引下标都会被访问到
                若 n = 15 则 以下位置永远不可能存储元素  因为 有个与运算 高位有个0 所以后面都是零
                0011
                0101
                1001
                1011
                1101
                1111

                15：0000 1111

                什么时候会树化
                    索引下标对应的链表长度带到阈值8 且当前哈希表长度达到64 才会树化
                    只树化值超过索引下标的元素
                    否则只是调用resize方法进行扩容  扩容为原先数组容量的二倍
                    当负载因子过大  会导致哈希冲突明显增加  节省内存
                    负载因子过小    会导致哈希表频繁扩容 内存利用率低

                    为何1.8要引入红黑树
                    当链表过长时，会将哈希表查找的时间复杂度退化为O(n)
                    树化保证  即便在哈希冲突严重时  查找的时间复杂度也为O(log n)

                    当红黑树 节点个数在扩容 或者 删除时  节点数减小为6以下 在下次resize时 会将
                    红黑树退化为链表  节省空间

                final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
                                   boolean evict) {
                        Node<K,V>[] tab; Node<K,V> p; int n, i;
                        if ((tab = table) == null || (n = tab.length) == 0)
                            n = (tab = resize()).length;
                        if ((p = tab[i = (n - 1) & hash]) == null)
                            tab[i] = newNode(hash, key, value, null);
                            //哈希表已经初始化
                        else {
                            Node<K,V> e; K k;
                            if (p.hash == hash &&
                                ((k = p.key) == key || (key != null && key.equals(k))))
                                e = p;
                                //此时索引对应的链表已经树化了，使用红黑树方式将当前节点添加到树中
                            else if (p instanceof TreeNode)
                                e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
                                //以链表的方式 将当前节点添加到链表末尾
                            else {
                                for (int binCount = 0; ; ++binCount) {
                                //找到链表末尾
                                    if ((e = p.next) == null) {
                                        p.next = newNode(hash, key, value, null);
                                        if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                                            treeifyBin(tab, hash);
                                            //尝试将链表树化
                                        break;
                                    }
                                    if (e.hash == hash &&
                                        ((k = e.key) == key || (key != null && key.equals(k))))
                                        break;
                                    p = e;
                                }
                            }
                            if (e != null) { // existing mapping for key
                                V oldValue = e.value;
                                if (!onlyIfAbsent || oldValue == null)
                                    e.value = value;
                                afterNodeAccess(e);
                                return oldValue;
                            }
                        }
                        ++modCount;
                        //扩容策略  此时添加了新节点
                        if (++size > threshold)
                            resize();
                        afterNodeInsertion(evict);
                        return null;
                    }

8.ConcurrentHashMap  如何高效实现 线程安全？

    HashTable 锁的是整个哈希表（锁的个数只有一个  而且粒度非常粗  读读互斥） 所以效率低
    ConcurrentHashMap 锁的个数 更多 粒度更细

9.ConcurrentHashMap JDK 1.7 与 1.8 的区别？

    jdk1.7
    ConcurrentHashMap Segement  + 哈希表
    Segment 在 初始化为16之后 不会扩容
    扩容发生在 segment对应的 小哈希表
    ConcurrentHashMap 锁的是Segement，由HashTable的 1把锁 变为了 16把  锁的粒度更细
    支持的并发线程  线程1拿到segement1的锁 并不会影响到 线程2访问segemnet2

    segment 是 ReentrantLock 的 子类  使用 lock 来 保证线程安全






    jdk1.8
    哈希表 + 红黑树
    segement失去了作用。。。只保留了结构
    锁的是哈希桶(每个表的数组元素) 锁的粒度更细  锁的个数会随着哈希表的扩容而增加
    性能更高  支持的线程数更多

    CAS + synchronized 代码块 来保证线程安全










