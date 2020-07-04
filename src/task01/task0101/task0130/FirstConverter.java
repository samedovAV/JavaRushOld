package task01.task0101.task0130;

/*
* Метод convertCelsiusToFahrenheit(int celsius) принимает значение в градусах Цельсия.
* Метод должен переводить температуру и возвращать значение в градусах Фаренгейта.
* Соотношение: TF = (9/5) * TC + 32
*/

public class FirstConverter {
    public static void main(String[] args) {
        System.out.println(convertCelsiusToFahrenheit(41));
    }
    public static double convertCelsiusToFahrenheit(int celsius) {
        double tf = 9 / 5 * celsius + 32;
        return tf;
    }
}
