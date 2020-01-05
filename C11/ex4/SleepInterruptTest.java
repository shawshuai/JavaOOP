package chap11.example.ex4;

import chap11.example.ex4.MyThread;

public class SleepInterruptTest {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+"开始运行....");
		Thread t = new Thread(new MyThread());
		t.start();
		try {
			Thread.sleep(3000);
        } catch (InterruptedException e) {
        	System.out.println(Thread.currentThread().getName()+"被打断....");
        }
        //打断t线程
        t.interrupt();
        System.out.println(Thread.currentThread().getName()+"结束....");
	}
}
