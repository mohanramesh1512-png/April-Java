package Day_5;

import java.time.LocalDate;
import java.util.Scanner;

public class Warranty_13 {
	private static void warrantyDuration(String s1, int s2, int s3) {
		LocalDate purchaseDate=LocalDate.parse(s1);
		LocalDate expiryDate=purchaseDate.plusYears(s2).plusMonths(s3);
		System.out.println("Product ExpiryDate :"+expiryDate);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("product purchase date");
		String s1=sc.nextLine();
		System.out.println("warranty period years");
		int s2=sc.nextInt();
		System.out.println("warranty period month");
		int s3=sc.nextInt();

		warrantyDuration(s1,s2,s3);
	}
	

}
