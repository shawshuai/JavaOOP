package chap7.example.ex6;

import java.util.Calendar;

public class PrintCalendar {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		cal.set(Calendar.YEAR, 2015);
		cal.set(Calendar.MONTH,10);
		cal.set(Calendar.DAY_OF_MONTH,1);
		
		//输出标题行		
		System.out.println("*******************"+cal.get(Calendar.YEAR)+"年"+(cal.get(Calendar.MONTH)+1)+"月日历*******************");
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		
		//计算星期，并输出之前的空白
		int day_of_week = cal.get(Calendar.DAY_OF_WEEK);
		for(int s=1; s<day_of_week; s++){
			System.out.print("\t");
		}
		
		//输出该月所有天
		for(int day=1; day<=cal.getActualMaximum(Calendar.DAY_OF_MONTH); day++){
			System.out.print(day+"\t");
			if((day+day_of_week-1)%7==0){
				System.out.println();
			}
		}
		

	}

}
