package homework1;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        System.out.println("Проверим условие 10 <= a + b <= 20");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 'a'");
        int a = scanner.nextInt();
        System.out.println("Введите число 'b'");
        int b = scanner.nextInt();
        int result = a + b;
        if (10 <= result && result<= 20) {
            System.out.println("true");
        } else {
        System.out.println("false");
        }
    }
}
