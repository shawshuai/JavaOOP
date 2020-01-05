package chap11.example.ex7;

public class ThreadA extends Thread{
	private MyArrayList list;

	public ThreadA(MyArrayList list) {
		this.list = list;
	}
	public void run(){
		list.add("1");
		list.add("2");
		list.add("3");
	}
}
