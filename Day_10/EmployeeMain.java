package Day_10;

import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		try
		{
			System.out.println("Enter First Name: ");
			String firstname=s.nextLine();
			System.out.println("Enter Last Name: ");
			String lastname=s.nextLine();
			Employee emp=new Employee(firstname,lastname);
			System.out.println("Full Name: "+emp.getFullName());
		}
		catch(NamedException e)
		{
			System.out.println("Error: "+e.getMessage());
		}
	}
}
