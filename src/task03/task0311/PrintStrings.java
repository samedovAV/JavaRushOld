package task03.task0311;

/*
* Реализовать метод public static void writeToConsole(String s),
* который добавляет к началу строки выражение "printing"
* и выводит измененную строку на экран
*/

public class PrintStrings {
    public static void main(String[] args) {
        writeToConsole("Hello, world!");
    }

    private static void writeToConsole(String s) {
        System.out.println("printing: " + s);
    }
}
