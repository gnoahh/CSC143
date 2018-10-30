/*********************************************
 * Program Name: TrianglePanel
 * Description: This class will create a sub panel with a button and label in it 
 * 				the class also create a triangle and display it
 * 				it will utilize a recursive method to draw sierpinaski triangles when 
 * 				user hits the button.
 * Author: Henry Do
 * Date created: 05/08/2018
 **********************************************/
package sierpinski;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TrianglePanel extends JPanel{
	
	private static final long serialVersionUID = 1L;
	public static final int WIDTH = Display.WIDTH -25;
	public static final int HEIGHT = Display.HEIGHT - 75;
	
	private int order;
	private JButton button;
	private JButton button2;
	private JLabel label;
	public JPanel subPanel;
	private Point p0, p1, p2;
	private Polygon triangle;
	
	//Check the boundaries of the display
	public TrianglePanel() {
		
		//Initialize and create objects 
		order = 1;
		subPanel = new JPanel();
		button = new JButton("+");
		button2 = new JButton("-");
		label = new JLabel("n: " + order);
		
		//Implement actionlistener to update the order and label every
		//time user clicks on the button
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				order++;
				label.setText("n :" + order);
			}

		});
		
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if(order >= 2)
				order--;
				label.setText("n :" + order);
			}

		});
		
		//add button and label to the subPanel
		subPanel.add(button);
		subPanel.add(button2);
		subPanel.add(label);

		//Display triangle
		setTriangle();
		

	
		
	}
	
	public Polygon[] createTriangles(Polygon triangle) {
		p0 = new Point(triangle.xpoints[0], triangle.ypoints[0]);
		p1 = new Point(triangle.xpoints[1], triangle.ypoints[1]);
		p2 = new Point(triangle.xpoints[2], triangle.ypoints[2]);
		
		//get the midpoint on each edge in the triangle
		Point m01 = midPoint(p0, p1);
		Point m12 = midPoint(p1, p2);
		Point m20 = midPoint(p2, p0);
		
		//arrays to store x y coordinates 
		int[] t0X = {p0.x, m01.x, m20.x};
		int[] t0Y = {p0.y, m01.y, m20.y};
		
		int[] t1X = {m01.x, p1.x, m12.x};
		int[] t1Y = {m01.y, p1.y, m12.y};
		
		int[] t2X = {m20.x, m12.x, p2.x};
		int[] t2Y = {m20.y, m12.y, p2.y};
		
		//Create 3 triangles
		Polygon triangle0 = new Polygon(t0X, t0Y, 3);
		Polygon triangle1 = new Polygon(t1X, t1Y, 3);
		Polygon triangle2 = new Polygon(t2X, t2Y, 3);
		
		//an array to store 3 triangles
		Polygon[] three = {triangle0, triangle1, triangle2};
		
		//Return the 3 triangles
		return three;
		
	}
	public void paintComponent(Graphics pen) {
		displayTriangles(pen, triangle, order);
	}
	public void setTriangle() {
		
		int[] x = {WIDTH / 2, 25, WIDTH - 25};
		int[] y = {10, HEIGHT - 25, HEIGHT - 25};
		triangle = new Polygon(x, y, 3);
	}
	
	//Set a new order
	public void drawTriangle(Graphics pen, int level, Point p1, Point p2, Point p3) {
		Polygon triangle = new Polygon();
		triangle.addPoint(p1.x, p1.y);
		triangle.addPoint(p2.x, p2.y);
		triangle.addPoint(p3.x, p3.y);
		
		if(level == 1) {
			pen.fillPolygon(triangle);
			
		}
		else {
			Point p4 = midPoint(p1,p2);
			Point p5 = midPoint(p2,p3);
			Point p6 = midPoint(p1,p3);
			triangle.addPoint(p4.x, p4.y);
			triangle.addPoint(p5.x, p5.y);
			triangle.addPoint(p6.x, p6.y);
			drawTriangle(pen, level -1, p1, p4, p6);
			drawTriangle(pen, level -1, p4, p2, p5);
			drawTriangle(pen, level -1, p6, p5, p3);
		}
		repaint();
		
	}
	public void displayTriangles(Graphics pen, Polygon triangle, int order) {
		//recursive algorithm to draw triangles accordingly
		
		if(order == 0) {
			setTriangle();
			pen.drawPolygon(triangle);
			
		}else {
			
			Polygon[] sierpinaski = createTriangles(triangle);
			
			displayTriangles(pen, sierpinaski[0], order - 1);
			displayTriangles(pen, sierpinaski[1], order - 1);
			displayTriangles(pen, sierpinaski[2], order - 1);
			
			pen.drawPolygon(sierpinaski[0]);
			pen.drawPolygon(sierpinaski[1]);
			pen.drawPolygon(sierpinaski[2]);
		}
		repaint();
		
	}
	//this method is to find the midpoint between 2 points
	public Point midPoint(Point p1, Point p2) {
		return new Point((p1.x + p2.x)/2, (p1.y + p2.y)/2 );
	}
	

}
