package chap11.example.ex4;

public class MyThread  implements Runnable {
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName()+"��ʼ����....");
			Thread.sleep(5000);
			System.out.println( Thread.currentThread().getName()+"˯��ʱ�䵽....");
		} catch (InterruptedException e) {
			System.out.println( Thread.currentThread().getName()+"�����....");
		}
		System.out.println( Thread.currentThread().getName()+"����....");
	}
}
