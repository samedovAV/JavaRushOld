package task01.task0101.task0128;

/*
* Написать программу, которая вызывает метод sum с параметрами 2 и 2*/

public class TwoPlusTwo {
    public static void main(String[] args) {
        sum(2,2);
    }
    public static void sum(int a, int b) {
        int c = a + b;
        System.out.println("Sum is " + c);
    }
}
