package searchSort;

import java.util.Arrays;
/*
 * Bubble Sort : bubble the element tot the next position if it is greater
 * Selection Sort : move the smallest element to the first position 
 * Insertion Sort : move the element to the correct position from the last
 */

public class ThreeSorting {

	
	public static void bubbleSort(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j]= temp;
				}
			}
		//	System.out.println(Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void insertionSort(int arr[]) {
		for(int i=0 ;i<=arr.length;i++) {
			for(int j = arr.length-1; j>i ;j--) {
				if(arr[i]>arr[j]) {
					int temp = arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void selectionSort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			int j;
			int smallpos =i+1;
			for(j= i+1;j<arr.length;j++) {
				if(arr[j]<arr[smallpos]) {
					 smallpos = j;
				}
			}
			if(arr[i+1]>arr[smallpos]) {
				int temp = arr[i+1];
				arr[i+1] =arr[smallpos];
				arr[smallpos] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String args[]) {
		int arr[] = {3,5,2,6,8,43,6,8,9}; 
		bubbleSort(arr);
		insertionSort(arr);
		selectionSort(arr);
	}
}
