package chap11.example.ex6;

public class Account {
	private double balance;

	public Account(double balance) {
		this.balance = balance;
	}
	
	//ͬ��ȡǮ����
	public synchronized void draw(double drawAccount){
		if(balance>=drawAccount){
			System.out.print(Thread.currentThread().getName()+" ȡǮ"+drawAccount);
			balance -= drawAccount;
			System.out.println(" (���Ϊ:"+balance+")");
		}else{
			System.out.println(Thread.currentThread().getName()+" ��ǰ����");
		}
	}
}
