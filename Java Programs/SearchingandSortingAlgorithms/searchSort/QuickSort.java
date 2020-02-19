package searchSort;

import java.util.Arrays;

public class QuickSort {
	public static int[] swap (int arr[] , int i , int j ) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
		return arr;
	}
	
	public static int  partition(int arr[], int l , int r) {
		int pivot = r;
		int i = l-1;
		for (int j = l; j< r ;j++) {
			if(arr[j]<arr[pivot]) {
				i++;
				arr = swap(arr,i,j);
			}
		}
		swap(arr, i+1, pivot);
		return i+1;
	}
	
	public static void sort(int arr[] , int l , int r) {
		if(l< r) {
			int p = partition(arr, l,r);
			sort(arr,l,p-1);
			sort(arr,p+1,r);
		}
	}
	
	
	public static void main(String args[]) {
		int arr[] = {12,2,64,3,76,44,72,56};
		sort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
