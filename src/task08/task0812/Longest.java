package task08.task0812;

/*
* Создать список чисел
* Добавить 10 с клавиатуры
* Вывести на экран длину самой длинной последовательности повторяющихся чисел
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Longest {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(bufferedReader.readLine()));
        }
        int count = 1;
        int result = 1;

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i + 1).equals(list.get(i))) {
                count++;
                if (result < count) result = count;

            } else count = 1;
        }
        System.out.println(result);
    }
}
