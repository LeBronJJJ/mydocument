package test;

public class Print {


    public static void main (String [] args){

        Person person = new Person("张瑞",21);
        Person person1 = new Person("白玉亮",20);
        System.out.println(person.getPersonInfo() + person1.getPersonInfo());
    }
}