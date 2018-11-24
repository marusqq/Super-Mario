/* @author Marius Pozniakovas
 * version 1.0
 * Vieno is monstru klase
 */


package game;

import javax.swing.ImageIcon;

public class Goomba extends Entity {
	Entity entity;
	ImageIcon goombaIcon = new ImageIcon ("C:/Users/Marius/Desktop/goomba.png");
	public Goomba() {
		super();
		super.setSpeed(0);
		super.setFriendly(false);
		super.setName("Goomba");
		gravity = 400;
		image = goombaIcon.getImage();
		
	}
	
	public Goomba(int x, int y) {
		super();
		super.setSpeed(1);
		super.setFriendly(false);
		super.setName("Goomba");
		gravity = 400;
		image = goombaIcon.getImage();
		
		this.x = x;
		this.y = y;	
		
	}
	
	public void move() {
		x = x - speed ;
	}
	
	/*public boolean marioXY() {
		return false;
	}
	*/
	
}
