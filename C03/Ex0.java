package chap3.example;

public class Ex0 {
	public static void main(String[] args) {
		int sum =getSum(new int[]{1,2,3,4,5});   //��������������
		System.out.println("sum="+sum);
	}
	
	public static int getSum(int[] a){  //�βν�����������
		int sum=0;
		for(int i=0;i<a.length; i++){
			sum+=a[i];
		}
		return sum;
	}
	
}
