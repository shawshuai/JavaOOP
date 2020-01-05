package chap11.example.ex72;

public class NameDropper extends Thread{
	private NameList names;

	public NameDropper(NameList names) {
		this.names = names;
	}
	public void run(){
		System.out.println(names.removeFirst());
	}
}
