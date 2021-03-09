import HomeWork8.IContinueGame;
import HomeWork8.MyWindow;

import java.util.Random;
import java.util.Scanner;

public class HomeWork4 implements IContinueGame {
    private static final char X = 'X';
    private static final char O = '0';
    private static final char DEFAULT = '_';
    private static final char DELIMITER = '|';
    private static final int SIZE_MAP = 3;
    private Random rand = new Random();
    // 0 - default, 1 - x, 2 - 0
    private int[][] map = new int[SIZE_MAP][SIZE_MAP];
    private MyWindow window;

    // Запуск игры

    public void Run() {
        System.out.println ("Вы в игре Крестики Нолики.");
        window = new MyWindow(map, this);
        DrawMap();
    }

    // Ход компьютера

    private void AITurn() {
        while (true) {
            int x = rand.nextInt(SIZE_MAP);
            int y = rand.nextInt(SIZE_MAP);
            if (map[x][y] == 0) {
                map[x][y] = 2;
                return;
            }
        }
    }

    // Расчет поличества свободных ячеек

    private int CalcUnusedCells() {
        int result = 0;
        for (int y = 0; y < SIZE_MAP; y++) {
            for (int x = 0; x < SIZE_MAP; x++) {
                if (map[x][y] == 0) {
                    result++;
                }
            }
        }
        return result;
    }

    // Проверка победы игрока с номером player

    private boolean CheckVictory(int player) {
        return CheckHorizontalVictory(player)
                || CheckVerticalVictory(player)
                || CheckDiagonal(player);
    }

    // Проверка победы по диагонали

    private boolean CheckDiagonal(int player) {
        for (int index = 0; index < SIZE_MAP; index++) {
            if (map[index][index] != player) {
                break;
            }
            if (index == SIZE_MAP - 1) {
                return true;
            }
        }
        for (int index = 0; index < SIZE_MAP; index++) {
            if (map[index][SIZE_MAP - index - 1] != player) {
                break;
            }
            if (index == SIZE_MAP - 1) {
                return true;
            }
        }
        return false;
    }

    // Проверка победы по горизонтали

    private boolean CheckHorizontalVictory(int player) {

        for (int y = 0; y < SIZE_MAP; y++) {
            for (int x = 0; x < SIZE_MAP; x++) {
                if (map[x][y] != player)
                    break;
                if (x == SIZE_MAP - 1) {
                    return true;
                }
            }
        }
        return false;
    }

    // Проверка победы по вертикали

    private boolean CheckVerticalVictory(int player) {

        for (int x = 0; x < SIZE_MAP; x++) {
            for (int y = 0; y < SIZE_MAP; y++) {

                if (map[x][y] != player)
                    break;
                if (y == SIZE_MAP - 1) {
                    return true;
                }
            }
        }
        return false;
    }

    // Отображение поля

    private void DrawMap() {
        window.Redraw(map);
 /*       for (int y = 0; y < SIZE_MAP; y++) {
            System.out.print(DELIMITER);
            for (int x = 0; x < SIZE_MAP; x++) {

                switch (map[x][y]) {
                    case 0:
                        System.out.print(DEFAULT);
                        break;
                    case 1:
                        System.out.print(X);
                        break;
                    case 2:
                        System.out.print(O);
                        break;
                }

                System.out.print(DELIMITER);
            }
            System.out.println();
        }

  */
    }

    @Override
    public void Execute() {

        DrawMap();

        if (CheckVictory(1)) {
            System.out.println("Победа!");
            return;
        }

        if (CalcUnusedCells() == 0) {
            System.out.println("Ничья");
            return;
        }
        AITurn();
        DrawMap();

        if (CheckVictory(2)) {
            System.out.println("Лузер!");
            return;
        }

    }
}

