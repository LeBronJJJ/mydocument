package com.whitejavafile;

class Point{
    private Object x;
    private Object y;

    public Object getX() {
        return x;
    }

    public void setX(Object x) {
        this.x = x;
    }

    public Object getY() {
        return y;
    }

    public void setY(Object y) {
        this.y = y;
    }
}

public class Test3 {
    public static void main(String[] args) {
        //设置整型坐标
        Point p = new Point();
        p.setX(10);
        p.setY(20);
        int x = (Integer) p.getX();
        int y = (Integer) p.getY();
        System.out.println("x = " + x + "\ty = " + y);
        //设置字符串
        Point p1 = new Point();
        p1.setX("东经30°");
        p1.setY("北纬20°");
        String x1 = (String) p1.getX();
        String y1 = (String) p1.getY();
        System.out.println("x1 = " + x1 + "\ny1 = " + y1);
    }
}
