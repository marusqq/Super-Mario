/* @author Marius Pozniakovas
 * version 1.0
 * Pagrindinio veikejo klase
 */

//pakeisti dizaina tiap, kad bent viena is baziniu klasiu turetu
//bekonstruktoriu pagal nutylejima, turetu ir kita konstrukturiu. o tada isvestine
//klase tuo kitu konstruktorium pasinaudotu

//prasmingai panaudoti interfeisus
//iskelti getx, gety i bazine klase 

//kitam kartui, super konstruktoriuje ir super metodas ir : prasmingai panaudoti
package game;

import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Mario extends Entity {

	
	public int diry;
	ImageIcon playerFacingLeft = new ImageIcon("C:/Users/Marius/Desktop/marioleft.png"); 
    ImageIcon playerFacingRight = new ImageIcon("C:/Users/Marius/Desktop/marioright.png");
	
	public Mario() {
		//super();
		super.setSpeed(10);
		setName("Mario");
		gravity = 300;
		image = playerFacingRight.getImage();
		
	}	
	public Mario(int x, int y) {
		//super(); 
		setSpeed(2);
		super.setName("Mario");
		image = playerFacingRight.getImage();
		gravity = 300;
		this.x = x;
		this.y = y;		
	}
	
	public void move() { //final
		x = x + dirx;
		diry = diry + dirx;
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
