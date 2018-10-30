/**************************
 * Program Name : AbstractTruck
 * Description: LAB3A
 * Author: Henry Do
 * Date created: 04/12/2018
 ****************************/
package atruck;

import java.awt.Graphics;

public abstract class AbstractTruck {
	public Graphics g;
	
	public AbstractTruck() {
		System.out.println("Abstract Super Class is Activated.");
	}
	
	public abstract void translate(int x, int y);
	public abstract void resize(int x, int y, int size);

}
