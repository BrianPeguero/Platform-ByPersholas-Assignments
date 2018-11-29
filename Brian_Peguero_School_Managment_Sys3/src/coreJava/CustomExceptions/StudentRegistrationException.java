package coreJava.CustomExceptions;

@SuppressWarnings("serial")
public class StudentRegistrationException extends Exception{
	/**
	 * 
	 * @param message
	 */
	public StudentRegistrationException(String message) {
		super(message);
	}
}
