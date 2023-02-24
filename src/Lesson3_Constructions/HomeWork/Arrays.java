package Lesson3_Constructions.HomeWork;
import java.util.Scanner;
import java.util.Random;

public class Arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int lengthArray = input.nextInt();
        System.out.println("Введите число");
        int number = input.nextInt();
        newArray(lengthArray,number);
    }
    public static void newArray(int lengthArray, int value){
        int array [] = new int[lengthArray];
        Random randomNumber = new Random();
        for(int i=0; i<array.length; i++){
            array[i] = randomNumber.nextInt(100);
        }

        int count = 0;
        for (int a: array) {
            if(value==a) {
                count++;
            }
        }

        int min = array[0];
        int max = array[0];
        for (int i=0; i<array.length; i++){
            if(max<array[i]){
                max = array[i];
            } else if (min>array[i]) {
                min = array[i];
            }
        }
        System.out.println("Такое число есть в массиве в количестве " + count + " штук");
        System.out.println("Максимальное число массива: "+max);
        System.out.println("Минимальное число массива: "+min);
    }
}
