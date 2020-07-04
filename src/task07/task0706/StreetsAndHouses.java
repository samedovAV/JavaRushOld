package task07.task0706;

/*
* Создать массив на 15 целых чисел
* Ввести в него числа с клавиатуры
* Пусть индекс элемента - номер дома
* Значение - число жителей
* Дома с нечетными номерами расположены на одной стороне, с четными - на другой
* Вывести на экран сообщение, где проживает больше жителей.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreetsAndHouses {
    public static void main(String[] args) throws IOException {
        int[] inhabitants = new int[15];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < inhabitants.length; i++) {
            inhabitants[i] = Integer.parseInt(reader.readLine());
            //inhabitants[i] = (int)(Math.random()*100);
        }

        int evenSum = 0;
        int oddSum = 0;
        evenSum += inhabitants[0];
        for (int i = 1; i < inhabitants.length; i++) {

            if (i % 2 == 0) {
                evenSum += inhabitants[i];
            } else {
                oddSum += inhabitants[i];
            }
        }

        String res = evenSum > oddSum ? "В домах с четными номерами проживает больше жителей " + evenSum : "В домах с нечетными номерами проживает больше жителей " + oddSum;
        System.out.println(res);
        reader.close();
    }
}
