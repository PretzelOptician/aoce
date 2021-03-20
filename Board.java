import java.awt.*;
import java.util.Arrays;

import javax.swing.JFrame;

public class Board {
    //state
    public String size; 
    public static OctagonTile[] octagonsA;
    public static OctagonTile[] octagonsB;
    public static SquareTile[] squaresA;
    public static SquareTile[] squaresB; 
    public final static int TILE_PARAMETER = 50; 
    public final static Dimension DIMENSION = new Dimension(3200, 1800); 
    //behavior
    //main method
    public static void main(String[] args) {
        Board mainBoard = new Board("tiny"); 
        JFrame mainframe = new JFrame("Age of Colonial Empire"); 
        Canvas graphics = new DisplayGraphics(); 
        graphics.setSize(DIMENSION); 
        mainframe.setSize(DIMENSION);
        mainframe.add(graphics); 
        System.out.println(Arrays.toString(octagonsB));
        mainframe.setLayout(null);
        mainframe.setVisible(true);
    }
    //constructors
    public Board() {
        this.size = "small";
    }
    public Board(String size) {
        this.size = size; 
        if (size.equals("tiny")) { //"tiny" is 9x5 octA, 8x4 octB, 9x4 sqA, 8x5 sqB
            octagonsA = new OctagonTile[45]; 
            octagonsB = new OctagonTile[32]; 
            squaresA = new SquareTile[36]; 
            squaresB = new SquareTile[40]; 
            int countOctA = 0;
            int countOctB = 0; 
            int countSqA = 0; 
            int countSqB = 0; 
            for(int xPosition = 1; xPosition<10; xPosition++) {
                for(int yPosition=1; yPosition<6; yPosition++) {
                    octagonsA[countOctA] = new OctagonTile(2*xPosition-2, 2*yPosition-2); 
                    countOctA += 1; 
                }
            }
            for(int x = 1; x<9; x++) {
                for(int y=1; y<5; y++) {
                    octagonsB[countOctB] = new OctagonTile(2*x-1, 2*y-1); 
                    countOctB += 1; 
                }
            }
            for(int x = 1; x<10; x++) {
                for(int y=1; y<5; y++) {
                    squaresA[countSqA] = new SquareTile(2*x-2, 2*y-1); 
                    countSqA += 1; 
                }
            }
            for(int x = 1; x<9; x++) {
                for(int y=1; y<6; y++) {
                    squaresB[countSqB] = new SquareTile(2*x-1, 2*y-2); 
                    countSqB += 1; 
                }
            }
        }
        
    }
}
