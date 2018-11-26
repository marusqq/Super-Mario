/* @author Marius Pozniakovas
 * version 1.0
 * viena is monstru klase
 */


package game;

import javax.swing.ImageIcon;

public class KoopaTroopa extends Entity implements Movable {
	
	//Mario mario = new Mario();
	Goomba goomba = new Goomba();
	ImageIcon koopaTroopaLeft = new ImageIcon ("C:/Users/Marius/Desktop/koopatroopaleft.png");
	ImageIcon koopaTroopaRight = new ImageIcon ("C:/Users/Marius/Desktop/koopatrooparight.png");
	
	public KoopaTroopa() {
		super();
		setName("KoopaTroopa");
		image = koopaTroopaLeft.getImage();
		
	}
	
	public KoopaTroopa(int x, int y) {
		super();
		setName("KoopaTroopa");
		image = koopaTroopaLeft.getImage();
		
		this.x = x;
		this.y = y;	
		
	}
	
	
}
