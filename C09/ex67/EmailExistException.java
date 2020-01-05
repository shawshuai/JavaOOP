package chap9.example.ex67;

public class EmailExistException extends Exception{
	public EmailExistException(){
		
	}
	public EmailExistException(String msg){
		super(msg);
	}
}
