package chap4.example.ex5;

public class StaticBlockTest {
	static{		
		System.out.println("��̬�������������ڱ�����...");
	}
	
	public StaticBlockTest() {
		System.out.println("������Ķ���...");
	}

	public static void main(String[] args) {
		new StaticBlockTest();
		new StaticBlockTest();
	}
}
