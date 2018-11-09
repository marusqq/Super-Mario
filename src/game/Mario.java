/* @author Marius
 * version 1.0
 * Pagrindinio veikejo klase
 */

package game;

import java.awt.*;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Mario extends Entity {

	
	public int diry;
	ImageIcon playerFacingLeft = new ImageIcon("C:/Users/Marius/Desktop/marioleft.png"); 
    ImageIcon playerFacingRight = new ImageIcon("C:/Users/Marius/Desktop/marioright.png");
	
	public Mario() {
		super();
		super.setSpeed(2);
		super.setName("Mario");
		gravity = 300;
		image = playerFacingRight.getImage();
		
	}
	
		
	public Mario(int x, int y) {
		super(); 
		super.setSpeed(2);
		super.setName("Mario");
		image = playerFacingRight.getImage();
		gravity = 300;
		this.x = x;
		this.y = y;
		
		
		
	}
	
	
	public void move() { //final
		//if(x > 0)
		x = x + dirx;
		diry = diry + dirx;
	}

	
	public int getX() {
		return x;
	}
		
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getGravity () {
		int grav = gravity;
		return grav;
	}
	
	public Image getImage() {
		return image;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public String toString() {
		return "Name: " + name + "\nx: " + x + "   y: " + y + "\nspeed:" + speed
				+ "  friendly: " + friendly; 
	}
	
	public void keyPressed(KeyEvent press) {
		int key = press.getKeyCode();
		//System.out.println(getX());
		if(key == KeyEvent.VK_A) {
			
			image = playerFacingLeft.getImage(); 
			dirx = -speed;	
		}
			

		if(key == KeyEvent.VK_D) {
			
			image = playerFacingRight.getImage(); 
			dirx = speed;
		}
				
		//if(key == KeyEvent.VK_SPACE)
			//jump();
	}
	
	
	public void keyReleased(KeyEvent press) {
		int key = press.getKeyCode();
		if(key == KeyEvent.VK_A)
			dirx = 0;
		if(key == KeyEvent.VK_D)
			dirx = 0;
			
			
	}

}
