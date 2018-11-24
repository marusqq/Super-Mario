/* @author Marius Pozniakovas
 * version 1.0
 * Tevine visu veikeju klase
 */



package game;

import java.awt.Image;

public abstract class Entity extends GameObject implements Movable{
	public int dirx, diry;
	public int gravity, speed;
	boolean friendly;
	String name;
	
	
	public Entity () {	
		diry = 1145;
		gravity = getDefaultGravity();
		speed = 1;
		friendly = true;
		name = "";
		
	}
	
	public final void setSpeed(int s) {
		this.speed = s;
	}
	
	
	public final void setName (String s) {
		this.name = s;
	}
	
	public final void setFriendly (boolean f) {
		this.friendly = f;
	}
	
	public final void setGravity (int g) {
		this.gravity = g;
	}
	
	public void move()
	{
		x = x + dirx;
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
