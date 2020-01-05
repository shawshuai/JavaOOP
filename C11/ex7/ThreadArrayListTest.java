package chap11.example.ex7;

public class ThreadArrayListTest {
	public static void main(String[] argas){
		MyArrayList list = new MyArrayList();
		
		Thread t1=new ThreadA(list);
		Thread t2=new ThreadB(list);
		
		t1.start();
		t2.start();		
		try{
			Thread.sleep(100);
		}catch(InterruptedException e){			
		}
		
		System.out.print(list);
	}
}
