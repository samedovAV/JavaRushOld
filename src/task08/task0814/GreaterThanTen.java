package task08.task0814;

/*
* Создать множество чисел (Set<Integer>)
* Занести 20 чисел
* Удалить из множества все числа больше 10
*/

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class GreaterThanTen {
    public static Set<Integer> createSet() {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 1; i < 21; i++) {
            // set.add(0 + (int) (Math.random() * 20));
            set.add(i);
        }

        for (int item : set) {
            System.out.print(item + " ");
        }
        return set;
    }

    public static Set<Integer> removeGreaterTen(Set<Integer> set) {
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            //если значение больше 10, то удаляем и переходим к следующему
            if (iterator.next()>10) iterator.remove();
        }

        System.out.println();

        for (int item : set) {
            System.out.print(item + " ");
        }

        return set;
    }

    public static void main(String[] args) {
        createSet();
        System.out.println();
        removeGreaterTen(createSet());
    }
}
