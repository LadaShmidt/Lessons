package Lesson1_Start;

public class Main {
    //Метод main является запуском программ и необходим для ее запуска
    public static void main(String[] args) {
        //Метод позволяет выводить в консоль информацию разных типов
        System.out.println("Hello World");
        //Примитивные типы данных
        byte b1;    //8 бит = 1 байт
        long l;     //64 бит = 8 байт
        int i;      //32 бит = 4 байт
        short s;    //16 бит = 2 байт
        double d;   //64 бит = 8 байтм
        float f;    //32 бит = 4 байт
        char c;     //16 бит = 2 байт
        boolean b2; //8 бит = 1 байт
    ///////////////////////////////////////
        int firstNumber = 10;
        int secondNumber = 5;
        int sum;
        int subtraction;
        int multiplication;
        int division;
        int reminder;
        // оператор присвоение и сложения
        sum=firstNumber+secondNumber;
        // оператор вычитания
        subtraction=firstNumber-secondNumber;
        // оператор умножения
        multiplication=firstNumber*secondNumber;
        // оператор делени
        division=firstNumber/secondNumber;
        // оператор взятия остаттка от деления
        reminder=firstNumber%secondNumber;

        System.out.println("Сумма= "+sum);
        System.out.println("Вычитание= "+subtraction);
        System.out.println("Умножение= "+multiplication);
        System.out.println("Деление= "+division);
        System.out.println("Остаток= "+reminder);

    }
}
