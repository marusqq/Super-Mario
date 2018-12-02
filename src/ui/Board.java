/* @author Marius Pozniakovas
 * version 1.0
 * Klase piesimui i frame
 * class for painthing everything to frame
 */



package ui;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

import sound.PlaySound;
import game.Mario;
import game.Goomba;
import game.KoopaTroopa;
import game.Positionable;
import game.QuestionBlocks;
import game.Blocks;
import game.Entity;

@SuppressWarnings("serial")
public final class Board extends JPanel implements ActionListener { //final
	KoopaTroopa koopa;
	Goomba goomba;
	Mario mario;
	Blocks block;
	QuestionBlocks qblock;
	
	
	PlaySound sound;
	
	private Entity marioMovable;
	private Entity goombaMovable;
	private Entity koopaMovable;
	
	Positionable marioPositionable;
	Positionable goombaPositionable;
	Positionable koopaPositionable;
	
	Entity[] movableEntities = { marioMovable, goombaMovable, koopaMovable } ;
	Positionable[] positionableEntities = { marioPositionable, goombaPositionable, koopaPositionable } ;
	
	

	Timer time;
	public Image background;
	
	
	public Board() { 
		koopa = new KoopaTroopa(600, 355);
		goomba = new Goomba(400,385);
		mario = new Mario(40,360);
		
		block = new Blocks();
		qblock = new QuestionBlocks();
		
		sound = new PlaySound();

		System.out.println(mario);
		System.out.println(goomba);
		System.out.println(koopa);
		for(int i=0;i<3;i++)
			System.out.println(movableEntities[i]);
		for(int i=0;i<3;i++)
			System.out.println(positionableEntities[i]);
		
		addKeyListener(new AL());
		setFocusable(true);
		ImageIcon i = new ImageIcon("C:/Users/Marius/eclipse-workspace/Super Mario/resources/background.png");
		background = i.getImage();
		time = new Timer(1, this);
		time.start();	
	}
	
	public void actionPerformed(ActionEvent press) {
		mario.move();
		goomba.move();
		koopa.move();
		
		//goomba movement collision
		if(goomba.getX() == mario.getX() + 60)
			goomba.setSpeed(-2);
		if(goomba.getX() == getWidth())
			goomba.setSpeed(2);
		
		//koopa movement collision
		if(koopa.getX() == mario.getX() + 60)
			koopa.setSpeed(-1);
		if(koopa.getX() == getWidth())
			koopa.setSpeed(1);
		repaint();
	}
	
	public void paint (Graphics g) {
		super.paint(g);
		Graphics2D graphics2d = (Graphics2D) g;
	
		graphics2d.drawImage(background, 0, 0, null);
		if(mario.getIsMarioMoving()) {
			graphics2d.drawImage(block.getImage(), 130-mario.getMarioMoving(), 150, null);
			graphics2d.drawImage(block.getImage(), 270-mario.getMarioMoving(), 150, null);
			graphics2d.drawImage(qblock.getImage(), 200-mario.getMarioMoving(), 150, null);
			graphics2d.drawImage(block.getImage(), 340-mario.getMarioMoving(), 150, null);
		}
		else {
			graphics2d.drawImage(block.getImage(), 130-mario.getLastSpot(), 150, null);
			graphics2d.drawImage(block.getImage(), 270-mario.getLastSpot(), 150, null);
			graphics2d.drawImage(qblock.getImage(), 200-mario.getLastSpot(), 150, null);
			graphics2d.drawImage(block.getImage(), 340-mario.getLastSpot(), 150, null);
		}
		
		
		graphics2d.drawImage(mario.getImage(), mario.getX(), mario.getY(), null);
		graphics2d.drawImage(goomba.getImage(), goomba.getX(), goomba.getY(), null);
		graphics2d.drawImage(koopa.getImage(), koopa.getX(), koopa.getY(), null);
		
		
		
		//both moving

		//graphics2d.drawImage(background, 0-(Frame.LENGTH-10)-mario.dirBackground, 0, null);
		//graphics2d.drawImage(background, 0-mario.dirBackground, 0, null);
		//graphics2d.drawImage(background, count*(Frame.LENGTH-10)-mario.dirBackground, 0, null);
	
		/*moving screen + moving mario
		 */
		//graphics2d.drawImage(background, 1145-mario.diry, 0, null); 
		//graphics2d.drawImage(mario.getImage(), mario.getX(), mario.getY(), null); 
		
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

	











