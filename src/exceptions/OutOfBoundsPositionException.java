/* @author Marius Pozniakovas
 * version 1.0
 * viena iš imanomu exceptionu klase
 * one of the possible exceptions class
 */

package exceptions;

public class OutOfBoundsPositionException extends GameException{

	
	 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public OutOfBoundsPositionException() {
		super();
	}
	
	public OutOfBoundsPositionException(String message) {
		super(message);
	}
	
	
	public String toString () {
		return "OutOfBoundsPosition: " + message;
	}
	
	public String getMessage() {
		return message;
	}

}
