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

	public int marioMoving = 0;
	public int lastSpot;
	public boolean isMarioMoving = false;
	public int dirBackground;
	public int startingPoint;
	public boolean jumping;
	ImageIcon playerFacingLeft = new ImageIcon("C:/Users/Marius/eclipse-workspace/Super Mario/resources/marioleft.png"); 
    ImageIcon playerFacingRight = new ImageIcon("C:/Users/Marius/eclipse-workspace/Super Mario/resources/marioright.png");
    
	public Mario() {
		setSpeed(2);
		setName("Mario");
		setGravity(300);
		image = playerFacingRight.getImage();
		
	}	
	@SuppressWarnings("unused")
	public Mario(int x, int y) {
		setSpeed(3);
		setName("Mario");
		setGravity(300);
		int startingPoint = x;
		image = playerFacingRight.getImage();
		this.x = x;
		this.y = y;		
	}
	
	public void move(){ //final
		try {
			x = x + dirx;
			dirBackground = dirBackground + (dirx*3);
			if(x<0)
				throw new OutOfBoundsPositionException("OutOfBoundsException\n");
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
			isMarioMoving = true;
			marioMoving--;
		}
			

		if(key == KeyEvent.VK_D) {
			
			image = playerFacingRight.getImage(); 
			dirx = speed;
			isMarioMoving = true;
			marioMoving++;
		}
				
		if(key == KeyEvent.VK_SPACE) 
			jump();
	}
	
	public boolean getIsMarioMoving () {
		return isMarioMoving;
	}
	
	public int getMarioMoving() {
		return marioMoving;
	}
	
	public int getLastSpot() {
		return lastSpot;
	}
	
	public void jump() {
		System.out.println("Jumping is not yet available");
	}
	public void keyReleased(KeyEvent press) {
		int key = press.getKeyCode();
		if(key == KeyEvent.VK_A) {
			dirx = 0;
			isMarioMoving = false;
			lastSpot = marioMoving;
		}
		if(key == KeyEvent.VK_D) {
			dirx = 0;
			isMarioMoving = false;
			lastSpot = marioMoving;
		}
			
			
			
	}

}
