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
import java.io.FileNotFoundException;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

import exceptions.BadFileException;

import sound.PlaySound;

import game.Mario;
import game.Goomba;
import game.KoopaTroopa;
import game.Positionable;
import game.QuestionBlocks;
import game.Blocks;
import game.Entity;

import map.ReadFromFile;

@SuppressWarnings("serial")
public final class Board extends JPanel implements ActionListener { //final
	KoopaTroopa koopa; //some fields for monster classes
	Goomba goomba;
	Mario mario;
	
	Blocks block; //some fields for block classes
	QuestionBlocks qblock;
	
	ReadFromFile mapBlocks; // field from ReadFromFile class for mapBlocks
	
	PlaySound sound; //field for audio class
	
	private Entity marioMovable;  //Entity field for trying to move with Entity
	private Entity goombaMovable;
	private Entity koopaMovable;
	
	Positionable marioPositionable; //Positionable fields for trying to position with Positionable
	Positionable goombaPositionable;
	Positionable koopaPositionable;
	
	Entity[] movableEntities = { marioMovable, goombaMovable, koopaMovable } ; //array from fields(45-47 line)
	Positionable[] positionableEntities = { marioPositionable, goombaPositionable, koopaPositionable } ; //array from fields (48-50 line)
	
	ImageIcon i = new ImageIcon("C:/Users/Marius/eclipse-workspace/Super-Mario/resources/background.png"); //background picture

	Timer time; //field for timer
	public Image background;
	
	
	public Board() { 
		koopa = new KoopaTroopa(600, 355);
		goomba = new Goomba(400,385);
		mario = new Mario(40,360);
		
		System.out.println(mario);
		System.out.println(goomba);
		System.out.println(koopa);
		//mario, koopa, goomba created and printed
		
		try {
			block = new Blocks();
			qblock = new QuestionBlocks();
			mapBlocks = new ReadFromFile();
		} 
		catch(BadFileException exc) {
			System.out.println(exc.getMessage() + '\n');
		}
		//TODO Make all the exception methods useful
		catch(FileNotFoundException exc) {
			System.out.println("File not found");
		}
		catch (Exception e) {
	         System.out.println("Some weird exception. Seek help!");
	    }
		//try to read and from file and load structures
		
		
		sound = new PlaySound();
		
		for(int i=0;i<3;i++)
			System.out.println(movableEntities[i]);
		for(int i=0;i<3;i++)
			System.out.println(positionableEntities[i]);
		
		addKeyListener(new AL());
		setFocusable(true);
		background = i.getImage();
		time = new Timer(10, this);
		time.start();	
	}
	
	public void actionPerformed(ActionEvent press) {
		
		mario.move();
		goomba.move();
		koopa.move();
		
		//goomba movement collision
		if(goomba.getX() == mario.getX() + 60)
			goomba.setSpeed(-1);
		if(goomba.getX() == getWidth())
			goomba.setSpeed(1);
		
		//koopa movement collision
		if(koopa.getX() == mario.getX() + 60)
			koopa.setSpeed(-1);
		if(koopa.getX() == getWidth())
			koopa.setSpeed(1);
		repaint();
		
		//TODO: Mario catches MagicMushroom and becomes SUPERMARIO
	}
	
	public void paint (Graphics g) {
		super.paint(g);
		Graphics2D graphics2d = (Graphics2D) g;
		
		//TODO: Make walls stop moving when reaching white
		if(mario.getIsMarioMoving()) {
			graphics2d.drawImage(background, 0-mario.getMarioMoving(), 0, null);
			graphics2d.drawImage(background, 0-mario.getMarioMoving()+ getWidth(), 0, null);
			graphics2d.drawImage(block.getImage(), 130-mario.getMarioMoving(), 150, null);
			graphics2d.drawImage(block.getImage(), 270-mario.getMarioMoving(), 150, null);
			graphics2d.drawImage(qblock.getImage(), 200-mario.getMarioMoving(), 150, null);
			graphics2d.drawImage(block.getImage(), 340-mario.getMarioMoving(), 150, null);
		}
		else {
			graphics2d.drawImage(background, 0-mario.getLastSpot(), 0, null);
			graphics2d.drawImage(background, 0-mario.getLastSpot() + getWidth(), 0, null);
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

	











