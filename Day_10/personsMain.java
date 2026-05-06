package Day_10;

import java.util.Scanner;

public class personsMain {
	// TODO Auto-generated constructor stub
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		try
		{
			System.out.println("Enter Age: ");
			int age=s.nextInt();
			persons p=new persons(age);
			System.out.println("Age: "+p.getAge());
		}
		catch(ageException e)
		{
			System.out.println("Error: "+e.getMessage());
		}
	
}
}
