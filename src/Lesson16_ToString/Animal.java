package Lesson16_ToString;

public class Animal {
    String name;
    int age;
    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
        return "Animal's name " + name + " and Animal's age " + age;
    }
}
