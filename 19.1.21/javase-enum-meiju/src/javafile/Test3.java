package javafile;

/**
 * 枚举的最大特点是只有指定的几个对象可以使用。
 * 例如：定义一个表示性别的枚举类，只能有两个对象。
 */
enum Sex{
    MALE("男"),FEMALE("女");
    private String title;
    Sex(String title){
        this.title = title;
    }
    @Override
    public String toString(){
        return this.title = title;
    }
}

class Person{
    private int age;
    private String name;
    private Sex sex;
    public Person(String name,int age,Sex sex){
        super();
        this.name = name;
        this.age  = age;
        this.sex  = sex;
    }

    @Override
    public String toString() {
        return "name:" + this.name + "age:" + this.age + "sex:" + this.sex;
    }
}

public class Test3 {
    public static void main(String[] args) {
        Person person = new Person("勒布朗",34,Sex.MALE);
        Person person1= new Person("萨瓦纳",34,Sex.FEMALE);
        System.out.println(person);
        System.out.println(person1);
    }
}
