package chap11.example.ex8;

public class Pizza extends Thread{
	private Object message;
	
	public Pizza(Object message) {
		this.message = message;
	}

	public void run(){
		synchronized(message){
			for(int i=0; i<10; i++){
				System.out.println(this.getName()+":���һ������... ");
				System.out.println("���������������...");		
				
				message.notifyAll();  //���������߳�
				try {
					message.wait();   //�ͷ������ȴ�
				} catch (InterruptedException e) {
					e.printStackTrace();
				}	
			}
		}
	}
}
