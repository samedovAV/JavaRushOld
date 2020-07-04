package task03.task0301;

/*
* Реализовать метод public static void div(int a, int b)
* Метод должен делить первое число на второе и выводить на экран результат деления
* На экран должно быть выведено целое число
*/

public class SharingIsUseful {
    public static void main(String[] args) {
        div(6,3);
        div(10,6);
        div(2,4);
    }

    public static void div(int a, int b) {
        int c = a/b;
        System.out.println(c);
    }
}
