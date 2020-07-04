package task05.task0502;

/*
* Реализовать метод boolean fight(Cat anotherCat):
* реализовать механизм драки котов в зависимости от их веса, возраста и силы.
* Нужно сравнить каждый критерий по отдельности, и победителем будет тот, у которого больше критериев.
* Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.
* Если ничья и никто не выиграл, возвращаем либо true, либо false, но должно выполняться условие:
* если cat1.fight(cat2) - true
* то cat2.fight(cat1) - false*/

public class RealiseFightMethod {

    public static class Cat {
        public int age;
        public int weight;
        public int strength;

        public Cat() {

        }

        public boolean fight(Cat anotherCat) {
            int winFirst = 0;
            int winSecond = 0;

            if (this.age > anotherCat.age) {
                winFirst++;
            }
            else {
                winSecond++;
            }

            if (this.strength > anotherCat.strength) {
                winFirst++;
            }
            else {
                winSecond++;
            }

            if (this.weight > anotherCat.weight) {
                winFirst++;
            }
            else {
                winSecond++;
            }

            if (winFirst > winSecond) {
                return true;
            }
            else {
                return false;
            }
        }

    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
    }
}
