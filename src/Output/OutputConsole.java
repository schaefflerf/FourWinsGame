package Output;

import GameManager.Board;

public class OutputConsole implements Drawing
{
    @Override
    public void print() {
        System.out.println("12345678");
        for(int rows = 0; rows < Board.getBoard().length; rows++){
            for(int columns = 0; columns < Board.getBoard()[rows].length; columns++){
                System.out.println(Board.getBoard()[rows][columns]);
            }
        }
        System.out.println("12345678");
    }

    @Override
    public void eventChange() {

    }
}
