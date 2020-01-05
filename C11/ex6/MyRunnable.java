package chap11.example.ex6;


public class MyRunnable  implements Runnable{
	private Account account;
	public MyRunnable(Account account) {
		this.account = account;
	}
	public void run() {		
		for(int i=0; i<3; i++){
			account.draw(1000);  //Ã¿´ÎÈ¡1000
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	} 
	public static void main(String[] args) {
		Runnable target = new MyRunnable(new Account(5000));
		Thread t1 = new Thread(target,"wife");
		Thread t2 = new Thread(target,"husband");
		t1.start();
		t2.start();
	}
}
