

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class PersonDetails_15A {
	public static int calculateAge(String dob) {
		LocalDate date=LocalDate.parse(dob);
		Period period=Period.between(date,LocalDate.now());
		return period.getYears();
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("first_name :");
		String first_name=sc.nextLine();
		System.out.println("last_name :");
		String last_name=sc.nextLine();
		System.out.println("gender :");
		String gender=sc.nextLine();
		System.out.println("DOB(YYYY-MM-DD) :");
		String dob=sc.nextLine();
		System.out.println("weight :");
		double weight= sc.nextDouble();
		Person_15B person= new Person_15B(first_name,last_name,gender,calculateAge(dob),weight);
		System.out.println(person);
		
	}

}
