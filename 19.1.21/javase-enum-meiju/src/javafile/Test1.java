package javafile;

enum Color1{
    RED("红色"),GREEN("绿色"),BLUE("蓝色");
    private String title;
    //构造方法私有化
    private Color1(String title){
        this.title = title;
    }

    @Override
    public String toString() {
        return "Color1{" +
                "title='" + title + '\'' +
                '}';
    }
}

public class Test1 {
    public static void main(String[] args) {
        System.out.println(Color1.BLUE);
    }
}
