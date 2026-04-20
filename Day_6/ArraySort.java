package Day_6;

import java.util.*;

public class ArraySort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String arr[] = new String[n];
		for(int i=0;i<n;i++) {
			arr[i]= sc.next();
		}
		System.out.println("Original Array");
		System.out.println(Arrays.toString(arr));
		System.out.println("Sorted Array:");
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
