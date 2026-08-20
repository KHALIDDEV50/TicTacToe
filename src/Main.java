//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Tic Tac Toe!");

        /* ----------Create Code For Tic_Tac_Toe  Plyer------------------- */

        // initialize 2D Array For board
        char[][] board = {{'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'}};
        // call method print board.
        printBoard(board);

    }

    /* ----------Create Methode For This Project--------------------- */

    // Create Method for print board.
    public static void printBoard(char[][] board) {
        System.out.println(board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
        System.out.println("---------");
        System.out.println(board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
        System.out.println("---------");
        System.out.println(board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
    }

}
