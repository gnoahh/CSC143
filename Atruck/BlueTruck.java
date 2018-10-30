package atruck;
/**************************
 * Program Name : BlueTruck
 * Description: LAB3A
 * Author: Henry Do
 * Date created: 04/12/2018
 ****************************/
import java.awt.Color;
import java.awt.Graphics;

public class BlueTruck extends AbstractTruck{
	BlueTruck(Graphics graphic) {
		System.out.println("Blue Truck is Activated");
		this.g = graphic;
	}
	
	public void translate(int x, int y) {
		g.setColor(Color.BLUE);
		g.fillRect(x, y, 100, 50);;
		
		g.setColor(Color.BLACK);
		g.fillOval(x + 10, y + 40, 20, 20);
		g.fillOval(x+ 70, y+40, 20, 20);
		
		g.setColor(Color.GRAY);
		g.fillRect(x + 70, y + 10, 30, 20);
		
	}

	public void resize(int x, int y, int size) {
		g.setColor(Color.BLUE);
		g.fillRect( x,  y,  size,  size/2);
		
		g.setColor(Color.BLACK);
		g.fillOval( x + size/10,  y + 2 * size/5,  size/5,  size/5);
		g.fillOval( x + 7 * size/10,  y + 2 * size/5,  size/5, size/5);
		
		g.setColor(Color.GRAY);
		g.fillRect( x + 7 * size/10, y + size/10, 3 * size/10, size/5);
		
	}

}
