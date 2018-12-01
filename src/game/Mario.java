/* @author Marius Pozniakovas
 * version 1.0
 * Pagrindinio veikejo klase
 */

//TODO super metodas ir konstruktorius
//TODO delegavimas

package game;

//import exceptions.OutOfBoundsPositionException;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Mario extends Entity implements Movable{

	Goomba goombaCopy; 
	public int diry;
	ImageIcon playerFacingLeft = new ImageIcon("C:/Users/Marius/Desktop/marioleft.png"); 
    ImageIcon playerFacingRight = new ImageIcon("C:/Users/Marius/Desktop/marioright.png");
	
	public Mario() {
		setSpeed(10);
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
		//try {
			x = x + dirx;
			diry = diry + dirx;
		//}
		//catch (OutOfBoundsPositionException exc) {
		//	System.out.println("Out of bounds" + exc);
		//}
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
