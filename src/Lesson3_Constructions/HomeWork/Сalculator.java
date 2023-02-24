package Lesson3_Constructions.HomeWork;
import java.util.Scanner;
public class Сalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое число");
        int firstNumber = input.nextInt();
        System.out.println("Введите второе число");
        int secondNumber = input.nextInt();
        System.out.println(" Выберите оперцию: 1-сложение, 2-вычитание, 3-деление, 4-деление с остатком.");
        int operator = input.nextInt();
        switch(operator){
            case 1:
                System.out.println(firstNumber+secondNumber);
                break;
            case 2:
                System.out.println(firstNumber-secondNumber);
                break;
            case 3:
                System.out.println(firstNumber/secondNumber);
                break;
            case 4:
                System.out.println(firstNumber/secondNumber+" в остатке "+firstNumber%secondNumber);
                break;
        }
    }
}
