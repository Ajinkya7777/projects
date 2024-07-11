package array;

import java.util.Scanner;

public class SecondLargest {

	 private static Scanner scanner=new Scanner(System.in);
	 public static void main(String[] args) {
		
		 System.out.println("Enter the size of an array: ");
		 int size=scanner.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter the elements in an array: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scanner.nextInt();
		}
		System.out.println("Second Maximux Element :"+new SecondLargest().secondLargest(arr));
	 }
	 
	 public int secondLargest(int[] arr) {
		 int max=Integer.MIN_VALUE;
		 int secMax=Integer.MIN_VALUE;
		 
		 for(int i:arr) {
			 if(max<i) {
				 secMax=max;
				 max=i;
			 }else if(max>i && secMax<max) {
			    secMax=i; 
			 }
				 
		 }
    return secMax==Integer.MIN_VALUE?-1:secMax;
	 }
}
