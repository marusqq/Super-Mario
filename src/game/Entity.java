/* @author Marius Pozniakovas
 * version 1.0
 * Tevine visu veikeju klase
 * all the moving character class
 */



package game;

import java.awt.Image;


public abstract class Entity extends GameObject implements Modifiable{
	public int dirx;
	public int gravity, speed;
	boolean friendly;
	String name;
	
	
	public Entity () {
		gravity = getDefaultGravity();
		speed = getDefaultSpeed();
		friendly = getDefaultFriendly();
		name = "Bad Guy";
		speed = 1;
	}
	
	public void setSpeed(int s) {
		this.speed = s;
	}
	
	public void setImage(Image imageWoop) {
		this.image = imageWoop;
	}
	
	public void setName (String s) {
		this.name = s;
	}
	
	public void setFriendly (boolean f) {
		this.friendly = f;
	}
	
	public void setGravity (int g) {
		this.gravity = g;
	}
	
	public void move(){
		x = x - speed;
	}
	
	public Image getImage() {
		return image;
	}
	
	public int getGravity() {
		return gravity;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public String toString() {
		return "Name: " + name + "\nx: " + x + "   y: " + y + "\nspeed:" + speed
				+ "  friendly:" + friendly + "  gravity:" + gravity; 
	}
	
}
