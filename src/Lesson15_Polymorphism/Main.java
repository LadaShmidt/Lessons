package Lesson15_Polymorphism;

public class Main {
    public static void main(String[] args) {
        Cat lori = new Cat();
        Dog bublic = new Dog();
        lori.say();
        bublic.say();
        findOwner(lori);
        findOwner(bublic);
        System.out.println("Lori: " + lori.getOwner() + " Bublic: " + bublic.getOwner());
    }
    private static void findOwner(Animal animal){
        if(animal.getClass() == Cat.class){
            Cat cat = (Cat)animal;
            cat.setOwner("Boris");
            animal.setOwner("Cat_Owner");
        }
        if(animal.getClass() == Dog.class){
            Dog dog = (Dog)animal;
            dog.setOwner("Kolya");
            animal.setOwner("Dog_Owner");
        }
    }
}
