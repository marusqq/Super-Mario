package ui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import game.Mario;
import game.Goomba;

@SuppressWarnings("serial")
public final class Board extends JPanel implements ActionListener { //final

	Mario mario;
	Goomba goomba;
	public Image background;
	Timer time;
	
	public Board() {
		mario = new Mario(0,530);
		goomba = new Goomba(400,459);
		System.out.println(mario);
		System.out.println(goomba);
		addKeyListener(new AL());
		setFocusable(true);
		ImageIcon i = new ImageIcon("C:/Users/Marius/Desktop/background.png");
		background = i.getImage();
		time = new Timer(1, this);
		time.start();	
	}
	
	public void actionPerformed(ActionEvent press) {
		mario.move();
		repaint();
	}
	
	public void paint (Graphics g) {
		super.paint(g);
		Graphics2D graphics2d = (Graphics2D) g;
		
		graphics2d.drawImage(background, 0, 0, null);
		
		
		//judantis backgroundas
		//graphics2d.drawImage(background, 1145-mario.diry, 0, null);
		//graphics2d.drawImage(background, 1145-mario.diry+1145, 0, null);
		//graphics2d.drawImage(background, 1145-mario.diry-1145, 0, null);	
		graphics2d.drawImage(mario.getImage(), mario.getX(), mario.getY(), null);
		graphics2d.drawImage(goomba.getImage(), goomba.getX(), goomba.getY(), null);
		/*
		 *moving screen + moving mario
		//graphics2d.drawImage(background, 1145-mario.diry, 0, null); 
		//graphics2d.drawImage(mario.getImage(), mario.getX(), mario.getY(), null); 
		*/
	}
	
	private class AL extends KeyAdapter {
		public void keyReleased (KeyEvent press) {
			mario.keyReleased(press);
		}
		
		public void keyPressed (KeyEvent press) {
			mario.keyPressed(press);
		}
		
	}
	
}

	











