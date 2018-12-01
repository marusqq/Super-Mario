package exceptions;

public class OutOfBoundsPositionException extends GameException{

	
	 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
