package games;

import java.awt.Graphics;

public class Game {
	private Board board;
	private LShape piece;
	
	public Game(Display display) {
		board = new Board();
		piece = new LShape(1, Board.WIDTH / 2 -1);
	}
	
	public void draw(Graphics g) {
		board.draw(g);
		if (piece != null) {
			piece.draw(g);
		}
	}
}
