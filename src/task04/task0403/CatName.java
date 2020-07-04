package task04.task0403;

/*
* Помогите коту обрести имя с помощью метода setName
*/

public class CatName {
    private String name = "Cat without name";

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        CatName cat = new CatName();
        cat.setName("Vaska");
        System.out.println("Cat's name is " + cat.name);
    }
}
