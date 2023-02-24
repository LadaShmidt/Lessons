package Lesson15_Polymorphism;

public class Dog extends AbstractAnimal {
    @Override
    public void say() {
        System.out.println("Woof");
    }
}
