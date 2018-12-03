/* @author Marius Pozniakovas
 * version 1.0
 * exception klase kai zaidimas laiko mario supermario, nors jis nesuvalge dar grybuko
 * exception class when mario hasn't eaten the mushroom but the game thinks he did
 */

package exceptions;

public class NotSuperMarioException extends GameLogicException {
	
	private static final long serialVersionUID = 1L;
	
		String message = "Mario is not Super Mario";
		public NotSuperMarioException() {
			super();
		}
	
		public NotSuperMarioException(String message) {
			super(message);
		}

}
