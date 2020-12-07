package homework2;

import java.util.Arrays;

public class homework2 {

    public static void main(String[] args) {
        int [] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        task1(arr1);
        int [] arr2 = new int[8];
        arr2 [0] = 1;
        task2(arr2);
        int [] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        task3(arr3);
        task4();


    }
    private static void task1 (int [] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) {
                arr1[i] = 1;
            }
            else arr1[i] = 0;
        }
    }

    private static void task2 (int [] arr2) {
        for (int i = 1; i < arr2.length ; i++) {
            arr2[i] = arr2[i - 1] + 3;
        }
        System.out.println(Arrays.toString(arr2));
    }

    private static void task3 (int [] arr3) {
        for (int i = 0; i < arr3.length; i++) {
            if ( arr3[i] < 6)
                arr3[i] = arr3[i] * 2;
        }
        System.out.println(Arrays.toString(arr3));
    }

    private static void task4 () {
        int[][] arr4 = new int[4][4];
         for (int i = 0; i < arr4.length; i++) {
            for (int j = 0, x = arr4[i].length; j < arr4[i].length; j++, x--) {
                if (i == j || i == x - 1) arr4[i][j] = 1;
                System.out.print(arr4[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

}
