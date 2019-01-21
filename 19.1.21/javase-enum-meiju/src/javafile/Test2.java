package javafile;

interface IColor{
    public String getColor();
}

enum Color2 implements IColor{
    RED("红色"),GREEN("绿色"),BLUE("蓝色");
    private String title;
    Color2(String title){
        this.title = title;
    }
    @Override
    public String toString(){
        return this.title;
    }

    @Override
    public String getColor() {
        return this.title;
    }
}

public class Test2 {
    public static void main(String[] args) {
        IColor iColor = Color2.BLUE;
        System.out.println(iColor.getColor());
        System.out.println(iColor.toString());
    }
}
