package javafile;

enum Sex1{
    MALE,FEMALE;
}

public class Test4 {
    public static void main(String[] args) {
        switch(Sex1.MALE){
            case MALE:
                System.out.println("男性");
            break;
            case FEMALE:
                System.out.println("女性");
            break;
            default:
                System.out.println("人妖？？？");
        }
    }
}
