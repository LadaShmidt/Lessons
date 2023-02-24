package Lesson5_Encapsuation.Constructor;
/*
 * Конструк - это метод класса, который инициализирует новый объект после его создания.
 * В конструкот передают значение переменных, которые обязателньо должныы быть инициализированы.
 */
public class Cat {
   // Конструк без аргументов
   // public Cat(){
   // }
/////////////////////////////////////
    // Конструктор с аргументами
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat(String name) {
        this.name = name;
    }
/////////////////////////////////////
    private int age;
    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
/////////////////////////////////////
    private String owner;
    public String getOwner(){
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
/////////////////////////////////////
}
