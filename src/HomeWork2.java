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
            System.out.println (arr [i]);
        }
    }
}
