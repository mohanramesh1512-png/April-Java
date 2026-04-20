package Day_5;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Duration_11 {
	public static void timeDuration(String s1) {
		LocalDate inputDate=LocalDate.parse(s1);
		if (inputDate.isAfter(LocalDate.now())) {
			System.out.println("Entered Date is in future");
		}
		Period period=Period.between(inputDate, LocalDate.now());
		System.out.println("Duration :"+period.getYears()+" years -"+period.getMonths()+" months -"+period.getDays()+" days");
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter date in YYYY-MM-DD format");
		String s1=sc.nextLine();
		timeDuration(s1);
	}
}
