package com.whitejavafile;

class Point1<T>{
    private T x;
    private T y;

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }
}
//引入泛型后，如果明确设置了类型，则为设置类型；如果没有设置类型，
//则默认为Object类型
public class Test4{
    public static void main(String[] args) {
        Point1<String> p = new Point1<String>();
        p.setX("东经20°");
        p.setY("北纬10°");
        String x = (String) p.getX();
        String y = (String) p.getY();
        System.out.println("x = " + x + "\ny = " + y);
    }
}