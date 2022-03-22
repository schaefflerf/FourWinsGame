package GameManager;

import java.util.ArrayList;

public class Board {
    private int rows = 6;
    private int cols = 8;
    private char[][] board = new char[rows][cols];
    private String currentPlayer;
    private ArrayList<String> playerBase = new ArrayList<>();

    //board-Array mit "." füllen
    public void fillBoard(){

        for(int i = 0; i < rows; i++){
            for(int j = 0; j <  cols; j++){

                board[i][j] = '.';
            }
        }
    }
}
