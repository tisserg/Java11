package homework1;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        System.out.println("Проверим условие, указанный вами год високосный или нет?");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите год");
        int year = scanner.nextInt();
        if (year % 4 != 0) {
            System.out.println(year + " — невисокосный год");
        } else if (year % 400 == 0) {
            System.out.println(year + " — високосный год");
        } else if (year % 100 == 0) {
            System.out.println(year + " — невисокосный год");
        } else {
            System.out.println(year + " — високосный год");
        }
    }
}
