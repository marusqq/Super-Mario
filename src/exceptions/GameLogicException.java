/* @author Marius Pozniakovas
 * version 1.0
 * zaidimo exceptiono klase
 * game exceptions class
 */

package exceptions;

public class GameLogicException extends Exception {

	protected String message = "GameLogicException :";
	private static final long serialVersionUID = 1L;

	public GameLogicException() {
		super();
		System.out.println("GameException: GameLogic has been broken. Goob Job!");
	}

	public GameLogicException(String message) {
		super(message);
		this.message = message;
	}

	public GameLogicException(String message, Throwable cause) {
		super(message, cause);
		this.message = message;
	}

	public GameLogicException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		this.message = message;
	}
	
	public String toString () {
		return "Exception: " + message;
	}
	
	public String getMessage() {
		return message;
	}

}
