package chap3.example;

public class Ex5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1+2="+getSum(1,2));     //2������
		System.out.println("1+2+3="+getSum(1,2,3));  ////3������
		System.out.println("1+2+3+4+5="+getSum(1,2,3,4,5));  //5������

	}
	public static int getSum(int... numbers){ //�ɱ䳤�βΣ�����Ϊ����
		int sum=0;
		for(int i=0; i<numbers.length; i++){  //������ķ�ʽ����
			sum+=numbers[i];
		}
		return sum;
	}
	
	

}
