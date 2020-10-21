package homework1;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        System.out.println("Проверка числа. Положительное или отрицательное");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int a = scanner.nextInt();
        if (a >= 0)
        {
            System.out.println("Число: " + a + " положительное");
        } else {
            System.out.println("Число: " + a + " отрицательное");
        }
    }
}