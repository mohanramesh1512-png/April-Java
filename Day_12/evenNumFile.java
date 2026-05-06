package Day_12;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class evenNumFile {
	public static void main(String[] args)
	{
		String fileName="numbers.txt";
		try
		{
			Scanner s = new Scanner(new File(fileName));
			String data=s.nextLine();
			String[] numbers=data.split(",");
			System.out.println("Even numbers: ");
			for(String n:numbers)
			{
				int num=Integer.parseInt(n.trim());
				if(num%2==0)
				{
					System.out.println(num + " ");
				}
			}
			s.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
