package com.revision.Others;

class User1{
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User1{" +
                "age=" + age +
                '}';
    }
}

public class PassByValue3 {
    public static void main(String[] args) {
        PassByValue3 pbv3 = new PassByValue3();

        User1 user = new User1();
        user.setAge(10);
        pbv3.print(user);
        System.out.println("print " + user);

    }

    public void print(User1 user1){
        user1 = new User1();
        user1.setAge(20);
        System.out.println("print " + user1);
    }

}
