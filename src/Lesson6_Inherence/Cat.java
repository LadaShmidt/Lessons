package Lesson6_Inherence;
/*
 * Наследование позволяет строить новые классы на базу существующих,
 * добавляя в них функциональность или переопределяя существующую.
 * С помощью наследования можно использовать методы и поля класса родителя
 * Суперкласс - тот класс, который наследуется
 * Сабкласс - тот класс, который наследует
 */

public class Cat {
//////////////////////////////////////
    private int age;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
//////////////////////////////////////
    private String owner;
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
//////////////////////////////////////
    public Cat (int age, String owner){
        this.age = age;
        this.owner = owner;
    }
    public void sayMeow(){
        System.out.println("Meow");
    }
}
