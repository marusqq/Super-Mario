package game;

import java.awt.*;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Mario extends Entity {

	
	public int diry;
	Image mario;
	ImageIcon playerFacingLeft = new     ImageIcon("C:/Users/Marius/Desktop/marioleft.png"); 
    ImageIcon playerFacingRight = new     ImageIcon("C:/Users/Marius/Desktop/marioright.png");
	Mario supermario;
	
	public Mario() {
		super();
		super.setSpeed(1);
		mario = playerFacingRight.getImage();
	}
	
		
	public Mario(int x, int y) {
		super();
		mario = playerFacingRight.getImage();
		this.x = x;
		this.y = y;
		super.setSpeed(1);
	}
	
	
	public final void move() { //final
		x = x + dirx;
		diry = diry + dirx;
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
	
	public int getGravity () {
		int grav = gravity;
		return grav;
	}
	
	public Image getImage() {
		return mario;
	}
	
	public void keyPressed(KeyEvent press) {
		int key = press.getKeyCode();
		//System.out.println(getX());
		if(key == KeyEvent.VK_A) {
			
			mario = playerFacingLeft.getImage(); 
			dirx = -speed;	
		}
			

		if(key == KeyEvent.VK_D) {
			
			mario = playerFacingRight.getImage(); 
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
