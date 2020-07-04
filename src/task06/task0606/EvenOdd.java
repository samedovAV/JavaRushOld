package task06.task0606;

/*
* Ввести с клавиатуры число. Определить сколько в введенном числе четных цифр, а сколько нечетных.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class EvenOdd {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the number: ");
        int n = Integer.parseInt(reader.readLine());

        while (n > 0) {
            if (n % 2 == 0) {
                even++;
            }
            else if (n % 2 != 0) {
                odd++;
            }

            n = n/10;
        }

        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
