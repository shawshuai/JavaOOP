package chap11.example.ex2;

public class SecondThread implements Runnable{
	private int i=0;  //i��Ϊ����
	//��дrun����
	public void run(){
		for(; i<5; i++){
			//���þ�̬����currentThread()��ȡ�̶߳���
			System.out.println(Thread.currentThread().getName()
					+" :  "+(char)(i+'A'));
			try {
				Thread.sleep(500);	//����500����
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
