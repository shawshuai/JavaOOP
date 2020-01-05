package chap11.example.ex5;

public class MyRunnable implements Runnable{
	private int i=0;  //i×÷ÎªÊôĞÔ
	public void run(){
		while(i<5){
			i++;			
			for (int j = 0; j < 20000000; j++);
			System.out.print(Thread.currentThread().getName()+" ");
			System.out.println("i="+i);			
		}
	}
}

