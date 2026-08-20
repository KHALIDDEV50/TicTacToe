import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*---------------------*");
        System.out.println("Welcome to Tic Tac Toe!");
        System.out.println("*---------------------*");


        /* ----------Create Code For Tic_Tac_Toe  Plyer------------------- */

        // initialize 2D Array For board
        char[][] board = {{'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'}};
        // call method print board.
        printBoard(board);

        // call method for  player Move Position
        playerMove(board);

        // call method for print Position For player Move
        printBoard(board);

        // call method for  computer Move print
        computerMove(board);

        // call method for print Position For Computer Move
        printBoard(board);


    }

    /* ----------Create Methode For This Project--------------------- */

    // Create Method for print board.
    public static void printBoard(char[][] board) {

        System.out.println("   "+board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
        System.out.println("   ---------");
        System.out.println("   "+board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
        System.out.println("   ---------");
        System.out.println("   "+board[2][0] + " | " + board[2][1] + " | " + board[2][2]);

    }
// Create Method for Player Move board.

    public static void playerMove(char[][] board) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your position: ");
        int position = input.nextInt();

        int row = (position - 1) / 3;
        int col = (position - 1) % 3;

        while (board[row][col] == 'X' || board[row][col] == 'O') {

            System.out.println("Position is not available!");
            System.out.print("Enter another position: ");

            position = input.nextInt();

            row = (position - 1) / 3;
            col = (position - 1) % 3;
        }

        board[row][col] = 'X';
    }

    // Create Method for Computer Move board.
    static void computerMove(char[][] board) {

        Random random = new Random();

        int position = random.nextInt(9) + 1;

        int row = (position - 1) / 3;
        int col = (position - 1) % 3;

        while (board[row][col] == 'X' || board[row][col] == 'O') {

            position = random.nextInt(9) + 1;

            row = (position - 1) / 3;
            col = (position - 1) % 3;
        }

        board[row][col] = 'O';

        System.out.println("Computer chose: " + position);
    }

}
