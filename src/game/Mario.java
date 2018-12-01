/* @author Marius Pozniakovas
 * version 1.0
 * Pagrindinio veikejo klase
 */

//TODO super metodas ir konstruktorius
//TODO delegavimas

package game;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

import exceptions.OutOfBoundsPositionException;

public class Mario extends Entity implements Movable {

	Goomba goombaCopy; 
	public int diry;
	public boolean jumping;
	ImageIcon playerFacingLeft = new ImageIcon("C:/Users/Marius/Desktop/marioleft.png"); 
    ImageIcon playerFacingRight = new ImageIcon("C:/Users/Marius/Desktop/marioright.png");
	
	public Mario() {
		setSpeed(2);
		setName("Mario");
		setGravity(300);
		image = playerFacingRight.getImage();
		
	}	
	public Mario(int x, int y) {
		setSpeed(1);
		setName("Mario");
		setGravity(300);
		
		image = playerFacingRight.getImage();
		this.x = x;
		this.y = y;		
	}
	
	public void move() { //final
		try {
			x = x + dirx;
			diry = diry + dirx;
			if(x==100)
				throw new OutOfBoundsPositionException("at x = 100");
			
			} 
		catch (OutOfBoundsPositionException exc) {
			System.out.print("Mario: " + exc.getMessage());	
			}
		
	}
	
	public int getGravity () {
		int grav = gravity;
		return grav;
	}

	public void keyPressed(KeyEvent press) {
		int key = press.getKeyCode();
		if(key == KeyEvent.VK_A) {
			
			image = playerFacingLeft.getImage(); 
			dirx = -speed;	
		}
			

		if(key == KeyEvent.VK_D) {
			
			image = playerFacingRight.getImage(); 
			dirx = speed;
		}
				
		if(key == KeyEvent.VK_SPACE) 
			jump();
	}
	
	
	public void jump() {
		System.out.println("Jumping is not yet available");
	}
	public void keyReleased(KeyEvent press) {
		int key = press.getKeyCode();
		if(key == KeyEvent.VK_A)
			dirx = 0;
		if(key == KeyEvent.VK_D)
			dirx = 0;
			
			
	}

}
