/* @author Marius
 * version 1.0
 * Vieno is monstru klase
 */


package game;

import java.awt.*;
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
		super.setSpeed(0);
		super.setFriendly(false);
		super.setName("Goomba");
		gravity = 400;
		image = goombaIcon.getImage();
		
		this.x = x;
		this.y = y;	
		
	}
	
	public int getX() {
		return x;
	}
		
	public int getY() {
		return y;
	}
	
	public void setX(int X) {
		this.x = X;
	}
	
	public void setY(int Y) {
		this.y = Y;
	}
	
	public Image getImage() {
		return image;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public int getGravity () {
		int grav = gravity;
		return grav;
	}
	
	
	
	/*public boolean marioXY() {
		return false;
	}
	*/
	
	public String toString() {
		return "Name: " + name + "\nx: " + x + "   y: " + y + "\nspeed:" + speed
				+ "  friendly: " + friendly;
	}
	

}
