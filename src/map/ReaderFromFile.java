/* @author Marius Pozniakovas
 * version 1.0
 * klase zemelapio uzkrovimui
 * class for loading the map
 */

package map;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import exceptions.BadFileException;

public class ReaderFromFile {
	
	public int blockCount = 0;
	public int qBlockCount = 0;
	private int exceptionType;
	
	ArrayList<Integer> blocksX = new ArrayList<Integer>();
	ArrayList<Integer> blocksY = new ArrayList<Integer>();
	ArrayList<Integer> qBlocksX = new ArrayList<Integer>();
	ArrayList<Integer> qBlocksY = new ArrayList<Integer>();
	
	public String input;
	public int coordinate;
	//try catch su resursais/ resources
	public ReaderFromFile() throws BadFileException, FileNotFoundException {
		
		File file = new File("C:/Users/Marius/eclipse-workspace/Super-Mario/map/blocks.txt"); 
		Scanner sc = new Scanner(file); 
		while(sc.hasNext()) {
			
			if(sc.hasNext()) {
				input = sc.next();
				
				if(input.equals("B")) {
					blockCount++;
					
					if(sc.hasNextInt()) {
						coordinate = sc.nextInt();
						blocksX.add(coordinate);
						
						if(sc.hasNextInt()) {
							coordinate = sc.nextInt();
							blocksY.add(coordinate);
							}
						
						else {
							exceptionType = 1;
							break;
						}
					}
					
					else {
						exceptionType = 2;
						break;
					}
					
				}
				
				else if(input.equals("QB")) {
					qBlockCount++;
					
					if(sc.hasNextInt()) {
						coordinate = sc.nextInt();
						qBlocksX.add(coordinate);
						
						if(sc.hasNextInt()) {
							coordinate = sc.nextInt();
							qBlocksY.add(coordinate);
							
						}
						
						else {
							exceptionType = 3;
							break;
						}
					}
					
					else {
						exceptionType = 4;
						break;
					}
				}
				else {
					exceptionType = 5;
					break;
				}
			}
			else {
				exceptionType = 6;
				break;
			}
		}
		sc.close();
		switch(exceptionType) {
		case 1:
			throw new BadFileException("No Y coordinate after B\n");
		case 2:
			throw new BadFileException("No X coordinate after B\n");
		case 3:
			throw new BadFileException("No Y after X in QB\n");
		case 4:
			throw new BadFileException("No X after QB\n");
		case 5:
			throw new BadFileException("No B or QB after newline\n");
		case 6:
			throw new BadFileException("No input in map file\n");	
		default:
			//noException, nice!
			break;
			
		}
	}
	
	public int getBlockCount() {
		return blockCount;
	}
	
	public int getQBlockCount() {
		return qBlockCount;
	}
	
	public ArrayList<Integer> getArrayBlocksX () {
		return blocksX;
	}
	
	public ArrayList<Integer> getArrayBlocksY () {
		return blocksY;
	}
	
	public ArrayList<Integer> getArrayQBlocksX () {
		return qBlocksX;
	}
	
	public ArrayList<Integer> getArrayQBlocksY () {
		return qBlocksY;
	}

}
