/*
2. Person class
Create a Person class that contains:
variables fullName, age;
the move() and talk() methods, in which it is easy to display the message "Such and such a Person is talking" on the console.
Add two constructors - Person() and Person(fullName, age).
Create two objects of this class. One object is initialized with the Person() constructor, the other with Person(fullName, age).

*/

public class Person{
    String fullName;
    int age;

    public Person(){
        this.fullName = "Unknown";
        this.age = 0;
    }
    public Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }

    public void talk(){
        System.out.println("My name is " + fullName + " and i'm " + age);
    }
    public void move(){
        System.out.println(fullName + "is moving");
    }

    public static void main(String[] args){
        Person temu = new Person("Temutjin Koszhanov", 17);
        Person beka = new Person();
        temu.talk();
        beka.talk();
    }
}
