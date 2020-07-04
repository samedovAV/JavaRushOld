package task03.task0318;

/*
* Ввести с клавиатуры число и имя, вывести на экран строку:
* "имя" захватит мир через "число" лет.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlanWar {
    public static void main(String[] args) throws IOException {

        System.out.print("Введите имя и на следующей строке года: ");
        BufferedReader readerName = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader readerYears = new BufferedReader(new InputStreamReader(System.in));

        String name = readerName.readLine();
        int years = Integer.parseInt(readerYears.readLine());

        System.out.println(name + " захватит мир через " + years + " лет!");
    }
}
