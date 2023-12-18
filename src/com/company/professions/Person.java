package com.company.professions;

public class Person {
    String fullName;
    int age;

    public Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }


    public void display(){
        System.out.println("Full name: " + fullName);
        System.out.println("Age: " + age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
