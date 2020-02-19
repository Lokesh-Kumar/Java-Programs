package searchSort;

import java.util.Arrays;

public class MergeSort {
	
	public static void sort(int arr[], int l, int m,int r) {
		//Find the length of arrays
		int n1 = m-l +1;
		int n2 = r-m;

		//System.out.println(n1+" "+n2+" "+l+" "+m+" "+r);
		//create two arrays
		int a1[] = new int[n1];
		int a2[] = new int[n2];
		//fill the values in the array
		int i=0,j =0;
		for(i = l;i<m+1;i++,j++) {
			a1[j] = arr[i];	
		}
		for(i = m+1,j=0;i<=r;i++,j++) {
			a2[j]=arr[i];
		}
		
		i=0;j=0;
		int k=l;
		while(i<n1 && j<n2) {
			if(a1[i]<=a2[j]) {
				arr[k] = a1[i];
				k++; i++;
			}
			else {
				arr[k]=a2[j];
				k++; j++;
			}
		}
		while(i<n1) {
			arr[k]=a1[i];
			k++;i++;
		}
		while(j<n2) {
			arr[k]=a2[j];
			k++;j++;
		}
 		System.out.println(Arrays.toString(a1)+" "+Arrays.toString(a2)+" "+Arrays.toString(arr));
	}
	public static void mergeSort(int arr[], int l, int r) {
		if(l< r) {
			int m = (l+r)/2;
			mergeSort(arr,l,m);
			mergeSort(arr,m+1,r);
			sort(arr,l,m,r);
		}
	}
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
  
	public static void main(String args[]) {
		int arr[] = {12, 11, 13, 5, 6 ,7};
		//sort(arr,0,2,5);
		mergeSort(arr,0,arr.length-1);
	}
}
