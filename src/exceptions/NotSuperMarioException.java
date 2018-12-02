/* @author Marius Pozniakovas
 * version 1.0
 * exception klase kai zaidimas laiko mario supermario, nors jis nesuvalge dar grybuko
 * exception class when mario hasn't eaten the mushroom but the game thinks he did
 */

package exceptions;

public class NotSuperMarioException extends GameException {
//TODO: MAKE THIS EXCEPTION VIABLE
private static final long serialVersionUID = 1L;
	
	public NotSuperMarioException() {
		super();
	}
	
	public NotSuperMarioException(String message) {
		super(message);
	}
	
	
	public String toString () {
		return "Not Super Mario when Super Mario was requested:" + message;
	}
	
	public String getMessage() {
		return message;
	}

}
