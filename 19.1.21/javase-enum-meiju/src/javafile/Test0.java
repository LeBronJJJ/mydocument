package javafile;
//enum & Enum 的区别
//enum 是一个关键字
//enum 相当于一个类继承了Enum这个抽象类而已
enum Color{
    RED,GREEN,BLUE;
}

public class Test0 {
    public static void main(String[] args) {
        //取得枚举序号和名称
        System.out.println(Color.BLUE.ordinal() + Color.BLUE.name());
        //取得所有枚举数据
        for(Color tmp : Color.values()){
            System.out.println(tmp.ordinal()+tmp.name());
        }
    }
}
