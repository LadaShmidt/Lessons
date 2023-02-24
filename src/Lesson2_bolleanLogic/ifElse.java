package Lesson2_bolleanLogic;
import java.util.Scanner;
public class ifElse {
    public static void main(String[] args) {
        // Для ввода в консоль мы обращаемся к классу Scanner и создаем новый объект с помощью конструктора
        Scanner inputFormLine = new Scanner(System.in);

        // Объявляем три примитивные численные переменные типа int
        int firstNumber;
        int secondNumber;
        int result;

        // Тип данных String это полноценный ссылочный тип данных (класс)
        String inputfirstNumber = "Введите первое число";
        String inputSecondNumber = "Введите первое число";
        String firstBigger = "Первое число больше";
        String seсondBigger = "Второе число больше";
        String numbersEquals = "Числа равны";
        // С помощью метода System.out.println(), объект inputFromLine и метода extInt() мы задаем значение нашим переменным
        System.out.println(inputfirstNumber);
        firstNumber = inputFormLine.nextInt();

        System.out.println(inputSecondNumber);
        secondNumber = inputFormLine.nextInt();

        result = firstNumber + secondNumber;
        System.out.println("Сумма: "+result);

        // Логическое ветвления if/else
        if (firstNumber  > secondNumber){
            System.out.println(firstBigger);
        } else if (secondNumber > firstNumber){
            System.out.println(seсondBigger);
        }else{
            System.out.println(numbersEquals);
        }
    }
}
