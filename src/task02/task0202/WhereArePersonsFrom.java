package task02.task0202;

/*
* В классе Person объявить следующие переменные:
* name типа String
* age типа int
* weight типа int
* money типа int
* В методе main создать объект Person, занести его ссылку в переменную person
* */

public class WhereArePersonsFrom {
    public static void main(String[] args) {
        Person person = new Person();

        person.name = "Alex";
        System.out.println(person.name);
    }
    public static class Person {
        String name;
        int age;
        int weight;
        int money;
    }
}
