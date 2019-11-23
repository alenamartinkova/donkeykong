package sample.players;

public class Player {
    private int xPos, yPos;
    private int dX, dY;

    public Player(int x, int y) {
        this.xPos = x;
        this.yPos = y;

    }

    public void update() {
        this.xPos += this.dX;
        this.yPos += this.dY;
    }
}
