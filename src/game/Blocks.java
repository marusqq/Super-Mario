/* @author Marius Pozniakovas
 * version 1.0
 * nesunaikinami blokai, kurie laikosi ore
 */


package game;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Blocks extends Structures {

	ImageIcon blockIcon = new ImageIcon ("C:/Users/Marius/eclipse-workspace/Super Mario/resources/block_dark.png");
	
	public Blocks() {
		super();
		image = blockIcon.getImage();
	}
	
	public Image getImage() {
		return image;
	}

}
