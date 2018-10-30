/**************************
 * Program Name : CounterDisplay 
 * Description: TThis class will create yellow button,yellow label, blue button and blue label and also listens
 * 				for user click on which button to change color accordingly. It will utilize the anonymous class to do listen for actions
 * Author: Henry Do
 * Group : Henry Do, Brian Nguyen, Thao Truong
 * Date created: 05/02/2018
 ****************************/
package anonymous;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel{
	private static final long serialVersionUID = 1L;
	private int yesVotes;
	private int noVotes;
	private JButton yellowButton;
	private JButton blueButton;
	private JLabel yellowLabel;
	private JLabel blueLabel;
	public ButtonPanel() {
		
		yellowButton = new JButton("Yellow Button");
		blueButton = new JButton("Blue Button");
		
		
		yellowButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				setBackground(Color.ORANGE);
			}
		});
		blueButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				setBackground(Color.GREEN);
			}
		});;
		
		yellowLabel = new JLabel("Go Yellow");
		blueLabel = new JLabel("Go Blue");
		
		setBackground(Color.GRAY);
		add(yellowButton);
		add(yellowLabel);
		add(blueButton);
		add(blueLabel);
	}
	
			
		
		
	}


