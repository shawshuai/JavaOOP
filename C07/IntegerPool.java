package chap7.example;

public class IntegerPool {
	
	public static void main(String[] args) {
//		Integer i1=5;  //向对象池写入Integer对象(5)
//		Integer i2=Integer.valueOf(5);  //将对象池中的Integer对象(5)引用赋值给i2
//		Integer i3=new Integer(5);  //创建新的对象
//		
//		System.out.println(i2==i1);  //true
//		System.out.println(i2==i3);  //false
		
//		Integer i1=250;  
//		Integer i2=Integer.valueOf(250); 
//		Integer i3=new Integer(250);  
//		
//		System.out.println(i2==i1);  //false
//		System.out.println(i2==i3);  //false
		
		for(int i=-150;  i<=150;  i++){			
			Integer i1=i;  
			Integer i2=Integer.valueOf(i); 
			Integer i3=new Integer(i);  
			
			System.out.println(i+":"+ (i2==i1)+","+(i2==i3));			
		}
	}
}
