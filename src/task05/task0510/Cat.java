package task05.task0510;

/*
* Создать класс Cat с пятью инициализаторами:
* Имя;
* Имя, вес, возраст;
* Имя, возраст (вес стандартный);
* Вес, цвет (бездомный кот);
* Вес, цвет, адрес (чужой домашний кот).
*/

public class Cat {
    String name;
    int age;
    int weight;
    String address;
    String color;

    public void initialize(String name) {
        this.name = name;
        this.age = 10;
        this.weight = 12;
        this.color = "white";
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "white";
    }

    public void initialize(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public void initialize(String address, int weight, String color) {
        this.address = address;
        this.weight = weight;
        this.color = color;
    }


    public static void main(String[] args) {

    }
}
