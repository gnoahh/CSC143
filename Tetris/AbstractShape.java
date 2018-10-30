package games;

import java.awt.Color;
import java.awt.Graphics;

public class AbstractShape {
	public static final int ELEMENTS = 4;
	public Square [] square = new Square[ELEMENTS];
	public static final Color ZSHAPE = Color.red,
							  SQUARESHAPRE = Color.GRAY,
							  JSHAPE = Color.BLUE,
							  TSHAPE = Color.YELLOW,
							  SSHAPE = Color.GREEN,
							  BARSHAPE = Color.CYAN,
							  LSHAPE = Color.MAGENTA;
	
	public void draw (Graphics g) {
		for ( int i = 0; i < ELEMENTS; i++) {
			square[i].draw(g);;
		}
	}
							
}
