/* @author Marius Pozniakovas
 * version 1.0
 * Vieno is monstru klase
 */


package game;

import javax.swing.ImageIcon;

public class Goomba extends Entity implements Movable {
	Entity entity;
	ImageIcon goombaIcon = new ImageIcon ("C:/Users/Marius/Desktop/goomba.png");
	public Goomba() {
		setName("Goomba");
		image = goombaIcon.getImage();
		
	}
	
	public Goomba(int x, int y) {
		setName("Goomba");
		image = goombaIcon.getImage();
		
		this.x = x;
		this.y = y;	
		
	}
	
	/*public boolean marioXY() {
		return false;
	}
	*/
	
}
