package atruck;

import java.awt.Color;

public class TestA {

	public static void main(String[] args) {
		DrawingWindow display = new DrawingWindow(400,300);
		display.setBackground(Color.WHITE);
		
		AbstractTruck a;
		
		a = new GreenTruck(display.getGraphics());
		display.sleep();
		a.translate(25, 25);
		a.resize(225, 150, 150);
		
		a = new BlueTruck(display.getGraphics());
		display.sleep();
		a.translate(25, 25);
		a.resize(225, 150, 150);
		
		a = new RedTruck(display.getGraphics());
		display.sleep();
		a.translate(25, 25);
		a.resize(225, 150, 150);
		
	}

}
