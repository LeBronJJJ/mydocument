package com.javase.hook;

public class PaintFrame {
    public static  void drawFrame(IMyFrame f){
        System.out.println("启动线程");
        System.out.println("增加循环");
        System.out.println("查看消息栈");
        //画窗口
        f.paint();
        System.out.println("增加缓存，提高效率");
    }

    public static void main(String[] args) {
        drawFrame(new GameFrame02());
    }
}

class GameFrame01 extends MyFrame{
    @Override
    public void paint() {
        System.out.println("GameFrame01.paint();");
    }
}

class GameFrame02 implements IMyFrame{
    @Override
    public void paint() {
        System.out.println("GameFrame02.paint();");
    }
}
