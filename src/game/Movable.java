/* @author Marius Pozniakovas
 * version 1.0
 * interfeisas judejimui
 */

package game;

public interface Movable extends Modifiable {
	public void move();
	public int getGravity();
	public int getSpeed();
	
	default int getDefaultGravity() {
		return 800;
	}
        
}
