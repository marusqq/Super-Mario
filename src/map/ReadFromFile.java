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
		
		File file = new File("C:/Users/Marius/eclipse-workspace/Super Mario/map/blocks.txt"); 
		System.out.println("2");
		Scanner sc = new Scanner(file); 
		while(sc.hasNext()) {
			System.out.println("i have next in while");
			
			if(sc.hasNext()) {
				input = sc.next();
				
				if(input == "B") {
					blockCount++;
					
					if(sc.hasNextInt()) {
						coordinate = sc.nextInt();
						blocksX.add(coordinate);
						
						if(sc.hasNextInt()) {
							coordinate = sc.nextInt();
							blocksY.add(coordinate);
							}
						
						else {
							new BadFileException ("No Y coordinate after B\n");
							break;
						}
					}
					
					else {
						new BadFileException ("No X coordinate after B\n");
						break;
					}
					
				}
				
				else if(input == "QB") {
					qBlockCount++;
					
					if(sc.hasNextInt()) {
						coordinate = sc.nextInt();
						qBlocksX.add(coordinate);
						
						if(sc.hasNextInt()) {
							coordinate = sc.nextInt();
							qBlocksY.add(coordinate);
							
						}
						
						else {
							new BadFileException ("No Y after X in QB\n");
							break;
						}
					}
					
					else {
						new BadFileException ("No X after QB\n");
						break;
					}
				}
				else {
					System.out.println("4");
					new BadFileException ("No B or QB after newline\n");
					break;
				}
			}
			else {
				new BadFileException ("No input in map file\n");
				break;
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
	
//	public int[] getBlocksX () {
//		return blocksX;
//	}
}
