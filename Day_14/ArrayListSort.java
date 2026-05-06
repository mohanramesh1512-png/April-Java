package Day_14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListSort {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		ArrayList<String> products=new ArrayList<>();
		System.out.print("Enter number of products: ");
		int n=s.nextInt();s.nextLine();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter product "+(i+1)+": ");
			String product=s.nextLine();
		
			products.add(product);
		}
		Collections.sort(products);
		System.out.println("\nSorted Product Names");
		for(String product:products)
		{
			System.out.println(product);
		}
		}
}
