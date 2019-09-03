package com.revision.DesignMethod.proxyPattern;

interface Work{
    void decide();
}

class Actor implements Work{
    @Override
    public void decide() {
        System.out.println("我要听从代理人的意见!请和我的代理人交流！");
    }
}

class Agent implements Work{

    Actor a = null;

    public Agent(Actor a){
        this.a = a;
    }

    @Override
    public void decide() {
        System.out.println("你好，我是代理！");
        a.decide();
    }
}

public class StaticProxyPattern {
    public static void main(String[] args) {
        //先new一个被代理对象
        Actor actor = new Actor();
        //代理类出现，并于被代理人产生关系
        Agent agent = new Agent(actor);
        //代理人替被代理人执行方法
        agent.decide();
    }
}
