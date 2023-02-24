package Lesson5_Encapsuation.Constructor;

public class SayCatServise {
    /* Данный мпример показывает не тлько инкапсуляцию, но и разбиение кода на уровне абстракции
     * В данном классе мы разделили непосредственно создание сообщения и вывода его в консоль
     * Статические переменные и методы можно вызывать без создания объекта классов
     * Так как их значение будет доступно всем и это значение будет единственным для всех
     * Если мы измени значение статической переменой, то значение поменяется для всех кто его будет читать
     * В то время как объектов мы можем создавать любое количество и изменяя один, другие не будут меняться
     */
    // Статические метод
    public static String hello = "Hello from static";
    public static void sayMeow(){
        System.out.println("Meow");

    }

    // Метод создания сообщения
    private String concatNameAndMessage(String name, String message){
        return name + ": " + message;
    }
    // Метод вывода сообщения в консоль
    public void say(Cat cat, String message){
        String catName = cat.getName();
        System.out.println(concatNameAndMessage(catName, message));
    }

}
