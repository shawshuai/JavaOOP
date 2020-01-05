package chap3.example;

public class Ex1 {

	/**
	 * 数组的引用赋值
	 */
	public static void main(String[] args) {
		int[] a={1,2,3,4,5},b;
		
		b=a;
		b[0]=10;
		System.out.println("a[0]="+a[0]);
	}

}
