package HomeEdition.java1.lesson3;

import java.util.Scanner;
import java.util.Random;

/**
 * Created by AlexBS on 25.01.2018.
 */
public class homework3 {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = 'O';
    private static final char DOT_EMPTY = '.';
    private static int fieldSizeX;
    private static int fieldSizeY;
    private static char[][] field;
    private static final byte fieldSize = 4;
    private static final byte numberWin = 3;

    private static void initMap() {
        fieldSizeX = fieldSizeY = fieldSize;
        field = new char[fieldSizeY][fieldSizeX];
        for (int i = 0; i < fieldSizeY; i++) {
            for (int j = 0; j < fieldSizeX; j++) field[i][j] = DOT_EMPTY;
        }
    }

    private static void printMap() {
        for (int i = 0; i < fieldSizeY; i++) {
            System.out.print("|");
            for (int j = 0; j < fieldSizeX; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }
    }

    private static void humanTurn(){
        int x, y;
        do {
        System.out.print("Введите координаты Х и У через пробел: ");
        x = SCANNER.nextInt() - 1;
        y = SCANNER.nextInt() - 1;

        } while (!isValidCell(x, y) || !isEmptyCell(x, y));
        field[y][x] = DOT_HUMAN;
    }

    private static boolean isValidCell(int x, int y) {
        return x >= 0 && x < fieldSizeX && y >= 0 && y < fieldSizeY;
    }

    private static boolean isEmptyCell(int x, int y) {
        return field[y][x] == DOT_EMPTY;
    }

    private static void aiTurn() {
        int x, y;
        do {
            x = RANDOM.nextInt(fieldSizeX);
            y = RANDOM.nextInt(fieldSizeY);

        } while (!isEmptyCell(x, y));
        field[y][x] = DOT_AI;
    }

    private static boolean checkWin(char c) {
        /**
         *  checking horizontals / verticals
         */
        boolean checkLineh = true;
        boolean checkLinev = true;
        byte k = 0; // подсчет кол-ва символов
        boolean pr = false; // разрыв последовательности линии

            /** массив 3*3
             * for (int i = 0; i < fieldSize; i++)
             *  if ((field[i][0] == c && field[i][1] == c && field[i][2] == c) ||
             *      (field[0][i] == C && field[1][i] == c && field[2][i] == c))
             */
// не рабочий вариант, в разработке #3 task с кол-вом фишек
        for (int colum = 0; colum < fieldSizeY; colum++) {
            for (int rows = 0; rows < fieldSizeX; rows++) {
                checkLineh = (field[colum][rows] == c);
                if ((pr == false) && (k <= numberWin)) if (checkLineh) {if (k <= numberWin)  k++; else return true;} else pr = true;

//                checkLinev = (field[rows][colum] == c);
//                if (checkLinev && (k > numberWin)) return true; else k++;
            }}
        /**
         *  checking diagonals mas 3*3
         *         for (int i = 0; i < fieldSize; i++) {
         *          for (int j = 0; j < fieldSize - numberWin; j++) {
         *              if (field[i][i] == c && field[i+1][i+1] == c && field[i+2][i+2] == c) return true;
         *              if (field[2][0] == c && field[1][1] == c && field[0][2] == c) return true;
         *       }}
         */

        return false;
    }

    private static boolean isMapFull() {
        for (int i = 0; i < fieldSizeY; i++) {
            for (int j = 0; j < fieldSizeX; j++) {
                if (field[i][j] == DOT_EMPTY)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_HUMAN)) {
                System.out.println("Выиграл человек!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
//            System.out.println("Ход AI");
//            aiTurn();
//            printMap();
//            if (checkWin(DOT_AI)) {
//                System.out.println("Выиграл AI!");
//                break;
//            }
//            if (isMapFull()) {
//                System.out.println("Ничья!");
//                break;
//            }
        }
        SCANNER.close();
    }

}
