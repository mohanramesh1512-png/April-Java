package Day_5;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Duration_12 {
	public static void timeDuration(String s1,String s2) {
		LocalDate inputDate=LocalDate.parse(s1);
		LocalDate inputDate2=LocalDate.parse(s2);
		Period period;
		if (inputDate.isAfter(inputDate2)){
			period=Period.between(inputDate2, inputDate);
			System.out.println(period.getYears()+" years - "+period.getMonths()+" months -"+period.getDays()+" days - future");
		}else {
		period=Period.between(inputDate, inputDate2);
		System.out.println("Duration :"+period.getYears()+" years -"+period.getMonths()+" months -"+period.getDays()+" days");
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter date 1 in YYYY-MM-DD format");
	String s1=sc.nextLine();
	System.out.println("Enter date 2 in YYYY-MM-DD format");
	String s2=sc.nextLine();
	timeDuration(s1,s2);
	}
}
