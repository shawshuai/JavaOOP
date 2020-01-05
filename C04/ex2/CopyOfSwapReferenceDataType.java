package chap4.example.ex2;

public class CopyOfSwapReferenceDataType {
	public void swap(Hotel h1, Hotel h2){
		String name;
		
		//交换两个对象在堆内存中的取值
		name = h1.getName();
		h1.setName(h2.getName());
		h2.setName(name);
	}
	
	public static void main(String[] args) {
		CopyOfSwapReferenceDataType test = new CopyOfSwapReferenceDataType(); 
		
		Hotel h1 = new Hotel("Hilton");
		Hotel h2 = new Hotel("Starwood");
		
		System.out.println("交换前：h1:"+h1.getName()+",h2:"+h2.getName());
		test.swap(h1,h2);
		System.out.println("交换后：h1:"+h1.getName()+",h2:"+h2.getName());
	}
}
