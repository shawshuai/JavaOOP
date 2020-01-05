package chap4.example.ex2;

public class SwapReferenceDataType {
	public void swap(Hotel h1, Hotel h2){
		Hotel h;
		
		h=h1;	h1=h2;	h2=h;  //交换两个引用变量的指向		
	}
	
	public static void main(String[] args) {
		SwapReferenceDataType test = new SwapReferenceDataType(); //创建测试类对象
		
		Hotel h1 = new Hotel("Hilton");
		Hotel h2 = new Hotel("Starwood");
		
		System.out.println("交换前：h1:"+h1.getName()+",h2:"+h2.getName());
		test.swap(h1,h2);
		System.out.println("交换后：h1:"+h1.getName()+",h2:"+h2.getName());
	}
}
