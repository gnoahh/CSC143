package games;
import java.awt.Color;
import java.awt.Graphics;

public class Square {
	private int row; //row Location on board
	private int column; //column location on board
	private Color color; //color of square
	
	public static int WIDTH = 20;
	public static int HEIGHT = 20;
	
	public Square(int row, int col, Color c) {
		this.row = row;
		this.column = col;
		this.color = c;
		
	}
	
	public void draw(Graphics g) {
		
		int x = Board.LEFT + row * WIDTH; //calculate the upper left
		int y = Board.TOP + column * HEIGHT; //calculate the upper top
		
		g.setColor(color);;
		g.fillRect(x,  y,  WIDTH,  HEIGHT); //color of the filled square
		g.setColor(Color.BLACK); 		  //color of the square
		g.drawRect(x, y, WIDTH,  HEIGHT); //black border of squares
		
	}

}
