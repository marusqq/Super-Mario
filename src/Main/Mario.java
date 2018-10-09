package Main;

import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Mario {

	int x, y, dirx, diry;
	Image mario;
	Mario supermario;
	
	public Mario() {
		ImageIcon i = new ImageIcon("C:/Users/Marius/Desktop/mario.png");
		mario = i.getImage();
		x = 0;
		y = 530;
		diry = 1145;
	}
	
		
	public Mario(int x, int y) {
		ImageIcon i = new ImageIcon("C:/Users/Marius/Desktop/mario.png");
		mario = i.getImage();
		this.x = x;
		this.y = y;
		diry = 1145;
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
	
	public Image getImage( ) {
		return mario;
	}
	
	public void keyPressed(KeyEvent press) {
		int key = press.getKeyCode();
		
		if(key == KeyEvent.VK_A)
			dirx = -1;
				
		if(key == KeyEvent.VK_D)
			dirx = 1;
	}
	
	
	public void keyReleased(KeyEvent press) {
		int key = press.getKeyCode();
		if(key == KeyEvent.VK_A)
			dirx = 0;
		if(key == KeyEvent.VK_D)
			dirx = 0;
			
	}

}
