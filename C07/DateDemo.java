package chap7.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) throws ParseException {
		java.sql.Date birth = new java.sql.Date(new java.util.Date().getTime());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Calendar c1 = Calendar.getInstance();
		c1.set(2016,7,5);	//2016-8-5
		c1.add(Calendar.DAY_OF_MONTH,30);	//2016-9-4
		System.out.println(sdf.format(c1.getTime()));
		c1.set(Calendar.DAY_OF_MONTH,-7);	//2016-8-24
		System.out.println(sdf.format(c1.getTime()));		
		
		Date date = sdf.parse("2016-8-5");
		System.out.println(sdf.format(date));
	}

}
