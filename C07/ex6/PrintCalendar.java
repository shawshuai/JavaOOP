package chap7.example.ex6;

import java.util.Calendar;

public class PrintCalendar {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		cal.set(Calendar.YEAR, 2015);
		cal.set(Calendar.MONTH,10);
		cal.set(Calendar.DAY_OF_MONTH,1);
		
		//���������		
		System.out.println("*******************"+cal.get(Calendar.YEAR)+"��"+(cal.get(Calendar.MONTH)+1)+"������*******************");
		System.out.println("��\tһ\t��\t��\t��\t��\t��");
		
		//�������ڣ������֮ǰ�Ŀհ�
		int day_of_week = cal.get(Calendar.DAY_OF_WEEK);
		for(int s=1; s<day_of_week; s++){
			System.out.print("\t");
		}
		
		//�������������
		for(int day=1; day<=cal.getActualMaximum(Calendar.DAY_OF_MONTH); day++){
			System.out.print(day+"\t");
			if((day+day_of_week-1)%7==0){
				System.out.println();
			}
		}
		

	}

}
