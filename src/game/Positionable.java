/* @author Marius Pozniakovas
 * version 1.0
 * interfeisas skirtas gauti x ir y
 * interface to set x,y and to get x,y
 */


package game;

import java.awt.Image;

public interface Positionable {
	public int getX();
	public int getY();
	public void setX(int x);
	public void setY(int y);
	public Image getImage();
}
