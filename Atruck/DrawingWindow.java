/*********************************************
 * Program Name: DrawingWindow
 * Description: LAB1B
 * Author: Henry Do
 * Date created: 04/09/2018
 **********************************************/
package atruck;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
public class DrawingWindow {

		private JFrame frame;

		private static final int FRAME_WIDTH = 200;
		private static final int FRAME_HEIGHT = 300;
		private static final int FRAME_X_ORIGIN = 800;
		private static final int FRAME_Y_ORIGIN = 100;
		
		public DrawingWindow() {
			frame = new JFrame ();
			frame.setTitle("drawing Window");
			frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
			frame.setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
	}
		public DrawingWindow(int width, int height) {
			frame = new JFrame ();
			frame.setTitle("Drawing Window");
			frame.setSize(width,height);
			frame.setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
			
		}
		
		public void setBackground(Color c) {
			frame.getContentPane().setBackground(c);
		}
		
		public Graphics getGraphics() {
			return frame.getContentPane().getGraphics();
		}
		
		public void sleep() {
			try {Thread.sleep(500);}
			catch (Exception e) {}
			}
		


}
