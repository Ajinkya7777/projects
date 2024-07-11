package array;

import java.util.Scanner;

public class Largest {
 private static Scanner scanner=new Scanner(System.in);
 public static void main(String[] args) {
	
	 System.out.println("Enter the size of an array: ");
	 int size=scanner.nextInt();
	
	int[] arr = new int[size];
	
	System.out.println("Enter the elements in an array: ");
	for(int i=0;i<arr.length;i++) {
		arr[i]=scanner.nextInt();
	}
	
	System.out.print("Largest element: "+new Largest().largestElement(arr));
	
	
}
 
 public int largestElement(int[] arr) {
	 int max = Integer.MIN_VALUE;
	 for(int i:arr) {
		 if(max<i)
			 max=i;
	 }
	 return max;
 }
}
