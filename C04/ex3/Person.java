package chap4.example.ex3;

public class Person {
	public static String nationality="Chinese";
	private String name;

	public static String getNationality() {   //��̬�������ʾ�̬��Ա		
		return nationality;
		//return name+":"+nationality;
	}

	public static void setNationality(String nationality) {  //��̬�������ʾ�̬��Ա
		Person.nationality = nationality;
	}
	
	public void sayHello(){ //�Ǿ�̬�����������þ�̬��Ա
		final int a=0;
		System.out.println("hello,"+nationality+"!");
	}
	
	public static void main(String[] args) {
		new Person().sayHello();  //����Person��������������sayHello����		
	}
}
