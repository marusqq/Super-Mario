/* @author Marius Pozniakovas
 * version 1.0
 * Pagrindinio veikejo klase
 * main mario class
 */


package game;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

import exceptions.NotSuperMarioException;
import exceptions.OutOfBoundsPositionException;

public class Mario extends Entity implements Movable {

	public int marioMoving = 0;
	public int lastSpot;
	public boolean isMarioMoving = false, superMario = false;
	public int dirBackground;
	public int startingPoint;
	public boolean jumping;
	ImageIcon playerFacingLeft = new ImageIcon("C:/Users/Marius/eclipse-workspace/Super-Mario/resources/marioleft.png"); 
    ImageIcon playerFacingRight = new ImageIcon("C:/Users/Marius/eclipse-workspace/Super-Mario/resources/marioright.png");
    ImageIcon marioSuperImageLeft = new ImageIcon ("C:/Users/Marius/eclipse-workspace/Super-Mario/resources/supermarioleft.png");
    ImageIcon marioSuperImageRight = new ImageIcon ("C:/Users/Marius/eclipse-workspace/Super-Mario/resources/supermarioright.png");
    
	public Mario() {
		setSpeed(1);
		setName("Mario");
		setGravity(300);
		image = playerFacingRight.getImage();
		
	}	
	@SuppressWarnings("unused")
	public Mario(int x, int y) {
		setSpeed(1);
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
			if(isMarioSuperMario())
				image = marioSuperImageLeft.getImage();
			else
				image = playerFacingLeft.getImage(); 
			dirx = -speed;
			isMarioMoving = true;
			marioMoving= marioMoving - 4;
		}
			

		if(key == KeyEvent.VK_D) {
			
			if(isMarioSuperMario())
				image = marioSuperImageRight.getImage();
			else
				image = playerFacingRight.getImage();  
			dirx = speed;
			isMarioMoving = true;
			marioMoving= marioMoving + 4;
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
	//CHECKME: Make SUPERMARIO exception VIABLE and this method
	public boolean isMarioSuperMario() {
		return superMario;
	}
	
	public ImageIcon superMario(boolean eatenMushroom) throws NotSuperMarioException{
		if(eatenMushroom)
			return marioSuperImageRight;
		else {
			throw new NotSuperMarioException("Error. Mario is not SuperMario yet!");
		}
			
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
