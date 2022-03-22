package GameManager;

public class Player {

    private String name;
    private char gameStone;
    private boolean singlePlayer;

    public Player(String name, char gameStone, boolean singlePlayer){
        this.name = name;
        this.gameStone = gameStone;
        this.singlePlayer = singlePlayer;
    }

    public String getName() {
        return name;
    }

    public char getGameStone() {
        return gameStone;
    }

    public boolean isSinglePlayer() {
        return singlePlayer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGameStone(char gameStone) {
        this.gameStone = gameStone;
    }

    public void setSinglePlayer(boolean singlePlayer) {
        this.singlePlayer = singlePlayer;
    }
}
