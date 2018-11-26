/* @author Marius
 * version 1.0
 * interfeisas keisti koordinates ir greiti
 */

package game;

public interface Modifiable {
	void setSpeed(int s);
	void setName(String s);
	void setFriendly (boolean f);
	void setGravity (int g);
	
	default int getDefaultGravity() {
		return 800;
	}
	
	default int getDefaultSpeed() {
		return 2;
	}
	
	default boolean getDefaultFriendly() {
		return false;
	}
}