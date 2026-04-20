package Day_5;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.swing.text.DateFormatter;

public class DateTime_14 {
	private static void currentDateTime(String s1) {
		ZoneId zoneId=ZoneId.of(s1);
		ZonedDateTime time=ZonedDateTime.now(zoneId);
		
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm:ss");
		System.out.println(time.format(formatter));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Zone");
		String s1=sc.nextLine();
		currentDateTime(s1);
	}

	

}