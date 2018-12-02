/* @author Marius Pozniakovas
 * version 1.0
 * exceptionu klase kai failo vidus blogas
 * exception class when you find the wrong file or the file is corrupted
 */

package exceptions;

public class BadFileException extends Exception{

	String message = "BadFileException";
	private static final long serialVersionUID = 1L;
	
	public BadFileException() {
		super();
	}
	
	public BadFileException(String message) {
		super(message);
	}
	
	
	public String toString () {
		return "Bad file: " + message;
	}
	
	public String getMessage() {
		return message;
	}

}
