package chap11.example.ex4;

public class MyThread  implements Runnable {
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName()+"开始运行....");
			Thread.sleep(5000);
			System.out.println( Thread.currentThread().getName()+"睡眠时间到....");
		} catch (InterruptedException e) {
			System.out.println( Thread.currentThread().getName()+"被打断....");
		}
		System.out.println( Thread.currentThread().getName()+"结束....");
	}
}
