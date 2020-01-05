package chap11.example.ex8;

public class Pasta extends Thread{
	private Object message;
	
	public Pasta(Object message) {
		this.message = message;
	}

	public void run(){
		synchronized(message){
			for(int i=1; i<=20; i++){
				System.out.println(this.getName()+"���һ���������... ");
				if(i%2==0){  //�������
					System.out.println("������������...");
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

}