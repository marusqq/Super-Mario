/* @author Marius
 * version 1.0
 * interfeisas judejimui
 */

package game;

public interface Movable extends Modifiable {
	public void move();
	public int getGravity();
	public int getSpeed();
	
	default int defaultGravity() {
		return 800;
	}
        
}
