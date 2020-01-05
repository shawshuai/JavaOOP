package chap11.example.ex72;

public class Test {
	public static void main(String[] argas){
		NameList list = new NameList();
		list.add("Lucy");
		
		Thread t1=new NameDropper(list);
		Thread t2=new NameDropper(list);
		
		t1.start();
		t2.start();		
		try{
			Thread.sleep(100);
		}catch(InterruptedException e){			
		}
	}
}
