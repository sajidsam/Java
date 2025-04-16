package org.example.chapter8;

import java.util.Scanner;

public class TicTacToe {

    private enum Cell { X, O, EMPTY }

    private Cell[][] board = new Cell[3][3];
    private boolean isPlrOne = true;

    public TicTacToe() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                board[i][j] = Cell.EMPTY;
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        int moves = 0;

        while (true) {
            displayBoard();
            System.out.println("Player " + (isPlrOne ? "1 (X)" : "2 (O)") + ", enter row and column (0-2):");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != Cell.EMPTY) {
                System.out.println("Invalid move. Try again.");
                continue;
            }

            board[row][col] = isPlrOne ? Cell.X : Cell.O;
            moves++;

            if (checkWin()) {
                displayBoard();
                System.out.println("Player " + (isPlrOne ? "1 (X)" : "2 (O)") + " wins!");
                break;
            } else if (moves == 9) {
                displayBoard();
                System.out.println("It's a draw!");
                break;
            }

            isPlrOne = !isPlrOne;
        }
    }

    private boolean checkWin() {
        Cell cur = isPlrOne ? Cell.X : Cell.O;

        for (int i = 0; i < 3; i++)
            if (board[i][0] == cur && board[i][1] == cur && board[i][2] == cur)
                return true;

        for (int j = 0; j < 3; j++)
            if (board[0][j] == cur && board[1][j] == cur && board[2][j] == cur)
                return true;

        if (board[0][0] == cur && board[1][1] == cur && board[2][2] == cur)
            return true;

        if (board[0][2] == cur && board[1][1] == cur && board[2][0] == cur)
            return true;

        return false;
    }

    private void displayBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (board[i][j]) {
                    case X -> System.out.print(" X ");
                    case O -> System.out.print(" O ");
                    case EMPTY -> System.out.print(" - ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.playGame();
    }
}
