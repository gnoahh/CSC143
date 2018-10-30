/*********************************************
 * Program Name: SierpinskiPanel
 * Description: This class overrides paintComopenet method to create the very first form 
 * 				of the the triangle, has an drawTriangle method to recursively draw more or less
 * 				triangles accordingly when users click on the buttons
 * 				this class also has a constructor to construct buttons labels. This constructor implements
 * 				actionlistener to the plus and minus buttons 
 * 
 * Author: Henry Do
 * Date created: 05/17/2018
 **********************************************/
package fills;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SierpinskiPanel extends JPanel{
	private static final long serialVersionUID = 1L;
	public static final int WIDTH = Display.WIDTH - 25;
	public static final int HEIGHT = Display.HEIGHT - 100;
	private int level;
	private JButton plusbutton;
	private JButton minusbutton;
	private JLabel label;
	public JPanel subPanel;
	public SierpinskiPanel() {
		
		//create new objects 
		level = 1;
		subPanel = new JPanel();
		plusbutton = new JButton("+");
		minusbutton = new JButton("-");
		
		label = new JLabel("n: " + level);
		

		//Add actionlistener to plus button to adjust the level accordingly 
		plusbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				level++;
				label.setText("n :" + level);
			}

		});
		
		//Add actionlistener to minus button to adjust the level accordingly
		minusbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if(level > 1)
				level--;
				label.setText("n :" + level);
			}

		});
		
		
		
		//add buttons and label to the subPanel
		subPanel.add(plusbutton);
		subPanel.add(minusbutton);
		subPanel.add(label);

		

	
	}
	
	//Set up the very first triangle and draw it 
	public void paintComponent(Graphics pen) {
		 super.paintComponent(pen);
		 Point p1 = new Point(WIDTH / 2, 10);
		 Point p2 = new Point(25, HEIGHT -25);
		 Point p3 = new Point(WIDTH - 25, HEIGHT - 25);
		 drawTriangle(pen, level, p1, p2, p3);
    }
	
	
	
	//This is a recursive method drawing smaller triangles each time users click on the plus 
	//button or adjust the triangles accordingly
	public void drawTriangle(Graphics pen, int level, Point p1, Point p2, Point p3) {
		if (level == 1) {
            // This is a base case
            Polygon p = new Polygon();
            p.addPoint(p1.x, p1.y);
            p.addPoint(p2.x, p2.y);
            p.addPoint(p3.x, p3.y);
            pen.fillPolygon(p);
        } else {
            //This is to to find mid points of p1 p2 p3
            Point p4 = midPoint(p1, p2);
            Point p5 = midPoint(p2, p3);
            Point p6 = midPoint(p1, p3);

            //calling itself recursive to draw the triangle
            drawTriangle(pen,level - 1, p1, p4, p6);
            drawTriangle(pen,level - 1, p4, p2, p5);
            drawTriangle(pen,level - 1, p6, p5, p3);
        }
		repaint();
		
	}
	
	//This method is to find the mid point of 2 points and return
	public Point midPoint(Point p1, Point p2) {
		return new Point((p1.x + p2.x)/2, (p1.y + p2.y)/2 );
	}


}
