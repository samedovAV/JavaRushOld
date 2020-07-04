package task06.task0612;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* Создать класс Calculator, у которого будет 5 статических методов:
* int plus - сумма
* int minus - разность
* int multiply - умножение
* double division - деление
* double percent - b процентов от числа а
*/
public class Calculator {
    public static int plus(int a, int b) {
        return a+b;
    }
    public static int minus(int a, int b) {
        return a-b;
    }
    public static int multiply(int a, int b) {
        return a*b;
    }
    public static double division(int a, int b) {
        return a/b;
    }
    public static double percent(int a, int b) {
        return a * (double)(b/100);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        System.out.println(plus(a,b));
        System.out.println(minus(a,b));
        System.out.println(multiply(a,b));
        System.out.println(division(a,b));

        int b1 = Integer.parseInt(reader.readLine());

        System.out.println(percent(a,b1));
    }
}
