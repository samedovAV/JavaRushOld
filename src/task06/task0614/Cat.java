package task06.task0614;

/*
* В классе Cat добавить публичную статическую переменную cats(ArrayList<Cat>)
* Пусть при каждом создании кота (нового объекта Cat) в переменную cats добавляется этот новый кот.
* Создать 10 объектов Cat.
* Метод printCats должен выводить всех котов на экран. Нужно использовать переменную cats.*/

import java.util.ArrayList;

public class Cat {

    public static ArrayList<Cat> cats = new ArrayList<Cat>();
    String name;

    public Cat(String name) {
        this.name = name;
    }

    public static void printCats() {
        String names = "";
        for (Cat name: cats) {
            names = names + name.name + " ";
        }
        System.out.println("All cats: " + names);
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Vaska");
        cats.add(cat);

        Cat cat1 = new Cat("Murka");
        cats.add(cat1);

        printCats();
    }
}
