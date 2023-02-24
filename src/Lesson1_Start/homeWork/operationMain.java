package Lesson1_Start.homeWork;
import static Lesson1_Start.homeWork.operation.*;
public class operationMain {
    public static void main(String[] args) {
        byte byteValue = 1;
        int intValue = 10;
        long longValue = 6786415;
        short shortValue = 555;
        double doubleValue = 5.5;
        float floatValue = 8.5f;

        System.out.println(Sum(intValue,longValue));
        System.out.println(Subtraction(floatValue,doubleValue));
        System.out.println(Multiplication(byteValue,intValue));
        System.out.println(Division(shortValue,shortValue));
        System.out.println(Reminder(shortValue,intValue));
    }
}
