package task04.task0408;

/*
* Написать метод compare(int a), чтобы он:
* - Выводил на экран строку "Число меньше 5", если параметр метода меньше 5;
* - Выводил на экран строку "Число больше 5", если параметр метода больше 5;
* - Выводил на экран строку "Число равно 5", если параметр метода равно 5;
*/

public class GoodOrNot {
    public static void main(String[] args) {
        compare(3);
        compare(6);
        compare(5);
    }

    public static void compare(int a) {
        if (a < 5)
            System.out.println("Число меньше 5");
        else if (a > 5)
            System.out.println("Число больше 5");
        else
            System.out.println("Число равно 5");
    }
}
