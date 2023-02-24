package Lesson8_ArrayList;
/*
 * ArrayList в java представляет собой класс, который реализуетдинамический массив.
 * То есть массив, который может изменять свой размер во время испольнения программы.
 * ArrayList может содержать в себе только reference тип данных.
 * В основе ArrayList лежит массив типа Object
 * Использование <> при объявление ArrayList явялется крайне желательным.
 * Он реализует интерфейс List и расширяет массив AbstractList.
 * ArrayList хранит элементы в последовательности, а обратитсья к ним можно по индексу.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _ArrayList {
    public static void main(String[] args) {
        // Примеры иннициализации ArrayList

        //Объявление и иннициализация пустого списка
        ArrayList<String> list1 = new ArrayList<>();
        // Объявление и иннициализация списка с начальной емкостью
        ArrayList<Integer> list2 = new ArrayList<>(10);
        // Объявление и иннициализация списка с элементами
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("Hello","World"));
        // Использование оператора add() для добавления элементов в список
        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(1);
        list4.add(2);
        list4.add(3);
        // Использование метода Collections.addAll() для добавления элементов в список
        ArrayList<String> list5 = new ArrayList<>();
        Collections.addAll(list5, "Hello","Wold");

        // Методы класса ArrayList
        // Методв add() - добавляет элементы в конец списка
        list1.add("Hello");
        list1.add("World");
        System.out.println("add(): " + list1);

        // Метод remove() - удаляется элемент из списка по индексу
        list1.remove(0);
        System.out.println("remove(): " + list1);

        // Метод get() - получает элемент из списка по индексу
        System.out.println("get(): " + list1.get(0));

        // Метод set() - заменяет элемент в списке по индексу на заданный элемент
        list1.set(0, "Bye");
        System.out.println("set(): " + list1);

        // Метод size() - возвращает количество элементов с писке
        System.out.println("size(): " + list1.size());








    }

}
