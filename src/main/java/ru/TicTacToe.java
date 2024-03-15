package ru;


// За проектом трудились с командой , Кристина , Артём и Жавохир!

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    private static final Random RANDOM = new Random();
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final char HUMAN = 'X';
    private static final char AI = '0';
    private static final char DOT_EMPTY = '.';
    private static char[][] field;
    private static final int SIZE_X = 3;
    private static final int SIZE_Y = 3;

    private static void initialize(){
        field = new char[SIZE_X][SIZE_Y];
        for (int x = 0; x < SIZE_X; x++) {
            for (int y = 0; y < SIZE_Y; y++) {
                field[x][y] = DOT_EMPTY;
            }
        }
    }
    private static void printField(){
        System.out.print("+");
        for (int i = 0; i < SIZE_X * 2 + 1; i++){
            System.out.print((i % 2 == 0) ? "-" : i / 2 + 1);
        }
        System.out.println();
        for (int i = 0; i < SIZE_X; i++){
            System.out.print(i + 1 + "|");

            for (int j = 0; j < SIZE_Y; j++){
                System.out.print(field[i][j] + "|");
            }
                System.out.println();
        }
        for (int i = 0; i < SIZE_X * 2 + 2; i++){
            System.out.print("-");
        }
        System.out.println();
    }
    private static void humanTurn(){
        int x, y;
        do {
            System.out.print("Введите координаты Х и Y от 1 до 3 \n -> ");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
            System.out.println("Введенные координаты заняты либо введите правильные координаты");
        } while (!isCellEmpty(x, y) && !isCellValid(x, y));

        field[x][y] = HUMAN;
    }
    private static boolean isCellEmpty(int x, int y){
        return field[x][y] == DOT_EMPTY;
    }
    private static boolean isCellValid(int x, int y){
        return (((x & y) <= SIZE_X) && (x & y) > 0);
    }
    private static void aiTurn(){
        int x, y;
        do {
            x = RANDOM.nextInt(3);
            y = RANDOM.nextInt(3);
        } while (!isCellEmpty(x, y));
        field[x][y] = AI;

    }
    private static boolean gameCheck(char symbol, String text){
        if (checkWin(symbol)){
            System.out.println(text);
            return true;
        }
        if (checkDraw()){
            System.out.println("Draw!");
            return true;
        }
        return false;
    }
    private static boolean checkDraw(){
        for (int x = 0; x < SIZE_X; x++) {
            for (int y = 0; y < SIZE_Y; y++) {
                if (isCellEmpty(x, y))
                    return false;
            }
        }
        return true;
    }

    /***
     *
     * @param symbol принемает символ!
     * @return возвращает выигрышную комбинацию (true || false)
     */

    // Оптимизировали метод checkWin
    private static boolean checkWin(char symbol){
        for (int x = 0; x < SIZE_X; x++) {
            if (field[x][0] == symbol && field[x][1] == symbol && field[x][2] == symbol)
                return true;
            if (field[0][x] == symbol && field[1][x] == symbol && field[2][x] == symbol)
                return true;
        }
        return (field[0][0] == symbol && field[1][1] == symbol && field[2][2] == symbol) ||
                (field[0][2] == symbol && field[1][1] == symbol && field[2][0] == symbol);
    }

    public static void main(String[] args) {
        initialize();
        printField();

        while (true){
            humanTurn();
            printField();
            if (gameCheck(HUMAN, "You WIN!"))
                break;

            aiTurn();
            printField();
            if (gameCheck(AI, "AI WIN!"))
                break;
        }
    }


}

