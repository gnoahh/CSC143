/*********************************************
 * Program Name: KochPanel
 * Description: This class overrides paintComopenet method to create the very first form 
 * 				of the snow flakes, has an drawEdge method to recursively draw more or less forms 
 * 				of the snow flakes accordingly when users click on the buttons
 * 				this class also has a constructor to construct buttons labels. This constructor implements
 * 				actionlistener to the plus and minus buttons  
 * 
 * Author: Henry Do
 * Date created: 05/17/2018
 **********************************************/
package fills;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KochPanel extends JPanel {
		private static final long serialVersionUID = 1L;
		public static final int WIDTH = Display.WIDTH - 25;
		public static final int HEIGHT = Display.HEIGHT - 100;
		private int level; //set beginning order
		private JButton plusbutton, minusbutton;
		private JLabel label;
		public JPanel subPanel;
		
		//Constructor will 
		public KochPanel() {
			
			//Create button and label objects
			//Initilize the level
			level = 1;
			subPanel = new JPanel();
			plusbutton = new JButton("+");
			minusbutton = new JButton("-");
			label = new JLabel("n: " + level);
			
			
			//Add actionlistener to the plus button to adjust the level accordingly
			plusbutton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					level++;
					label.setText("n: " + level);
		}
		});
			
			//Add actionlistener to the minus button to adjust the level accordingly
			minusbutton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					if(level > 1) {
						level--;
						label.setText("n: " + level);
		}
		}
		} );
		
			//add buttons and label to the sub panel
			subPanel.add(plusbutton);
			subPanel.add(minusbutton);
			subPanel.add(label);
		}
		
		//This method will call set up the initial triangle and 
		//draw the very first shape of the snow flake 
		public void paintComponent(Graphics g) {
			Graphics2D pen = (Graphics2D) g;
			super.paintComponent(g);
			Point2D.Double p1 = new Point2D.Double(WIDTH / 2, 10);
			Point2D.Double p2 = new Point2D.Double(85, HEIGHT - 85);
			Point2D.Double p3= new Point2D.Double(WIDTH - 85, HEIGHT - 85);
			drawEdge(pen, level, p1, p2);
			drawEdge(pen, level, p2, p3);
			drawEdge(pen, level, p3, p1);
		 }
		
		
		public void drawEdge(Graphics2D pen, int level, Point2D p1, Point2D p2){
		//create the base triangle
			if (level == 1){
				Line2D.Double line = new
				Line2D.Double(p1.getX(), p1.getY(), p2.getX(),p2.getY());
				pen.draw(line);
			}else {
		//Algorithm to calculate the distance between points
				Point2D.Double distance = new Point2D.Double(p2.getX() - p1.getX(), p2.getY() - p1.getY());
				Point2D.Double p4 = new Point2D.Double(p1.getX() + distance.getX()/3, p1.getY() +distance.getY()/3);
				Point2D.Double p5 = new Point2D.Double((p1.getX() + p2.getX())/2 - distance.getY()*Math.sqrt(3)/6,(p1.getY() + p2.getY())/2 +distance.getX()*Math.sqrt(3)/6 );
				Point2D.Double p6 = new Point2D.Double(p1.getX() + 2*distance.getX()/3, p1.getY() +2*distance.getY()/3);
		//This is to call itself recursively to draw snow flakes
				drawEdge(pen, level - 1, p1, p4);
				drawEdge(pen, level - 1, p4, p5);
				drawEdge(pen, level - 1, p5, p6);
				drawEdge(pen, level - 1, p6, p2);
		}
			repaint();
		}

}
