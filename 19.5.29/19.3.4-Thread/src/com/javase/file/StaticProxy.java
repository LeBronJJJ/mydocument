package com.javase.file;
/*
* 静态代理  设计模式
* 要求：
* 1.真实角色
* 2.代理角色   持有真实角色的引用
* 3.二者  实现相同的接口
* */
public class StaticProxy {
    public static void main(String[] args) {
        //创建真实角色
        //如果有新增方法   就不能用 Marry(接口) 去
        Marry you = new You();
        //创建代理角色   需要  持有   真实角色的引用
        Marry company = new WeddingCompany(you);
        company.marry();
    }
}

interface Marry{        //类似于runnable接口     二者共同需要实现的接口
        void marry();
}

class You implements Marry{     //真实角色

    @Override
    public void marry() {
        System.out.println("真实角色");
    }
}

class WeddingCompany implements  Marry{     //代理角色
    //要持有真实角色的引用
    private Marry you;



    public WeddingCompany(Marry you) {
        this.you = you;
    }

    private void before(){
        System.out.println("准备");
    }

    private void after(){
        System.out.println("完成");
    }

    @Override
    public void marry() {
        before();
        you.marry();
        after();
    }
}


