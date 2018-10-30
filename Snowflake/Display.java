/*********************************************
 * Program Name: Display
 * Description: This class will create a panel a frame and 2 borders. The frame will be separated
 * 				into 15
 * Author: Henry Do
 * Date created: 05/10/2018
 **********************************************/
package fills;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Display {
	public static final int WIDTH = 600;
	public static final int HEIGHT = 500;
	public static final int LEFT_X = 750;
	public static final int TOP_Y = 100;

	public static void main(String[] args) {
		new Display();

	}
	public Display() {
		
		//Create a panel
		KochPanel panel = new KochPanel();
		
		//Create 2 different borders
		panel.setBorder(BorderFactory.createLoweredBevelBorder());
		panel.setBorder(BorderFactory.createTitledBorder("SubPanel Border"));
		
		//Create a frame to add the 2 borders in
		JFrame frame = new JFrame(" Triangle Display");
		frame.setLayout(new BorderLayout());
		frame.add(panel, BorderLayout.CENTER);
		frame.add(panel.subPanel, BorderLayout.SOUTH);
		
		//settings for the frame
		frame.setSize(WIDTH,HEIGHT);
		frame.setLocation(LEFT_X, TOP_Y);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
	}

}
