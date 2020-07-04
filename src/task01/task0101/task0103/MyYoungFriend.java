package task01.task0101.task0103;

/*
Сейчас 3126 год. Мой друг родился 8 лет назад.
Написать программу, выводящую на экран год рождения моего друга.
*/

public class MyYoungFriend {
    public static void main(String[] args) {
        int year = 3126;
        int dif = 8;
        System.out.println("Friend was born in " + (year - dif));
    }
}
