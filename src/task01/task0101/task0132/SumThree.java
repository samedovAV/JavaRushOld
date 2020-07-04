package task01.task0101.task0132;

/*
 * Написать код метода sumDigitsInNumber(int number).
 * Метод на вход принимает целое трехзначное число. Нужно посчитать сумму цифр и ее вернуть
 */

public class SumThree {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int sum = 0;

        sum = sum + number % 10;
        number = number / 10;
        sum = sum + number % 10;
        number = number / 10;
        sum = sum + number % 10;

        return sum;
    }

}
