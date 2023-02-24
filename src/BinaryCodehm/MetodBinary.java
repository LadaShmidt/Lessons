package BinaryCodehm;

public class MetodBinary {
    public MetodBinary(String a, String b){// создаем метод, который будет принимать в свои параметры две стринговых переменных
        int num1 = Integer.parseInt(a, 2);// создаем переменную типа int и присваиваем ей значение стринговой переменной, преобразованной в интовое значение
        int num2 = Integer.parseInt(b, 2);
        int sum = num1 + num2;// создаем переменную типа int и присваиваем ей значение суммы переменных высше
        String result = Integer.toBinaryString(sum);// создаем стринговую переменную и присваиваем в нее интовыую переменную, преобразованную в бинарное значение
        System.out.println(result);// выводит переменную высше

    }
}
