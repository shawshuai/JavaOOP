package chap9.example.ums;

public class EmailExistException extends Exception{

	public EmailExistException() {
		super();
	}
	
	public EmailExistException(String msg) {
		super(msg);
	}
}
