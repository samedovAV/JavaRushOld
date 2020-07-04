package task04.task0409;

/*
* Написать метод displayClosestToTen.
* Метод должен выводить на экран ближайшее к 10 из двух чисел, записанных в аргументах метода.
* Например, среди чисел 8 и 11 ближайшее к десяти 11. Если оба числа на равной длине к 10, то вывести любое из них.
*/

public class NearestToTen {
    public static void main(String[] args) {
        displayClosestToTen(8,11);
        displayClosestToTen(7,12);
        displayClosestToTen(11,9);
    }

    public static void displayClosestToTen(int a, int b) {
        if (abs(10 - a) > abs(10 - b)) {
            System.out.println(b);
        }
        else if (abs(10 - a) < abs(10 - b)) {
            System.out.println(a);
        }
        else
            System.out.println(a);
    }

    public static int abs(int a) {
        if (a<0) {
            return -a;
        } else {
            return a;
        }
    }
}
