package games;
import java.awt.Color;
import java.awt.Graphics;

public class GameBoard {
	public static final int HEIGHT = 20;
	public static final int WIDTH = 10;
	public static final int THICKNESS = 5;
	
	public static final int LEFT = 100;
	public static final int TOP = 50;
	
	//public static final Color EMPTY = Color.LIGHT_GRAY;
	
	//acts like a set method
	public GameBoard() {
		
	}
	public void draw (Graphics g) {
		g.setColor(Color.BLACK);;
		g.fillRect(LEFT - THICKNESS, TOP, THICKNESS, HEIGHT * Square.HEIGHT);
		g.fillRect(LEFT + WIDTH * Square.WIDTH, TOP, THICKNESS, HEIGHT * Square.HEIGHT);
		g.fillRect(LEFT - THICKNESS, TOP + HEIGHT * Square.HEIGHT , WIDTH * Square.WIDTH + 2 * THICKNESS , THICKNESS);
	}
}
