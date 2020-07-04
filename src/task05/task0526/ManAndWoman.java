package task05.task0526;

/*
* 1. Внутри класса создать public static классы Man и Woman
* 2. У классов должны быть поля: name(String), age(int), address(String).
* 3. Создать конструкторы, в которые передаются все возможные параметры.
* 4. Создать по два объекта каждого класса со всеми данными используя конструктор.
* 5. Вывести объекты на экран в формате: name + " " + age + " " + address
*/

public class ManAndWoman {

    public static class Man {
        private String name;
        private int age;
        private String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }

    public static class Woman {
        private String name;
        private int age;
        private String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }

    public static void main(String[] args) {
        Man kolya = new Man("Kolya", 23,"Mirnanya");
        Man vasya = new Man("Vasya", 24, "Zarya");

        Woman lena = new Woman("Lena", 22, "Stud");
        Woman katya = new Woman("Katya", 21, "Kievskaya");

        System.out.println(kolya.getName() + " " + kolya.getAge() + " " + kolya.getAddress());
        System.out.println(vasya.getName() + " " + vasya.getAge() + " " + vasya.getAddress());
        System.out.println(lena.getName() + " " + lena.getAge() + " " + lena.getAddress());
        System.out.println(katya.getName() + " " + katya.getAge() + " " + katya.getAddress());
    }
}
