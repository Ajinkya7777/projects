package algorithms;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] array = {9,5,7,3,8,1};
		int min=0;
		int i,j=0;
		
		for(i=0;i<array.length-1;i++) {
			for(j=i+1;j<array.length;j++) {
				if(array[min]>array[j]) {
					min=j;
				}	
			}
			int temp=array[min];
			array[i]=array[min];
			array[min]=temp;
		}
		Arrays.stream(array).forEach(System.out::print);
	}
}
