import java.awt.Canvas;
import java.awt.Graphics;

public class DisplayGraphics extends Canvas {
    public void paint(Graphics g) {
        int TILE_PARAMETER = Board.TILE_PARAMETER; 
        for(OctagonTile octagon : Board.octagonsA) {
            double X = TILE_PARAMETER/(Math.sqrt(2)) + octagon.getxPos()/2*(TILE_PARAMETER + (2*(TILE_PARAMETER/(Math.sqrt(2))) + TILE_PARAMETER)); 
            double Y = (2*(TILE_PARAMETER/(Math.sqrt(2))) + 2*TILE_PARAMETER) * octagon.getyPos()/2; 
            int intRX = (int) X;
            int intRY = (int) Y; 
            int deltaPoint = (int) ((int) TILE_PARAMETER/Math.sqrt(2)); 
            g.drawLine(intRX, intRY, intRX+TILE_PARAMETER, intRY);
            g.drawLine(intRX, intRY, intRX-deltaPoint, intRY+deltaPoint);
            g.drawLine(intRX-deltaPoint, intRY + deltaPoint, intRX - deltaPoint, intRY + deltaPoint + TILE_PARAMETER); 
            g.drawLine(intRX-deltaPoint, intRY+deltaPoint+TILE_PARAMETER, intRX, intRY+2*deltaPoint+TILE_PARAMETER);
            g.drawLine(intRX, intRY+2*deltaPoint+TILE_PARAMETER, intRX+TILE_PARAMETER, intRY+2*deltaPoint+TILE_PARAMETER);
            g.drawLine(intRX+TILE_PARAMETER, intRY+2*deltaPoint+TILE_PARAMETER, intRX+TILE_PARAMETER+deltaPoint, intRY+deltaPoint+TILE_PARAMETER);
            g.drawLine(intRX+TILE_PARAMETER+deltaPoint, intRY+deltaPoint+TILE_PARAMETER, intRX+TILE_PARAMETER+deltaPoint, intRY+deltaPoint); 
            g.drawLine(intRX+TILE_PARAMETER, intRY, intRX+TILE_PARAMETER+deltaPoint, intRY+deltaPoint);
        }
        for(OctagonTile octagon : Board.octagonsB) {
            double X = (2*(TILE_PARAMETER/(Math.sqrt(2)) + TILE_PARAMETER/2) + (octagon.getxPos()-1)/2*(TILE_PARAMETER + (2*(TILE_PARAMETER/(Math.sqrt(2))) + TILE_PARAMETER)));
            double Y = (TILE_PARAMETER/(Math.sqrt(2)) + TILE_PARAMETER) + (2*(TILE_PARAMETER/(Math.sqrt(2))) + 2*TILE_PARAMETER) * (octagon.getyPos()-1)/2; 
            int intRX = (int) Math.round(X);
            int intRY = (int) Math.round(Y); 
            int deltaPoint = (int) ((int) TILE_PARAMETER/Math.sqrt(2)); 
            g.drawLine(intRX, intRY, intRX+TILE_PARAMETER, intRY);
            g.drawLine(intRX, intRY, intRX-deltaPoint, intRY+deltaPoint);
            g.drawLine(intRX-deltaPoint, intRY + deltaPoint, intRX - deltaPoint, intRY + deltaPoint + TILE_PARAMETER); 
            g.drawLine(intRX-deltaPoint, intRY+deltaPoint+TILE_PARAMETER, intRX, intRY+2*deltaPoint+TILE_PARAMETER);
            g.drawLine(intRX, intRY+2*deltaPoint+TILE_PARAMETER, intRX+TILE_PARAMETER, intRY+2*deltaPoint+TILE_PARAMETER);
            g.drawLine(intRX+TILE_PARAMETER, intRY+2*deltaPoint+TILE_PARAMETER, intRX+TILE_PARAMETER+deltaPoint, intRY+deltaPoint+TILE_PARAMETER);
            g.drawLine(intRX+TILE_PARAMETER+deltaPoint, intRY+deltaPoint+TILE_PARAMETER, intRX+TILE_PARAMETER+deltaPoint, intRY+deltaPoint); 
            g.drawLine(intRX+TILE_PARAMETER, intRY, intRX+TILE_PARAMETER+deltaPoint, intRY+deltaPoint);
        }
    }
}
