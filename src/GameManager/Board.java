package GameManager;

import java.util.ArrayList;

public class Board {
    private static int rows = 6;
    private static int cols = 8;
    private static char[][] board = new char[rows][cols];
    private static String currentPlayer;
    private static ArrayList<String> playerBase = new ArrayList<>();

    //board-Array mit "." füllen
    public static void fillBoard(){

        for(int i = 0; i < rows; i++){
            for(int j = 0; j <  cols; j++){

                board[i][j] = '.';
            }
        }
    }

    public static char[][] getBoard() {
        return board;
    }
}
