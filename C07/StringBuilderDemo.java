package chap7.example;

import java.util.Arrays;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("This "); 
		builder.append("is ").append("a ").append("good ").append("idea!");
		System.out.println(builder);  //û�в������ַ�������builder����ֵ����Ϊ"This is a good idea!"
		
		StringBuilder builder2 = new StringBuilder("01068961626");
		builder2.insert(3, "-");
		System.out.println(builder2);  //���"010-68961626"
		
		StringBuilder builder3 = new StringBuilder("0123456789");
		builder3.delete(3, 6);
		System.out.println(builder3);   //���"0126789"
		
		StringBuilder builder4 = new StringBuilder("0123456789");
		builder4.reverse();
		System.out.println(builder4);   //���"9876543210"
		
		String s1 = new String("hello");
		String s2 = new String("hello");
		System.out.println(s1.equals(s2));   //���true
		
		StringBuilder s3 = new StringBuilder("hello");
		StringBuilder s4 = new StringBuilder("hello");
		System.out.println(s3.equals(s4));   //���false
		
		
	}

}
