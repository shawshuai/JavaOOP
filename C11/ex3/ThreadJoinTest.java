package chap11.example.ex3;

public class ThreadJoinTest {
	public static void main(String[] args) {
		Thread B = new Thread(new RunnableThread());
		B.start();
		for(int i=0; i<5; i++){
			System.out.println("main is running...main-"+i);
			try {
				if(i==2) B.join();   //���̼߳��뵽B�̵߳�ĩβ
				Thread.sleep(300);	//����500����
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
