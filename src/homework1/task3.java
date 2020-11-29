package homework1;

import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {
        System.out.println("Рассчитаем результат по формуле a * (b + (c / d))? В качестве входных данных принимаем только целые числа");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 'a'");
        int a = scanner.nextInt();
        System.out.println("Введите число 'b'");
        int b = scanner.nextInt();
        System.out.println("Введите число 'c'");
        int c = scanner.nextInt();
        System.out.println("Введите число 'd'");
        int d = scanner.nextInt();
        double x = (double)c / d;
        double result = a * (b + x);
        System.out.println("Результат = " + result);
    }
}
