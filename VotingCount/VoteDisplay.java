/********************
 * Program: VoteDisplay
 * Description: This class is main class creating objects and initilize the settings for these objects
 * Group 6: Brian Nguyen, Henry Do, Thao Truong
 * Author: Henry Do
 * Date: 05/02/18
 *********************/
package anonymous;
import javax.swing.JFrame;

public class VoteDisplay {

	public static void main(String[] args) {
		//Create objects
		VotingPanel v = new VotingPanel();
		JFrame f = new JFrame();
		
		//Add object v to the frame f
		f.add(v);
		
		//Set title, size, location and make it visible and also allows users to close the program
		f.setTitle("Vote Count");
		f.setSize(300, 100);
		f.setLocation(750, 100);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

}
