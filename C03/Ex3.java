package chap3.example;

import java.util.Scanner;

public class Ex3 {

	/**
	 * ��3-2��ð�ݷ�����
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("��������Ԫ�صĸ���:");
		int count = scn.nextInt();
		int[] array = new int[count]; //��������ֵ��̬ȷ�����鳤��
		
		System.out.println("����ǰ������Ϊ��");
		for(int i=0; i<array.length; i++){
			array[i]=(int)(Math.random()*100);
			System.out.print(array[i]+"  ");
		}
		
		//ð�ݷ�����
		for(int i=0; i<array.length-1 ;i++){
			for(int j=0; j<array.length-1-i; j++){
				if(array[j]>array[j+1]){
					int tmp=array[j];
					array[j]=array[j+1];
					array[j+1]=tmp;
				}
			}
		}
		
		System.out.println();
		System.out.println("�����Ľ��Ϊ��");
		for(int i=0; i<array.length; i++){
			System.out.print(array[i]+"  ");
		}
	}

}
