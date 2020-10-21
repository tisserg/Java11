//package lesson2;
//
//public class lessonExamples {
//
////        int[] a = new int[30];
////        for (int i = 0; i < a.length; i++) {
////            a[i] = (int) (Math.random() * 1000);
////        }
////        for (int element : a) {
////            System.out.print(element + " ");
////        }
////        System.out.println();
////        int max = a[0];
////        for (int i : a) {
////            if (i > max) {
////                max = i;
////            }
////        }
////        System.out.println("Максимальное значение:" + max);
////        int min = a[1];
////        for (int j : a) {
////            if (j < min) {
////                min = j;
////            }
////        }
////        System.out.println("Минимальное значение:" + min);
//        public static void printMatrix(char[][] m) {
//            for (int i = 0; i < m.length; i++) {
//                for (int j = 0; j < m[i].length; j++) {
//                    System.out.printf("%3d", m[i][j]);
//                }
//                System.out.println();
//            }
//        }
//
//    public static void main(String[] args) {
//        int[][] a = new int[9][9];
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                a[i][j] = (i + 1) * (j + 1);
//            }
//        }
//        //printMatrix(a);
//        int n = 4;
//        char [][] t = new char[n][2 * n - 1];
//        for (int i = 0; i < t.length; i++) {
//            for (int j = 0; j < t[i].length; j++) {
//                t[i][j] = ' ';
//            }
//            int start = 0;
//            for (int i = n-1; i >= 0; i--) {
//                for (int j = start; j < t[i].length - start; j++) {
//                    t[i][j] = '*';
//                }
//                start++;
//            }
//            printMatrix(t);
//        }
//
//    }
//}
