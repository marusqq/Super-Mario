/* @author Marius Pozniakovas
 * version 1.0
 * viena is monstru klase
 */


package game;

import javax.swing.ImageIcon;

public class KoopaTroopa extends Entity implements Movable {
	
	Goomba goomba = new Goomba();
	ImageIcon koopaTroopaLeft = new ImageIcon ("C:/Users/Marius/eclipse-workspace/Super Mario/resources/koopatroopaleft.png");
	ImageIcon koopaTroopaRight = new ImageIcon ("C:/Users/Marius/eclipse-workspace/Super Mario/resources/koopatrooparight.png");
	
	public KoopaTroopa() {
		setName("KoopaTroopa");
		image = koopaTroopaLeft.getImage();
		
	}
	
	public KoopaTroopa(int x, int y) {
		setName("KoopaTroopa");
		image = koopaTroopaLeft.getImage();
		
		this.x = x;
		this.y = y;	
		
	}
	
	
}
