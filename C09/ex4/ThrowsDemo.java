package chap9.example.ex4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ThrowsDemo {

	public static void main(String[] args) throws ParseException{
		Scanner scn  = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.print("��������(yyyy-MM-dd):");
		String birthStr = scn.next();
		
		//���birthStr���ɽ���, ���׳��쳣
		Date birth = sdf.parse(birthStr);
		System.out.println("����:"+sdf.format(birth)); 
	}
}
