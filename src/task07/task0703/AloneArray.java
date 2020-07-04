package task07.task0703;

/*
* Создать массив на 10 строк.
* Создать массив на 10 чисел.
* Ввести с клавиатуры 10 строк, заполнить ими массив строк.
* В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает
* с текущим индексом из массива чисел.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AloneArray {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] strArray = new String[10];
        int[] numArray = new int[10];

        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = reader.readLine();

            for (int j = 0; j < numArray.length; j++) {
                if (i == j) {
                    numArray[j] = strArray[i].length();
                }
            }
        }

        for (int n = 0; n < numArray.length; n++) {
            System.out.println(numArray[n]);
        }

        reader.close();
    }
}
