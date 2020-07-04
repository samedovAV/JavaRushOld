package task04.task0414;

/*
* Ввести с клавиатуры год, определить количество дней в году. Результат вывести на экран.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DaysInYear {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(reader.readLine());

        countDays(year);
    }

    private static void countDays(int year) {
        if (year % 400 == 0) {
            System.out.println("Високосный");
        }
        else if (year % 100 == 0) {
            System.out.println("Обычный");
        }
        else if (year % 4 == 0) {
            System.out.println("Високосный");
        }
        else {
            System.out.println("Високосный");
        }
    }
}
