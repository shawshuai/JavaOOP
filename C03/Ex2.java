package chap3.example;

import java.util.Scanner;

public class Ex2 {

	/**
	 * ��3-1������n��ѧ���ĳɼ�������ӡ�ɼ�����ƽ���ֵ�ѧ����
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("����ѧ��������:");
		int count = scn.nextInt();
		double[] score = new double[count]; //��������ֵ��̬ȷ�����鳤��
		
		
		double sum=0;
		for(int i=0; i<score.length; i++){
			System.out.print("����ѧ���ĳɼ�:");
			score[i]=scn.nextDouble();
			sum+=score[i];
		}		
		double average = sum/count;
		System.out.println("ƽ���ɼ�Ϊ��");
		
		System.out.println("����ƽ���ֵ�ѧ���У�");
		for(int i=0; i<score.length; i++){
			if(score[i]>average){
				System.out.println((i+1)+":"+score[i]);
			}
		}
	}
	
	int[] array = new int[]{1,2,3,4,5};
	

}
