package task02.task0216;

/*
* Написать функцию, которая вычисляет минимум из трех чисел
*/

public class MinOfThree {
    public static int min(int a, int b, int c) {
        int res = a > b ? b : a;
        return res > c ? c : res;
    }

    public static void main(String[] args) {
        System.out.println(min(1,2,3));
        System.out.println(min(-1,-2,-3));
        System.out.println(min(3,5,3));
        System.out.println(min(5,5,10));
    }
}
