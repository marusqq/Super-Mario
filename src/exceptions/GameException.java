package exceptions;

public class GameException extends Exception {

	/**
	 * 
	 */
	protected int id;
	protected String message;
	private static final long serialVersionUID = 1L;

	public GameException() {
		super();
	}

	public GameException(String message) {
		super(message);
		this.message = message;
	}

	public GameException(Throwable cause) {
		super(cause);
	}

	public GameException(String message, Throwable cause) {
		super(message, cause);
		this.message = message;
	}

	public GameException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		this.message = message;
	}

}
