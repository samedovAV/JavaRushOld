package task04.task0437;

/*
* Используя цикл for вывести на экран прямоугольный треугольник
* из восьмерок со сторонами 10 и 10
*/

public class EightRectangle {
    public static void main(String[] args) {


        for (int i = 1;i < 11;i++) {
            for (int j=0;j<i;j++) {
                System.out.print("8");
            }
            System.out.print("\n");
        }
    }
}
