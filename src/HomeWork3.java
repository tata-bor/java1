import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {

    //  Задание 1

    public static Scanner EnterNumber = new Scanner(System.in);

    public static void GuessNumber() {
        Random rand = new Random();
        int random = rand.nextInt(10);

        for (int i = 0; i < 3; i++) {
            System.out.println("Угадайте число от 0 до 9.");
            int input = EnterNumber.nextInt();
            if (input == random) {
                System.out.println("Поздравляем! Вы угадали!");
                break;
            }
            if (input < random) {
                System.out.println("Загаданное число больше.");
            }
            if (input > random) {
                System.out.println("Загаданное число меньше.");
            }
            if (i == 2) {
                System.out.println("Вы не угадали. Загаданное число " + random);
            }
        }
        System.out.println("Повторить игру еще раз?");
            int input = EnterNumber.nextInt();
            if (input == 1) {
                GuessNumber();
            }
    }
}

