/* @author Marius Pozniakovas
 * version 1.0
 * viena iš imanomu exceptionu klase
 * one of the possible exceptions class
 */

package exceptions;

public class OutOfBoundsPositionException extends GameLogicException{
	
	private static final long serialVersionUID = 1L;
	public OutOfBoundsPositionException() {
		super();
		message = "OutOfBoundsPositionException:";
	}
	
	public OutOfBoundsPositionException(String message) {
		super(message);
	}

}
