package chap3.example;

public class Ex0 {
	public static void main(String[] args) {
		int sum =getSum(new int[]{1,2,3,4,5});   //匿名数组做参数
		System.out.println("sum="+sum);
	}
	
	public static int getSum(int[] a){  //形参接收匿名数组
		int sum=0;
		for(int i=0;i<a.length; i++){
			sum+=a[i];
		}
		return sum;
	}
	
}
