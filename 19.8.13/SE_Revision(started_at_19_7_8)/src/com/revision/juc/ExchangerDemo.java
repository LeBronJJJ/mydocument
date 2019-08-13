//package com.revision.juc;
//
//import java.util.concurrent.Exchanger;
//
//public class ExchangerDemo {
//    public static void main(String[] args) {
//        Exchanger<String> exchanger = new Exchanger<>();
//        Thread girlThread = new Thread(() -> {
//            try {
//                String  girl = exchanger.exchange("我喜欢你。。。。")
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//    }
//}
