package Lesson5_Encapsuation.Constructor;

public class Main {
    // Создание объекта через конструктор
    public static void main(String[] args) {
        SayCatServise sayCatServise = new SayCatServise();
        Cat tom = new Cat("Tom");
        sayCatServise.say(tom, "I want to eat");
        ////////////////////////////////////////////////
        Cat loli = new Cat("Loli");
        sayCatServise.say(loli, "I want to sleep");
        ////////////////////////////////////////////////
        Cat rose = new Cat("Rose");
        sayCatServise.say(rose, "I want to play");
        ////////////////////////////////////////////////
        /*
         * Для вызова статического метода и переменных необходимо обращаться к классу, а не к объекту
         * так как статические переменные и методы принадлежат классу, а не объекту.
        */
        SayCatServise.sayMeow();
        System.out.println(SayCatServise.hello);
    }




}
