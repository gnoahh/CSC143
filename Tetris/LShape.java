package games;
import java.awt.Color;
import java.awt.Graphics;

public class LShape extends AbstractShape{
	public LShape(int r, int c) {
		
		//Create the squares
		square[0] = new Square(r - 1, c, 	LSHAPE);
		square[1] = new Square(r    , c, 	LSHAPE);
		square[2] = new Square(r + 1, c, 	LSHAPE);
		square[3] = new Square(r + 1, c + 1,LSHAPE);
		
		//draws the game piece
		
		}

}
