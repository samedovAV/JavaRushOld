package task07.task0716;

/*
* Создать список слов
* Метод fix должен:
*  - удалять из списка слова с буквой "р"
*  - удваивать все слова с буквой "л"
*  - "р" и "л" - ничего не делать
*  - с остальными тоже ничего не делать
*/

import java.util.ArrayList;

public class Words {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");

        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    private static ArrayList<String> fix(ArrayList<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            String s = strings.get(i);

            if (s.contains("р") && s.contains("л")) {
                continue;
            }
            if (s.contains("р")) {
                strings.remove(i);
                i--;
                continue;
            }
            else if (s.contains("л")) {
                strings.add(i+1, strings.get(i));
                i++;
            }
        }
        return strings;
    }
}
