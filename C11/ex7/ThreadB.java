package chap11.example.ex7;


public class ThreadB extends Thread{
	private MyArrayList list;

	public ThreadB(MyArrayList list) {
		this.list = list;
	}
	public void run(){
		list.add("4");
		list.add("5");
		list.add("6");
	}	
}
