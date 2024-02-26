package package_Stringfunctions;

import java.util.Date;

public class Current_time {

	public static void main(String[] args) {
		Date d1=new Date();
		System.out.println(d1.getTime());
		
		Date d2=new Date(d1.getTime());
		System.out.println(d2);
		
		
		String mydate=d2.toString();
		System.out.println(mydate);
		System.out.println();

		String day1=mydate.substring(0, 3);
		System.out.println("Day is "+day1);
		String date1=mydate.substring(4, 10);
		System.out.println("Date is "+date1);
		String year1=mydate.substring(24);
		System.out.println("Year is "+year1);
		System.out.println();
		
		// date format dd/mm/yyyy
		String date2=mydate.substring(8, 10);
		String month2=mydate.substring(4, 7);
		System.out.println(date2.concat("/").concat(month2).concat("/").concat(year1));
		
		
		//day after 5 days from today
		Date d=new Date(d1.getTime()+1000*60*60*24*5);
		System.out.println(d);

	}

}
