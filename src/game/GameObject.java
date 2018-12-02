/* @author Marius Pozniakovas
 * version 1.0
 * pagrindine zaidimo klase, kuri valdo viska
 * main gameobject class which is a parent to every class in game package
 */

package game;

import java.awt.Image;

public abstract class GameObject implements Positionable{
	
	protected int x, y;
	Image image;
	
	public GameObject() {
		x = 0;
		y = 0;
		//System.out.println("Object created in:" + getX() + "," + getY() );
	
	}
	
	public GameObject(int x, int y) {
		x = this.x;
		y = this.y;
		//System.out.println("Object created in:" + getX() + "," + getY() );
	}
	
	public int getX() {
		return x;
	}
		
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public Image getImage() {
		return image;
	}
	
	

}
