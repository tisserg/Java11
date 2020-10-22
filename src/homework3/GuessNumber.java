package homework3;

import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = (int) (Math.random() * 10);
        System.out.println("Введите число от 0 до 9:");
        for (int counter = 0; counter <= 2; counter++) { // это глупое решение. пока не понял как сделать правильно
            int number1 = sc.nextInt();
            if (number1 == answer) {
                System.out.println("Вы выиграли!");
                break;
            } else if (number1 > answer) {
                System.out.println("Загаданное число меньше, чем " + number1 + "\n" + "Хотите сыграть ещё раз? 1 — да, 0 — нет");
            } else
                System.out.println("Загаданное число больше, чем " + number1 + "\n" + "Хотите сыграть ещё раз? 1 — да, 0 — нет");
            if (counter == 2) {
                System.out.println("Попыток больше не осталось");
                break;
            }
            int choice = sc.nextInt();
            if (choice == 1)
                System.out.println("Продолжаем игру. Введите число:");
            else if (choice == 0) {
                System.out.println("Ок, больше не играем");
            } else {
                System.out.println("Сказано было, написать 1 или 0. Больше не играем с вами");//тупое решение)). не захотел усложнять код
                break;
            }

        }
    }

}


