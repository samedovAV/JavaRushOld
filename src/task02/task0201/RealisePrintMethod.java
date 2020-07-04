package task02.task0201;

/*
* Дописать код в методе print, чтобы он выводил
* каждую на экран каждую переданную в него строку 4 раза.
* Каждый раз с новой строки*/

public class RealisePrintMethod {
    public static void main(String[] args) {
        print("First call");
    }

    public static void print(String s) {
        for (int i = 0; i < 4; i++) {
            System.out.println(s);
        }
    }
}
