package chap3.example;

import java.util.Arrays;

public class Ex7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = new int[]{32, 32, 96, 10, 29, 55};	
//		
//		for(int i=0; i<a.length; i++){
//			a[i] = (int)(Math.random()*100);			
//		}
		
		System.out.println(Arrays.toString(a));  //��"[32, 32, 96, 10, 29, 55]"��ʽ��ӡ���		
		Arrays.sort(a);   //������a��������		
		System.out.println(Arrays.toString(a));  //��"[10, 29, 32, 32, 55, 96]"��ʽ��ӡ���
		
		
		int[] b=Arrays.copyOf(a,a.length);
		b[0]=1;
		System.out.println(Arrays.toString(a));  
		System.out.println(Arrays.toString(b));  
	}

}
