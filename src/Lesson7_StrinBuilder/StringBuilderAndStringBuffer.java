package Lesson7_StrinBuilder;
/*
 * Классы StringBuffer и StringBuilder в java используются тогда,
 * когда возникает необходимость сделать множественные изменения в строке символов.
 * В отличии от строк, объекты типа StringBuffer и StringBuilder могут принимать множественные изменения,
 * оставляя после себя множество используемых объектов.
 * Основое отличе StringBuffer и StringBuilder в том, что метод StringBuilder не безопасен для потоков(несинхронизирован).
 * Рекомендуется спользовать StringBuilder всякий раз, когда это возможно, потмоу что он быстрее  StringBuffer.
 * Однако, если важна безопасность потоков, наилучшим вариантом будет StringBuffer.
 */

public class StringBuilderAndStringBuffer {
    public static void main(String[] args) {
        // Пример инициализации переменной типа StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Hello World!");
        System.out.println("StringBuffer: "+stringBuffer);

        // Пример инициализации переменной типа ЫStringBuilder
        StringBuilder stringBuilder = new StringBuilder("Hello World!");

        // Методы класса StringBuffer
        // Метод append() - добавляет заданный аргумент в конец строки.
        stringBuffer.append("Bye");
        System.out.println("append(Bye): " + stringBuffer);

        // Метод insert - вставляет заданный аргумент в указанную позицию внутри строки.
        stringBuffer.insert(5,"Wow");
        System.out.println("insert(5,Wow): " + stringBuffer);

        // Метод delete() - удаляет символы в заданом диапазоне индексов.
        stringBuffer.delete(1,4);
        System.out.println("delete(1,4): " + stringBuffer);

        // Метод reverse() - меняет порядок символов в строке на обратный.
        stringBuffer.reverse();
        System.out.println("reverse(): " + stringBuffer);

        // Метод replace() - заменяет заданный диапазон символов новой строкой
        stringBuffer.replace(1,3,"Pit");
        System.out.println("replace(1,3,Pit): " + stringBuffer);

        // Метод length() - возвращает длину строки.
        System.out.println("length(): " + stringBuffer.length());

        // Метод charAt() - возвращает элемент в указанном индексе
        stringBuffer.charAt(5);
        System.out.println("charAt(5): " + stringBuffer);

        // Метод setCharAt() - заменяет символ в указанном индексе.
        stringBuffer.setCharAt(1,'K');
        System.out.println("setCharAt(1,K): " + stringBuffer);

        // Метод capacity() - возвращает количество символов, для которых зарезервирована память, по умолчанию - 16 запасных мест.
        System.out.println("capacity(): " + stringBuffer.capacity());

        // Метод indexOf() - возвращает индекс, под которым символ или строка появляются первый раз, возвращает -1 если символ или строка не найдены.
        System.out.println("indexOf(kit): " + stringBuffer.indexOf("Kit"));
    }
}
