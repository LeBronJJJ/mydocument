进程是系统资源分配的基本单位
线程是任务分配的基本单位

1.java中的多线程实现方式
继承Thread类
实现Runnable、Callable
线程池(推荐)

线程停止的三种方式:
    stop()
    设计标记类
    interrupt():synchronized不响应中断

2.多线程的常用操作方法
sleep();线程休眠,把线程从运行态变到阻塞态-->不会释放锁,立即交出cpu-->根据设置的时间恢复
yield();线程让步,直接将线程从运行态变到就绪态->同样不会释放锁,交出cpu时间不确定,由系统调度
只会让拥有相同时间优先级的线程有获取cpu的机会;

join():当前线程等待另一个线程执行完毕后,谁调等待谁结束,-->进入阻塞态,会释放锁
wait()/notify():synchronized                        -->运行态到阻塞态;
                                                    -->从阻塞态到运行态,两个方法都会释放线程锁
要使用wait/notify,必须在同步方法或同步代码块中使用

Object类的每个对象在jvm中都用一个监视器,有两个队列
同步队列:获取该对象锁失败的线程进入

等待队列:被wait的进入等待,直到notify

创建->就绪->运行->结束
        |   |
        |阻塞

用户线程:包括main方法的线程,属于用户定义程序结束就结束
守护线程:后台线程,只有当JVM最后一个线程终止才会终止
setDeamn可以将用户线程置为守护线程,只要将它置为true

3.同步和死锁
    保护的对象是谁 锁是谁

JVM内存模型(JMM):并发模型
描述共享变量(类成员变量,静态变量)如何存储

工作内存:变量在线程中的操作(读写)必需在工作内存中进行,这里面即需要保存着所有变量的副本
主内存:所有变量必需在这里存储

原子性:一组操作要么同时发生,要么一个都不发生
基本数据类型的读写操作都属于原子性操作

可见性:某一线程对于变量的修改对于其他线程而言是立即可见的
synchronize,volatile,final能保证可见性

有序性:在单线程场景下,所有代码执行顺序就是代码的书写顺序,多线程场景下所有代码都是乱序

只有以上三个特性同时满足的代码才是线程安全的

如何解决同步?
同步代码块
synchronized(对象----任一类的对象或类的class对象)
同步方法
修饰类成员方法,锁当前对象this
修饰类方法(static)锁的是当前类的反射对象(类.class)

synchronized的底层实现:jaca的Monitor机制
即任意Object及其子类对象内部都在java中附加monitor,获取对象的锁,就是获取Monitor

当一个线程尝试获取对象的Monitor时,若此时Monitor为零时,说明没有线程持有,当前线程获取Monitor

若此时值不为零,说明已经被其他线程拿到
    a.若当前线程恰好是持有,Monitor再+1,当前线程在进入同步块
    b.若不是当前线程,当前线程进入同步队列,等待锁释放

    查看指令:javap -v  加锁对应:  monitorenter
                      减锁对应 : monitorexit
    任意时刻只有当monitor值为零时,表示无锁状态

    java1.6后的synchronized的优化问题

    (1)CAS : Compare and swap:无锁保证线程安全
    CAS(O,V,A)
    V:主内存存放的实际变量值
    O:当前线程认为主内存的变量值
    A:希望将变量替换的值

    主内存: ticket = 1;--->经过线程一变成0

    线程1: ticket = 0; cas(1,1,0) O=V,认为此时没有线程修改主内存值,此时将0,更新到主内存
    线程2: ticket = 0; cas(1,0,0) O!=V,认为已经有线程修改了这个值,此时修改失败,返回主内存的最新值O,再次重试

    CAS机制会尝试ABA问题:
    num = 0;---> 1--->0(线程1线程2串行,线程1线程3并行)
    线程1:cas(0,0,1) 1替换成主内存
    线程2:cas(1,1,0) 1替换成了0
    线程3:cas(0,0,5) 0替换成了5
    产生了线程二的数据脏读,避免思路:可以添加一个版本号,即修改的次数,判断当前值到底有没有被改

    偏向锁 -> 轻量级锁 -> 重量级锁(java1.6之前 synchronize是重量级锁)

    重量级锁(悲观锁): 获取monitor失败的线程进入同步队列,变为阻塞态,悲观锁默认考虑获取锁时肯定有人在竞争

    偏向锁(乐观锁):
    此时默认是只有一个线程在来回进入同步块,
    会直接将加锁和减锁的过程都省略,每次进入同步块之前,只是判断一下同步块是否是当前线程
    如果有其他线程在不时刻想进入同步块时,升级为轻量锁

    轻量锁:
    当不同的时刻有不同的线程进入同步块
    每次线程在进入同步块时,都要加锁和解锁
    如果发现同一时刻有不同线程时,会将轻量级锁膨胀为重量级锁

    重量级:
    同一时刻有不同线程进入同步块

    即锁锁着竞争的升级,同时升级,但是锁不会降级

    自适应自旋:对重量级的优化
    获取锁失败的线程不会立即阻塞,而是在cpu上空跑一段代码,若在此阶段成功获取到锁,在下次失败时空跑时间延长;否则缩短
    因为时间在动态的变化,所以叫自适应

    锁粗化

    将多次连续且有重复的加减锁过程粗化为一次加减锁过程,通过这种方法提高效率

    锁消除

    当发现变量为线程私有变量时,将与原先方法上的synchronized消除掉

    产生死锁的四个条件
        1.互斥: 资源x的任意一个时刻只能被一个线程持有
        2.占有且等待:线程1占有资源x的同时等待资源y,并不释放x
        3.不可抢占:资源x一旦被线程1占有,其他线程不能抢占x
        4.循环等待:线程1持有x,等待y,线程2持有y,等待x
    当全部满足时才会死锁

    就是因为使用synchronize一旦死锁,那么很难解除,所有用lock

    jdk1.5的 Lock:常用子类ReentrantLock(可重入锁)
    a.使用格式
    try{
        //放置同步代码块
        lock.lock();//显式加锁
    }catch(){
    }finally{
        lock.unlock();//显式减锁
    }

    b.常用方法
        lock() 加锁,语意与synchronized完全一致
        unlock(): 解锁

        void lockInterruptibly() throws InterruptException 响应中断加锁 ,之后通过interrupt方法释放锁,打断死锁
        boolean tryLock();非阻塞式获取锁,获取锁成功后返回true,进入同步块
                          获取锁失败后,返回false,线程继续执行其他代码,此时破坏了占有且等待,不会死锁
        boolean tryLock(long time, TimeUnit unit)throws InterruptException:支持超时

    常见面试题:
    synchronized和ReentrantLock的关系与区别
    1.都属于独占锁(任意一个时刻只有一个线程获取到资源)
    都支持可重入锁

    2.synchronized是关键字,JVM层面实现的
    ReentrantLock是Java语言层面实现的"管理";

    3.ReentrantLock具备一些synchronized不具备的功能 还支持一个同步队列，多个等待队列
    响应中断、非阻塞式获取锁、支持超时获取锁

    公平锁:等待时间最长的线程先获取锁
    同样只有ReentrantLock具备此项功能

    //作业
    1.Lock接口的独有方法自己测试一下
    2.ReentrantLock的可重入特性测试

    等待/唤醒机制(线程之间的通信方式之一)
    wait/notify : synchronized

    synchronized(obj){
        line1;
        //释放锁
        wait(); //如果被notify后，将等待队列中的线程唤醒置入同步队列末尾排队获取锁
        line2;
    }
    //notify thread
    synchronized(obj){
            line1;
            notify();//notify线程知道将自己的同步块执行完毕后，才会释放锁。
            line2;
        }

    任意一个Monitor 有一个同步队列和等待队列(生产消费者阻塞时都进入一个队列 wait queue)
    当只有一个等待队列时，唤醒所有线程一定会造成不该唤醒的线程又被唤醒然后再次堵塞，
        造成不必要的性能开销
    notifyAll()  -> 所有线程全部唤醒(包括消费者)

    await/signal(wait/notify(匹配  但是在Lock里用的)) ：Lock
    Condition : 等待队列模型
    任意一个Lock对象有一个同步队列和多个等待队列(Lock.condition())调一次产生一个等待队列


    HomeWork：使用Lock+Condition 重写生产-消费者模型

    Lock 下的另一个子类：ReentrantReadWriterLock
    可重入的读写锁

    独占锁：任意一个时刻，只有一个线程能够获得锁
    共享锁：任意一个时刻，有多个线程能够获取到锁。

    读写锁：
        读锁：共享锁  读线程与读线程线程异步，同时获取锁

        写锁：独占锁  写线程和写线程互斥，只有一个写者可以获取到锁

        读写互斥， 写写互斥
        比如：共享单车

        读锁 == 无锁？
        一定不等，写线程开始工作时，可以限制所有读线程阻塞
        读写锁的应用：实现了线程安全的缓存

        缓存是啥？  大部分情况下就是个Map
        HashMap + ReentrantLockReadWriteLock = 高效且线程安全
        jdk1.8 的    stampedLock 了解一下

    ThreadLocal 线程本地变量

    多线程线程池：                                   数据源    数据库连接池Druid c3p0 Hakari
    为何采用线程池？
        方便管理 监控 线程的状态
        提高任务的响应速度
        线程可以重复利用
    ExecutorService:普通调度池核心接口:
        submit (Runnable Callable) : Future <V>的get方法  接callable 对象的返回值
        execute(Runnable) : void

    ScheduledExecutorService:定时调度池(执行定时任务)

    ThreadPoolExecutor: 线程池核心实现类
    Executors:线程池工具类

    线程池的   工作流程  ：  当任务到达线程池时的工作顺序
    要求掌握：工作流程，ThreadPoolExecutor参数会配置(自定义线程池)，内置四大线程池适用场景
   -核心线程池：corePoolSize
        -阻塞队列 ： BlockingQueue
        -最大线程池 ： maximumPoolSize
        -拒绝策略：rejectHandler

        样例 1 3 5
        样例输出  10
            println(10);
     1. 若核心池未满，则创建新的线程执行任务，而后将此线程入核心池
        -若核心池满了，且有空闲线程，则调度空闲线程执行任务。
     2. 将任务置入阻塞队列，排队等待空闲线程调度(juc 所以线程安全)。
        -ArrayBlockingQueue : 基于数组的有界阻塞队列
        -LinkedBlockingQueue: 基于链表的无界阻塞队列
        -SynchronousQueue: 不存储元素的无界阻塞队列
     3. 当阻塞队列满时，若此时最大线程池未满，创建新线程执行任务而后放入最大线程池中
     4.若最大线程池已满，调用相应的拒绝策略处理任务(默认为抛出异常且不处理任务)

     看看jdk的内置线程池(Executor)
     1. 固定大小线程池
        用的是LinkedBlockingQueue
             return new ThreadPoolExecutor(nThreads, nThreads,
                                                  0L, TimeUnit.MILLISECONDS,
                                                  new LinkedBlockingQueue<Runnable>());
        应用场景：当服务器负载较重时，限制线程的数量，可以采用固定大小的线程池。
     2. 单线程池
             return new FinalizableDelegatedExecutorService
                        (new ThreadPoolExecutor(1, 1,
                                                0L, TimeUnit.MILLISECONDS,
                                                new LinkedBlockingQueue<Runnable>()));
        应用场景：某些需要同步处理的场合(任务需要按序处理)
     3. 缓存线程池
            return new ThreadPoolExecutor(0, Integer.MAX_VALUE,  //线程数量从0到最大值
                                                  60L, TimeUnit.SECONDS,
                                                  new SynchronousQueue<Runnable>());    //不存储元素的无界队列
            SynchronousQueue<Runnable>());    //不存储元素的无界队列，入队和出队必须同时调用
            提交任务速度 > 执行任务速度: 不断创建新线程执行任务，有可能将内存写满
            ...         < ...        : 缓存线程池会变为单线程池，固定的几个线程来处理任务
        应用场景：适用于负载较轻的服务器，很多短期的小任务(执行速度很快的任务)
     4. 定时调度池
            return new ScheduledThreadPoolExecutor(corePoolSize);
         应用场景： 需要执行定时任务的场合

     手工创建线程池 new ThreadPoolExecutor()
     public ThreadPoolExecutor(int corePoolExecutor)

     Thread类

     手工写线程池

    homework：复习jdbc
            1. 加载驱动
            2. 获取连接
            3. Statement
                -select executeQuery()
                -update insert delete executeUpdate(): int
            4. ResultSet
            5. 关闭资源

            手工创建线程池  执行Callable任务

            Thread 类执行Callable FutureTask

            FutureTask类保证多线程场景下任务只会被执行一次

            Future get()会阻塞当前线程直到取得Callable的返回值





















