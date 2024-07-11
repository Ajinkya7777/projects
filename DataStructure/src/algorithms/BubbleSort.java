package algorithms;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		
		int[] nos = {17,4,3,90,2,65,1};
		for(int i=0;i<nos.length-1;i++) {
			int min=i;
			for (int j = i+1; j < nos.length; j++) {
				if(nos[min]>nos[j]) {
					min=j;
				}
			}
//			int temp=nos[i]; //17
//			 nos[i]=nos[minIndex];//4
//			 nos[minIndex]=temp;//17
			 
			 int temp=nos[min];
			  nos[min]=nos[i];
			  nos[i]=temp;
		}
		Arrays.stream(nos).forEach(no->System.out.println(no));
	}
}
