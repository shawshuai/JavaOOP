package chap11.example.ex3;

public class RunnableThread implements Runnable{
	
	public void run(){
		for(int i=0; i<5; i++){
			System.out.println("B    is Running...B-"+i);
			try {
				Thread.sleep(500);	//ÐÝÃß500ºÁÃë
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
