
public class OctagonTile {
    //state
    private int xPos; 
    private int yPos; 
    //behavior
    
    //constructors
    public OctagonTile(int x, int y) {
        this.xPos = x; 
        this.yPos = y; 
    }
    @Override
    public String toString() {
        return "OctagonTile [xPos=" + xPos + ", yPos=" + yPos + "]";
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }
}
