package array;

import java.util.Arrays;

public class ArrayOperations {
 public static void main(String[] args) {
	int[] arr = {5,4,3,2,1};
    int key =4;
    ArrayOperations ops = new ArrayOperations();
    System.out.println(ops.searchOperations(key,arr));
    System.out.println(ops.binarySearch(key,arr));
       arr = ops.sortArray(arr);
       Arrays.stream(arr).forEach(a->System.out.print(a+" "));
       System.out.println();
       ops.insertion(7, arr, 1);
       Arrays.stream(arr).forEach(a->System.out.print(a+" "));
       System.out.println();
       arr=ops.deletion(7, arr, 1);
       Arrays.stream(arr).forEach(a->System.out.print(a+" "));
       
      
    
   
   //System.out.println(Arrays.stream(arr).anyMatch(a->a==key));
   
}
 
 
 //linear search method
 public int searchOperations(int key,int[] arr) {
	  for(int i=0;i<arr.length;i++) {
		  if(arr[i]==key)
			  return i;
	  }
	  return -1;
 }
 
 //binary search method
 public int binarySearch(int key,int[] arr) {
	 int start=0;
	 int end=arr.length-1;
	 Arrays.sort(arr);
	 while(start<=end) {
	 int mid=(start+end)/2;
		 if(arr[mid]==key)
			 return mid;
		 else if(key>arr[mid])
			 start=mid+1;
		 else if(key<arr[mid])
			 end=mid-1;
	 }
	 return -1;
 }
 
 //inserting an element
 public int insertion(int key,int[] arr,int index) {
	 for(int i=index;i<arr.length;i++) {
		 arr[index+1]=arr[index];
	 }
	 arr[index]=key;
	 return key;
 }
 
 //deleting of an element
 public int[] deletion(int key,int[] arr,int index) {
	 for(int i=index;i<arr.length-1;i++) {
		 arr[i]=arr[i+1];
	 }
	 return Arrays.copyOf(arr, arr.length-1);
	
 }
 
 //sort the array 
 public int[] sortArray(int[] arr) {
	 for(int i=0;i<arr.length;i++) {
		 for(int j=i+1;j<arr.length;j++) {
			 if(arr[i]>arr[j]) {
				 int temp=arr[i];
				 arr[i]=arr[j];
				 arr[j]=temp;
			 }
		 }
	 }
	 return arr;
 }
}
