package game;

import java.awt.*;
import javax.swing.ImageIcon;

public class Goomba extends Entity{

	Image goomba;
	ImageIcon goombaIcon = new ImageIcon ("C:/Users/Marius/Desktop/goomba.png");
	public Goomba() {
		super();
		super.setSpeed(0);
		super.setFriendly(false);
		super.setName("Goomba");
		
		goomba = goombaIcon.getImage();
		
	}
	
	public Goomba(int x, int y) {
		super();
		super.setSpeed(0);
		super.setFriendly(false);
		super.setName("Goomba");
		
		goomba = goombaIcon.getImage();
		
		this.x = x;
		this.y = y;	
		
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
	
	public Image getImage() {
		return goomba;
	}
	
	public String toString() {
		return "Name: " + name + "\nx: " + x + "   y: " + y + "\nspeed:" + speed
				+ "  friendly: " + friendly; 
	}
	

}
