package task02.task0214;

/*
* Написать фукцию, которая возвращает минимум из двух чисел
*/

public class MinOfTwo {

    public static int min(int a, int b) {
        return a > b ? b : a;
    }

    public static void main(String[] args) {
        System.out.println(min(12,33));
        System.out.println(min(-20,0));
        System.out.println(min(-12,-33));
    }


}
