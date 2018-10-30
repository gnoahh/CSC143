/**************************
 * Program Name : CounterDisplay 
 * Description: This class will create a button object from buttonpanel and add it to the frame for the user to
 * 				click on and change the color of the background
 * Author: Henry Do
 * Group : Henry Do, Brian Nguyen, Thao Truong
 * Date created: 05/02/2018
 ****************************/
package anonymous;

import javax.swing.JFrame;

public class ButtonDisplay {

	public static void main(String[] args) {
		
		ButtonPanel b = new ButtonPanel();
		JFrame f = new JFrame();
		
		f.add(b);
		f.setTitle("Changing button color");
		f.setSize(300,200);
		f.setLocation(750, 100);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
