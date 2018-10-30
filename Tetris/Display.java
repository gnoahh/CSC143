package games;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class Display extends JPanel{
	private static final long serialVersionUID = 1L;
	
	private static final int WIDTH = 400;
	private static final int HEIGHT = 550;
	private static final int X_ORIGIN = 750;
	private static final int Y_ORIGIN = 100;
	private JFrame window;
	private Game game;
	public Display() {
		window = new JFrame();
		game = new Game(null);
		window.add(this);
		window.setTitle("Grame Display");
		window.setSize(WIDTH, HEIGHT);
		window.setLocation(X_ORIGIN, Y_ORIGIN);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
		Color GREY = new Color(225,225,225);
		setBackground(Color.WHITE);
	}
	public static void main(String[] args) {
		new Display();
		
	
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		game.draw(g);
		update();
	}
	
	public void update(){
		repaint();
	}

}
