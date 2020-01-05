package chap11.example.ex10;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Test {
	public static void main(String[] args) {
		BlockingQueue store = new ArrayBlockingQueue(5);
		Producer p1 = new Producer("A",store);
		Producer p2 = new Producer("B",store);
		Customer c1 = new Customer("C",store);
		
		p1.start();
		p2.start();
		c1.start();
	}

}
