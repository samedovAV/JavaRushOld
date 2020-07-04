package task01.task0101.task0127;

/*
* Напиши программу, которая выводит на экран квадрат числа 5
*/

public class NumberInSquare {
    public static void main(String[] args) {
        int num = 5;
        int res = sqr(num);
        System.out.println("Square of " + num + " is " + res);
    }

    public static int sqr(int a) {
        return a*a;
    }
}
