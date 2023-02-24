package Lesson16_Overloading;
/*
 * Overloading методов в Java - это возможность создания нескольких методов с одним и тем же именем,
 * Но различающихся по количеству аргументов и их типу.
 *
 * Основные условия для overloaded методов:
 * Имя метода должно быть одинаковым для всех перегруженных методов.
 * Список параметров должен быть различным для каждого перегруженного метода. Это может быть различным типом данных, количеством параметров или порядком параметров.
 * Возвращаемый тип метода может быть разным, но он не должен использоваться для различения перегруженных методов.
 * Методы могут быть перегружены внутри одного класса или между классами, связанными наследованием.
 * Методы могут иметь разные модификаторы доступа (public, protected, private, default), но они должны иметь одинаковое имя и параметры.
 */

import java.beans.Introspector;

public class Main {
    /*
     * Приоритетсность overloaded методов:
     * Если при вызове метода его параметр лист соответствует нескольким параметрам overloaded методов
     * Тогда приоритет их вызовов будет выглядеть следующим образом:
     *
     * Точное совпадение типов данных.
     * Поглощающие типы данных (большие типы данных для primitive и parent классы для ссылочных типов)
     * Autoboxed типы данных
     * Varargs
     */
    void abc(int a, int b){
        System.out.println(1);
    }
    void abc(long a, long b){
        System.out.println(2);
    }
    void abc(Integer a, Integer b){
        System.out.println(3);
    }
    void abc(int ... a){
        System.out.println(4);
    }

    // Приоритетность ссылочных типов данных
    void abc(String s){
        System.out.println("A");
    }
    void abc(String ... s){
        System.out.println("B");
    }
    void abc(Object s){
        System.out.println("C");
    }
    void abc(String s1, String s2){
        System.out.println("D");
    }

    public static void main(String[] args)  {
    }
}
