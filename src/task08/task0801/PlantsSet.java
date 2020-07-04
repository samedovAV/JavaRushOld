package task08.task0801;

/*
* Создать коллекцию Set (реализация HashSet) с типом элементов String
* Добавить в нее 10 строк
* Вывести на экран
*/

import java.util.HashSet;
import java.util.Set;

public class PlantsSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        set.add("ежевика");
        set.add("женьшень");
        set.add("земляника");
        set.add("ирис");
        set.add("картофель");

        for (String item : set) {
            System.out.println(item);
        }
    }
}
