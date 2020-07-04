package task04.task0436;

/*
* Ввести с клавиатуры два числа m,n
* Используя цикл for вывести на экран прямогольник размером m*n из восьмерок
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DrawRectangle {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("input m: ");
        int m = Integer.parseInt(reader.readLine());
        System.out.print("input n: ");
        int n = Integer.parseInt(reader.readLine());

        while (m > 0) {
            for (int i = 0;i<n;i++) {
                System.out.print("8");
            }

            m--;
            System.out.print("\n");
        }
    }
}
