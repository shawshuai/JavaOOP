package chap11.example.ex8;

public class Test {

	public static void main(String[] args) {
		Object message = new Object();
		Thread t1 = new Pasta(message);  //�����߳�ͨ�ŵ�message����
		Thread t2 = new Pizza(message);  //�����߳�ͨ�ŵ�message����
		t1.start();
		t2.start();
	}
}
