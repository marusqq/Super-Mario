/* @author Marius Pozniakovas
 * version 1.0
 * blokai kurie ismusant is apacios ismeta treasure
 * blocks which give something when hit from beneath
 */


package game;

import javax.swing.ImageIcon;

public class QuestionBlocks extends Blocks {

	ImageIcon questionblockIcon = new ImageIcon ("C:/Users/Marius/eclipse-workspace/Super-Mario/resources/questionblock.png");
	public QuestionBlocks() {
		super();
		image = questionblockIcon.getImage();
		//TODO: Make magic mushroom if hit from beneath
	}

}
