package com.nalif73;

import java.util.Random;
import java.util.Scanner;

public class Lesson04 {
    public static void main(String[] args) {

        start(5);
    }

    static void start(int size) {
        char[][] field = getField(size);

        do {
            handlePlayerMove(field);
            drawField(field);

            if (checkFinal(field, 'X')) {
                break;
            }

            System.out.println();

            handleAIMove(field);
            drawField(field);

            if (checkFinal(field, 'O')) {
                break;
            }

        } while (true);
    }

    static boolean checkFinal(char[][] field, char sign) {
        if (checkWin(field, sign)) {
            String name = sign == 'X' ? "Player" : "Computer";
            System.out.printf("Congrats!!! %s is winner!%n", name);
            return true;
        }
        if (isDraw(field)) {
            System.out.println("There is draw!!!");
            return true;
        }
        return false;
    }

    static boolean isDraw(char[][] field) {
        int moves = field.length * field.length;

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] != emptySymbol()) {
                    moves--;
                }
            }
        }

        return moves == 0;
    }

    static boolean checkWin(char[][] field, char sign) {
        boolean f;

        // horizontal
        for (int i = 0; i < field.length; i++) {
            f = true;
            for (int j = 0; j < field[i].length; j++)
                if (!(field[i][j] == sign && f)) f = false;
            if (f) return true;
        }

        // vertical
        for (int j = 0; j < field[0].length; j++) {
            f = true;
            for (int i = 0; i < field.length; i++)
                if (!(field[i][j] == sign && f)) f = false;
            if (f) return true;
        }

        // diagonals 1
        f = true;
        for (int i = 0; i < field.length; i++)
            if (!(field[i][i] == sign && f)) f = false;
        if (f) return true;

        // diagonals 2
        f = true;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++)
                if ((i + j) == field.length - 1)
                    if (!(field[i][j] == sign && f)) f = false;
        }
        if (f) return true;

        return false;
    }

    static void handleAIMove(char[][] field) {
        Random random = new Random();
        int x, y;
        do {
            x = random.nextInt(field.length);
            y = random.nextInt(field.length);
        } while (isEmptyCoordinates(field, x, y));
        field[x][y] = 'O';
    }

    static void handlePlayerMove(char[][] field) {
        int x, y;
        do {
            System.out.println("Please choose coordinates [X, Y]...");
            x = chooseCoordinate('X', field.length);
            y = chooseCoordinate('Y', field.length);
        } while (isEmptyCoordinates(field, x, y));
        field[x][y] = 'X';
    }

    static boolean isEmptyCoordinates(char[][] field, int x, int y) {
        return field[x][y] != emptySymbol();
    }

    static int chooseCoordinate(char sign, int size) {
        Scanner scanner = new Scanner(System.in);
        int coordinate;

        do {
            System.out.printf("Please enter %s-coordinate [Range 1...%d]...%n", sign, size);
            coordinate = scanner.nextInt() - 1;
        } while (coordinate < 0 || coordinate > size - 1);

        return coordinate;
    }

    static char[][] getField(int size) {
        char[][] field = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                field[i][j] = emptySymbol();
            }
        }
        return field;
    }

    static char emptySymbol() {
        return '-';
    }

    static void drawField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }
}
