package chap6.example.ex0;

public class Test {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		a1.move();
		
		Animal a2 = new Bird();	//��������͸���������
		a2.move();
		
		Animal a3= new Fish();
		a3.move();
		
		if(a2 instanceof Bird){
		    ((Bird)a2).singing();   //ǿת����Ե���a2����ʱ���͵ķ�����
		}

	}
}
