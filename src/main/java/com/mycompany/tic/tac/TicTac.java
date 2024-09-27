/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tic.tac;

/**
 *
 * @author Minindu
 */
import java.util.*;

public class TicTac {

    public static void main(String[] args) {
        final int ROWS = 3;
        final int COLS = 3;
        final int CELL_WIDTH = 5;

        String[][] data = {
            {"1", "2", "3"},
            {"4", "5", "6"},
            {"7", "8", "9"}
        };
        Scanner input = new Scanner(System.in);
        System.out.println("Tic-Tac-Toe Game");
        printGame(data);
        printHorizontalBorder(COLS, CELL_WIDTH);
        L1:
        do {
            System.out.print("Please Choose Your Character (X/O) :");
            String option = input.next().toUpperCase();
            switch (option) {
                case "X":
                    doAgainPlayer1(data);
                    for (int i = 0; i < 4; i++) {
                        doAgainPlayer2(data);
                        doAgainPlayer1(data);
                    }
                    break;
                case "O":
                    doAgainPlayer2(data);
                    for (int i = 0; i < 4; i++) {
                        doAgainPlayer1(data);
                        doAgainPlayer2(data);
                    }
                    break;
                default:
                    System.out.println("Invalid Input...");
                    continue L1;
            }
            System.out.println("Game Is Draw....You couldn't won the Game....");
            System.exit(0);
        } while (true);
    }

    private static void printHorizontalBorder(int cols, int cellWidth) {
        for (int i = 0; i < cols; i++) {
            System.out.print("+");
            for (int j = 0; j < cellWidth; j++) {
                System.out.print("-");
            }
        }
        System.out.println("+");
    }

    public static void printGame(String[][] data) {
        for (int i = 0; i < 3; i++) {
            printHorizontalBorder(3, 5);
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.printf(" %2S  |", data[i][j]);
            }
            System.out.println();
        }

    }

    public static void checkWinRow(String[][] ar) {
        String total = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                total += ar[i][j];
            }
            switch (total) {
                case "XXX":
                    System.out.println("Game Over.. Player 1 is Won");
                    break;
                case "OOO":
                    System.out.println("Game Over.. Player 2 is Won");
                    break;
            }
        }

    }

    public static void checkWinCol(String[][] ar) {
        String total = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                total += ar[j][i];
            }
            switch (total) {
                case "XXX":
                    System.out.println("Game Over.. Player 1 is Won");
                    System.exit(0);
                    break;
                case "OOO":
                    System.out.println("Game Over.. Player 2 is Won");
                    System.exit(0);
                    break;
            }
        }
    }

    public static void checkPrimary(String[][] ar) {
        String total = "";
        for (int i = 0; i < 3; i++) {
            total += ar[i][i];
        }
        switch (total) {
            case "XXX":
                System.out.println("Game Over.. Player 1 is Won");
                System.exit(0);
                break;
            case "OOO":
                System.out.println("Game Over.. Player 2 is Won");
                System.exit(0);
                break;
        }

    }

    public static void checkSecond(String[][] ar) {
        String total = "";
        for (int i = 0; i < 3; i++) {
            total += ar[i][3 - 1 - i];
        }
        switch (total) {
            case "XXX":
                System.out.println("Game Over.. Player 1 is Won");
                System.exit(0);
                break;
            case "OOO":
                System.out.println("Game Over.. Player 2 is Won");
                System.exit(0);
                break;
        }

    }

    public static void doAgainPlayer1(String[][] data) {
        final int ROWS = 3;
        final int COLS = 3;
        final int CELL_WIDTH = 5;
        Scanner input = new Scanner(System.in);
        System.out.println("Wellcome Player 1... You Have X value ");
        System.out.print("Please select Your Box...(1,2,3,4,5,6,7,8,9)");
        String boxvaluep1 = input.next().toUpperCase();
        switch (boxvaluep1) {
            case "1":
                if (data[0][0] != "X" && data[0][0] != "O") {
                    data[0][0] = "X";
                    allMethods(data, COLS, CELL_WIDTH);
                } else {
                    System.out.println("Input is already included. Please Try again another one...");
                    doAgainPlayer1(data);
                }
                break;

            case "2":
                if (data[0][1] != "X" && data[0][1] != "O") {
                    data[0][1] = "X";
                    allMethods(data, COLS, CELL_WIDTH);
                } else {
                    System.out.println("Input is already included. Please Try again another one...");
                    doAgainPlayer1(data);
                }
                break;
            case "3":
                if (data[0][2] != "X" && data[0][2] != "O") {
                    data[0][2] = "X";
                    allMethods(data, COLS, CELL_WIDTH);
                } else {
                    System.out.println("Input is already included. Please Try again another one...");
                    doAgainPlayer1(data);
                }
                break;
            case "4":
                if (data[1][0] != "X" && data[1][0] != "O") {
                    data[1][0] = "X";
                    allMethods(data, COLS, CELL_WIDTH);
                } else {
                    System.out.println("Input is already included. Please Try again another one...");
                    doAgainPlayer1(data);
                }
                break;
            case "5":
                if (data[1][1] != "X" && data[1][1] != "O") {
                    data[1][1] = "X";
                    allMethods(data, COLS, CELL_WIDTH);
                } else {
                    System.out.println("Input is already included. Please Try again another one...");
                    doAgainPlayer1(data);
                }
                break;
            case "6":
                if (data[1][2] != "X" && data[1][2] != "O") {
                    data[1][2] = "X";
                    allMethods(data, COLS, CELL_WIDTH);
                } else {
                    System.out.println("Input is already included. Please Try again another one...");
                    doAgainPlayer1(data);
                }
                break;
            case "7":
                if (data[2][0] != "X" && data[2][0] != "O") {
                    data[2][0] = "X";
                    allMethods(data, COLS, CELL_WIDTH);
                } else {
                    System.out.println("Input is already included. Please Try again another one...");
                    doAgainPlayer1(data);
                }
                break;
            case "8":
                if (data[2][1] != "X" && data[2][1] != "O") {
                    data[2][1] = "X";
                    allMethods(data, COLS, CELL_WIDTH);
                } else {
                    System.out.println("Input is already included. Please Try again another one...");
                    doAgainPlayer1(data);
                }
                break;
            case "9":
                if (data[2][2] != "X" && data[2][2] != "O") {
                    data[2][2] = "X";
                    allMethods(data, COLS, CELL_WIDTH);
                } else {
                    System.out.println("Input is already included. Please Try again another one...");
                    doAgainPlayer1(data);
                }
                break;
            default:
                System.out.println("Invalid Letter...");
                doAgainPlayer1(data);
                break;
        }
    }

    public static void allMethods(String[][] data, int COLS, int CELL_WIDTH) {
        printGame(data);
        printHorizontalBorder(COLS, CELL_WIDTH);
        checkWinRow(data);
        checkWinCol(data);
        checkPrimary(data);
        checkSecond(data);
    }

    public static void doAgainPlayer2(String[][] data) {
        final int ROWS = 3;
        final int COLS = 3;
        final int CELL_WIDTH = 5;
        Scanner input = new Scanner(System.in);
        System.out.print("Wellcome Player 2... You Have O value \n");
        System.out.print("Please select Your Box...(1,2,3,4,5,6,7,8,9)");
        String boxvaluep2 = input.next().toUpperCase();
        switch (boxvaluep2) {
            case "1":
                if (data[0][0] != "X" && data[0][0] != "O") {
                    data[0][0] = "O";
                    allMethods(data, COLS, CELL_WIDTH);
                } else {
                    System.out.println("Input is included.Please try again onther one.");
                    doAgainPlayer2(data);
                }
                break;

            case "2":
                if (data[0][1] != "X" && data[0][1] != "O") {
                    data[0][1] = "O";
                    allMethods(data, COLS, CELL_WIDTH);
                } else {
                    System.out.println("Input is included.Please try again onther one.");
                    doAgainPlayer2(data);
                }
                break;
            case "3":
                if (data[0][2] != "X" && data[0][2] != "O") {
                    data[0][2] = "O";
                    allMethods(data, COLS, CELL_WIDTH);
                } else {
                    System.out.println("Input is included.Please try again onther one.");
                    doAgainPlayer2(data);
                }
                break;

            case "4":
                if (data[1][0] != "X" && data[1][0] != "O") {
                    data[1][0] = "O";
                    allMethods(data, COLS, CELL_WIDTH);
                } else {
                    System.out.println("Input is included.Please try again onther one.");
                    doAgainPlayer2(data);
                }
                break;

            case "5":
                if (data[1][1] != "X" && data[1][1] != "O") {
                    data[1][1] = "O";
                    allMethods(data, COLS, CELL_WIDTH);
                } else {
                    System.out.println("Input is included.Please try again onther one.");
                    doAgainPlayer2(data);
                }
                break;
            case "6":
                if (data[1][2] != "X" && data[1][2] != "O") {
                    data[1][2] = "O";
                    allMethods(data, COLS, CELL_WIDTH);
                } else {
                    System.out.println("Input is included.Please try again onther one.");
                    doAgainPlayer2(data);
                }
                break;
            case "7":
                if (data[2][0] != "X" && data[2][0] != "O") {
                    data[2][0] = "O";
                    allMethods(data, COLS, CELL_WIDTH);
                } else {
                    System.out.println("Input is included.Please try again onther one.");
                    doAgainPlayer2(data);
                }
                break;
            case "8":
                if (data[2][1] != "X" && data[2][1] != "O") {
                    data[2][1] = "O";
                    allMethods(data, COLS, CELL_WIDTH);
                } else {
                    System.out.println("Input is included.Please try again onther one.");
                    doAgainPlayer2(data);
                }
                break;
            case "9":
                if (data[2][2] != "X" && data[2][2] != "O") {
                    data[2][2] = "O";
                    allMethods(data, COLS, CELL_WIDTH);
                } else {
                    System.out.println("Input is included.Please try again onther one.");
                    doAgainPlayer2(data);
                }
                break;
            default:
                System.out.println("Invalid Letter...");
                doAgainPlayer2(data);
                break;

        }

    }

}
