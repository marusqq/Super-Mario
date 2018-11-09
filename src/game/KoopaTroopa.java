/* @author Marius
 * version 1.0
 * viena is monstru klasiu
 */


package game;

import java.awt.Image;

import javax.swing.ImageIcon;

public class KoopaTroopa extends Entity {

	Entity entity;
	ImageIcon koopaTroopaLeft = new ImageIcon ("C:/Users/Marius/Desktop/koopatroopaleft.png");
	ImageIcon koopaTroopaRight = new ImageIcon ("C:/Users/Marius/Desktop/koopatrooparight.png");
	
	public KoopaTroopa() {
		super();
		super.setSpeed(0);
		super.setFriendly(false);
		super.setName("KoopaTroopa");
		gravity = 400;
		image = koopaTroopaLeft.getImage();
		
	}
	
	public KoopaTroopa(int x, int y) {
		super();
		super.setSpeed(0);
		super.setFriendly(false);
		super.setName("KoopaTroopa");
		gravity = 400;
		image = koopaTroopaLeft.getImage();
		
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
