package homework2;

public class tasks {
    public static void main(String[] args) {
        invertArray();
       fillArray();
       changeArray();
        fillDiagonal();
        findMaxMin();
    }

    public static void invertArray() {
        int[] arr = {0, 1, 0, 0, 0, 1, 1, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.println(arr[i]);
        }
    }

    public static void fillArray() {
        int[] arr = new int[8];
        int x = -3;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = x += 3;
            System.out.println(arr[i]);
        }
    }

        public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 6;
            }
            System.out.println(arr[i]);
        }

    }
    public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length; j < arr[i].length; j++, x--) {
                if (i == j || i == x - 1) arr[i][j] = 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void findMaxMin() {
        int[] a = new int[30];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 1000);
        }
        for (int element : a) {
            System.out.print(element + " ");
        }
        System.out.println();
        int max = a[0];
        for (int i : a) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Максимальное значение:" + max);
        int min = a[1];
        for (int j : a) {
            if (j < min) {
                min = j;
            }
        }
        System.out.println("Минимальное значение:" + min);
    }


}
