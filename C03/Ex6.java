package chap3.example;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("����Ҫ��ӡ����������ε�����:");
		int n = scn.nextInt();
		
		int[][] tri = new int[n][];   //����n��
		
		 //��1�е�1��Ԫ��Ϊ0
		tri[0] = new int[1];
		tri[0][0]=1; 		
		
		for(int i=1; i<tri.length; i++){  //һ��һ�еش���
			tri[i] = new int[i+1];  //�к�i��0��ʼ����i����i+1��Ԫ��
			
			tri[i][0]=tri[i][i]=1;   //��һ�������һ��Ԫ����1
			
			//�м�ÿ��Ԫ��=��һ������Ԫ��֮��
			for(int j=1; j<i; j++){
				tri[i][j]=tri[i-1][j-1]+tri[i-1][j];
			}			
		}
			
		for(int i=0; i<tri.length; i++){
			for (int j=0; j<tri[i].length; j++){
				System.out.printf("%4d", tri[i][j]);
			}
			System.out.println();
		}
		
		for(int[] rows: tri){  //��ά�����ÿ����һά���飬����������һά����Ԫ������int[]
			for(int element :rows){  //��ÿ�н��е����������Ķ���Ϊһά����Ԫ��rows
				System.out.printf("%4d",element);
			}
			System.out.println();
		}
	}
	



}
