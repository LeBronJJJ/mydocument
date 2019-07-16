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
纯常量的字符串拼接   和 之前相比的字符穿相等

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


















4.hashCode 与 equals 的关系？

5.java 实现大小比较的方式 （内部排序，外部排序）

6.HashMap TreeMap 与 HashTable 的 关系 与 区别？

7.HashMap 源码 解析  （负载因子  树化策略  内部 hash 策略  resize策略）

8.ConcurrentHashMap  如何高效实现 线程安全？

9.ConcurrentHashMap JDK 1.7 与 1.8 的区别？