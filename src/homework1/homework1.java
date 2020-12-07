package homework1;

public class homework1 {

    public static void main(String[] args) {
        dataTypes();
        checkSum(10, 5);
        checkNumber(5);
        checkNumber2(-5);
        printName("Sergey");
        checkYear(400);
        calculate(1, 2, 3, 2);
    }

    private static void dataTypes() {
        //целые
        byte b = 111;
        short s = 32000;
        int i = 1_999_999_999;
        long l = 1_999_999_999_999_999L;
        System.out.println(b + " " + s + " " + i + " " + l);
        //вещественные - дробные
        float f = 0.1f;
        double d = 0.11;

        boolean bool = true;

        char sym = '$';
    }

    private static float calculate(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    private static boolean checkSum(int a, int b) {
        if (10 < a + b && a + b < 20) {
            return true;
        } else return false;
    }

    private static void checkNumber(int a) {
        if (a >= 0)
            System.out.println(a + " положительное");
        else
            System.out.println(a + " отрицательное");
    }

    private static boolean checkNumber2(int a) {
        return a < 0;
    }

    private static void printName(String name) {
        System.out.println("Привет " + name);
    }

    private static void checkYear (int year) {
        if (year % 4 != 0)
            System.out.println(year + " невисокосный");
        else if (year % 400 == 0)
            System.out.println(year + " високосный");
        else if (year % 100 == 0)
            System.out.println(year + " невисокосный");
        else
            System.out.println(year + " невисокосный");
    }


}
