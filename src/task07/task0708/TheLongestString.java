package task07.task0708;

/*
* Создать список строк
* Считать 5 строк с клавиатуры и добавить в список
* Используя цикл, найти самую длинную строку в цикле
* Вывести ее на экран. Если таких несколько, то вывести все
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TheLongestString {

    private static ArrayList<String> strings = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }

        int max = 0;
        // String maxStr = "";
        for (int j = 0; j < strings.size(); j++) {
            if (strings.get(j).length() > max) {
                max = strings.get(j).length();
            }
        }

        for (String string : strings) {
            if (max == string.length()) {
                System.out.println(string);
            }
        }
    }
}
