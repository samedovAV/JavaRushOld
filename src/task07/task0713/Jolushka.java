package task07.task0713;

/*
* Ввести с клавиатуры 20 чисел, сохранить в список и рассортировать по трем другим спискам:
* - Число нацело делится на 3
* - Число нацело делится на 2
* - Число нацело делится на 2 и на 3 (попадает в оба списка)
* Метод printList должен выводить на экран все элементы списка с новой строки
* Вывести x%3, x%2, потом последний
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Jolushka {
    public static void printList(ArrayList<Integer> list) {
        for (Integer x : list) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> listIntro = new ArrayList<>();

        ArrayList<Integer> listMod2 = new ArrayList<>();
        ArrayList<Integer> listMod3 = new ArrayList<>();
        ArrayList<Integer> listOthers = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            listIntro.add(Integer.parseInt(reader.readLine()));
        }

        for (int j = 0; j < listIntro.size(); j++) {
            if (listIntro.get(j) % 2 == 0) {
                listMod2.add(listIntro.get(j));
            }
            else if (listIntro.get(j) % 3 == 0) {
                listMod3.add(listIntro.get(j));
            }
            else if ((listIntro.get(j) % 2 == 0) && (listIntro.get(j) % 3 == 0)) {
                listMod2.add(listIntro.get(j));
                listMod3.add(listIntro.get(j));
            }
            else {
                listOthers.add(listIntro.get(j));
            }
        }

        System.out.println("First: ");
        printList(listMod3);
        System.out.println("Second: ");
        printList(listMod2);
        System.out.println("Others: ");
        printList(listOthers);
    }


}
