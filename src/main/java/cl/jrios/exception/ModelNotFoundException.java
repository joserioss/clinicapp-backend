package cl.jrios.exception;

public class ModelNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6631188791989958020L;

	public ModelNotFoundException(String message) {
		super(message);
	}
}
