package chap9.example.ex1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		Scanner scn  = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.print("��������(yyyy-MM-dd):");
		String birthStr = scn.next();
		
		try {
			//���birthStr���ɽ���, ���׳��쳣
			Date birth = sdf.parse(birthStr);
			System.out.println("����:"+sdf.format(birth));
		} catch (ParseException e) { //�����쳣
			System.out.println("���ڸ�ʽ��!");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
