package homework1;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        System.out.println("Проверим условие: a < 0");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 'a'");
        int a = scanner.nextInt();
        boolean isTrue = true;
        boolean isFalse = false;
        if (a < 0) {
            System.out.println(isTrue);
        } else {
            System.out.println(isFalse);
        }
    }
}

