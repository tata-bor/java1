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
}
