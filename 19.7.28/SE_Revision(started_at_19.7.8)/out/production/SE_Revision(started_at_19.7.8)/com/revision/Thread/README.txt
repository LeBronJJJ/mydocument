多线程
    进程是操作系统中  资源分配的  基本单位
    线程              任务分配   基本单位

1.实现方式：
    4种
    继承 Thread
    实现 Runnable Callable(Future)
    线程池(推荐) submit

2.多线程的常用操作方法
    a.  sleep  线程休眠，运行态->阻塞态，不会释放锁，立即交出CPU
    b.  yield  线程让步，运行态->就绪态，不会释放对象锁，交出CPU时间不确定，由系统调度决定
        只会让拥有相同优先级的线程  获取cpu的机会
    c.  join   当前线程等待另一线程执行完毕后再恢复执行，运行态->阻塞态，
        会释放对象锁(包装了wait方法 释放锁)

    (多线程的等待和唤醒机制)

    d.  wait/notify : synchronized
    要使用  wait notify，必须再同步方法或同步代码块中使用（线程已经拿到锁了），都会释放对象锁

    wait    运行态->阻塞态
    notify  阻塞态->就绪态

    Object 及其子类的每个对象都有两个队列：
    同步队列：
        获取该对象锁失败的线程进入同步队列
    等待队列：
        调用wait 方法的线程进入等待对列(等待被 notify) 被notify的线程一律都跑到同步队列的末尾


    守护线程：
        java线程只有两类  用户线程 和 守护线程

        守护线程：后台线程，只有当当前jvm进程中最后一个用户线程终止，守护线程会随着jvm一同终止
        GC就是一个典型的守护线程

        setDeamn 方法 可以把当前线程变成守护线程

    *同步问题*
    保护的对象是谁   锁是谁

    jvm 内存模型（jmm）：并发程序

    描述共享变量(类成员变量，静态变量)如何存储

    工作内存：变量在线程中的操作(读写)  必须在 工作内存中进行，工作内存中保存了所有变量的副本


    主内存：所有变量必须在主内存中存储

    原子性
        一组操作  要么同时发生  要么一个都不发生
        关于基本数据类型的读写操作  都属于  原子性操作
    可见性
        某一线程对于一个变量的修改对于其他线程而言时立即可见的
        synchronized(lock)  volatile  final 可保障可见性
    有序性
        在单线程场景下  代码执行顺序  就是代码书写顺序
        多线程场景下      所有代码都是乱序的

    线程安全指的是  以上三个特性同时满足

    使用synchronized 解决同步问题

    同步代码块
        synchronized 修饰的 一块{对象}
            -任意类的对象
            -类.class对象
    同步方法
            -修饰类成员方法  锁的对象是谁？当前对象this
            -修饰类方法(static)  锁的是当前类的反射对象





















