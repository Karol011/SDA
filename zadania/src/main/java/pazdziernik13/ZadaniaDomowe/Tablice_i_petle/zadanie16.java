package sda.pl.javagda34.pazdziernik13.ZadaniaDomowe.Tablice_i_petle;

import java.util.Scanner;

/*
*** Zaimplementuj grę w kółko i krzyżyk na planszy 3x3 użyj tablic dwuwymiarowych.
Pozwól użytkownikowi wybrać czy gra kółkiem czy krzyżykiem, dla uproszczenia wybór
pola dokonaj poprzez pobranie pojedynczej liczby, tak jak pokazane na obrazku niżej. Po
każdym wyborze wyświetl zaktualizowaną planszę gry.
 */
public class zadanie16 {
    public static char[][] board = new char[3][3];
    public static Scanner scanner = new Scanner(System.in);
    public static int row, column;
    public static char turn = 'x';

    public static void main(String[] args) {
        initializeBoard();
        chooseCharacter();
        play();
    }

    public static char[][] initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }

        }
        return board;
    }

    public static void printBoard() {
        System.out.println("/---|---|---\\");
        System.out.println("| " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + " |");
        System.out.println("/---|---|---\\");
    }

    public static char chooseCharacter() {
        System.out.println("choose your character 'x' or 'o'");
        turn = scanner.next().charAt(0);
        return turn;
    }



    public static void play() {
        boolean isPlaying = true;
        while (isPlaying) {
            System.out.println("Player: " + turn);
            System.out.println("type line");
            row = scanner.nextInt() - 1;
            System.out.println("type column ");
            column = scanner.nextInt() - 1;
            board[row][column] = turn;
            if (isGameOver(row, column)) {
                isPlaying = false;
                System.out.println("Gratulations player " + turn + " wins!");
            }

            printBoard();
            if (turn == 'x') {
                turn = 'o';
            } else {
                turn = 'x';
            }
        }
    }

    public static boolean isGameOver(int rowMove, int columnMove) {
        //checking if columns are the same
        if (board[0][columnMove] == board[1][columnMove] && board[0][columnMove] == board[2][columnMove]) {
            return true;
        }
        //checking if rows are the same
        if (board[rowMove][0] == board[rowMove][1] && board[rowMove][0] == board[rowMove][2]) {
            return true;
        }//checking if diagonal is the same
        if (board[0][0] == 'x' && board[1][1] == 'x' && board[2][2] == 'x') {
            return true;
        }
        if (board[0][0] == 'o' && board[1][1] == 'o' && board[2][2] == 'o') {
            return true;
        }
        if (board[0][2] == 'x' && board[1][1] == 'x' && board[2][0] == 'x') {
            return true;
        }
        if (board[0][2] == 'o' && board[1][1] == 'o' && board[2][0] == 'o') {
            return true;
        }
        return false;


    }
}

