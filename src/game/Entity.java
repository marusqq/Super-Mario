/* @author Marius
 * version 1.0
 * Tevine visu veikeju klase
 */



package game;

import java.awt.Image;
import java.awt.event.KeyEvent;

public abstract class Entity extends GameObject implements Movable {
	public int dirx, diry;
	public int gravity, speed;
	boolean friendly;
	String name;
	
	
	public Entity () {	
		diry = 1145;
		gravity = defaultGravity();
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
	
	public void move () {
		x = x + dirx;
	}
	
	public abstract int getX();
		
	public abstract int getY();

	
	public Image getImage() {
		return image;
	}
	
	public void keyPressed(KeyEvent press) {}
	
	public void keyReleased(KeyEvent press) {}
	
	public int getGravity() {
		return gravity;
	}
}
