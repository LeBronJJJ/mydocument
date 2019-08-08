package com.revision.Others;

class User{
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                '}';
    }
}

public class PassByValue1 {
    public static void main(String[] args) {
        PassByValue1 pbv1 = new PassByValue1();

        User user = new User();
        user.setAge(10);
        pbv1.print(user);
        System.out.println("print " + user);

    }

    public void print(User user){
        user.setAge(20);
        System.out.println("print " + user);
    }

}
