import com.sun.source.doctree.SummaryTree;

import java.util.Arrays;

public class HomeWork2 {
    // Задание 1
    public static void SetArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < 10; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //Задание 2

    public static void SetArray2() {
        int arr2[] = new int[8];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i * 3;
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

    // Задание 3
    public static void SetArray3() {
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < 12; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            }
        }
        for (int i = 0; i < 12; i++) {
            System.out.print(arr3[i] + " ");
        }
    }

    // Задание 4

    public static void SetArray4() {
        int[][] table = new int[10][10];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (i == j) {
                    table[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
    }

    //Задание 5

    public static void SetArray5() {
        int[] arr5 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int min = arr5[0];
        int max = arr5[0];
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] > max) {
                max = arr5[i];

                if (arr5[i] < min) {
                    min = arr5[i];
                }
            }

        }
        System.out.println(min + " " + max + " ");
    }

    //Задание 6

    public static boolean SetArray6(int arr6[]) {
        int leftIndex = 0;
        int rightIndex = arr6.length - 1;
        int leftSum = arr6[leftIndex];
        int rightSum = arr6[rightIndex];
        while (true) {
            if (leftIndex == rightIndex - 1) {
                if (leftSum == rightSum) {
                    return true;
                } else {
                    return false;
                }
            } else {
                if (leftSum <= rightSum) {
                    leftIndex++;
                    leftSum += arr6[leftIndex];
                } else {
                    rightIndex--;
                    rightSum += arr6[rightIndex];
                }
            }
        }
    }



}

