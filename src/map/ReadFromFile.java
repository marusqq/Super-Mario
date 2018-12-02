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


//FIXME: FIX INPUT FILE
public class ReadFromFile {
	
	public int blockCount = 0;
	public int qBlockCount = 0;
	ArrayList<Integer> blocksX = new ArrayList<Integer>();
	ArrayList<Integer> blocksY = new ArrayList<Integer>();
	ArrayList<Integer> qBlocksX = new ArrayList<Integer>();
	ArrayList<Integer> qBlocksY = new ArrayList<Integer>();
	public String input;
	public int coordinate;
	
	public ReadFromFile() throws BadFileException, FileNotFoundException {
		
		File file = new File("C:/Users/Marius/eclipse-workspace/Super-Mario/map/blocks.txt"); 
		Scanner sc = new Scanner(file); 
		while(sc.hasNext()) {
			
			if(sc.hasNext()) {
				input = sc.next();
				System.out.println(input);
				
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
							sc.close();
							throw new BadFileException ("No Y coordinate after B\n");
						}
					}
					
					else {
						sc.close();
						throw new BadFileException ("No X coordinate after B\n");
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
							sc.close();
							throw new BadFileException ("No Y after X in QB\n");
						}
					}
					
					else {
						sc.close();
						throw new BadFileException ("No X after QB\n");
					}
				}
				else {
					sc.close();
					throw new BadFileException ("No B or QB after newline\n");
				}
			}
			else {
				sc.close();
				throw new BadFileException ("No input in map file\n");
			}
		}
		sc.close();
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
