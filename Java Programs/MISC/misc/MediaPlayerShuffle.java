package misc;

import java.util.Arrays;

public class MediaPlayerShuffle {
	public static void swap(int arr[],int l, int r) {
		int temp = arr[l];
		arr[l]=arr[r];
		arr[r]=temp;
	}

	public static void shufflePlay(int arr[],int n){
		int pivot = arr.length-1;
		while(n--!=0) {
			int val;
			if(pivot==0) {
				val =pivot;
				System.out.println(arr[val] +"   "+Arrays.toString(arr) + pivot);
				swap(arr,val,pivot);
				pivot = arr.length-1;
			}else {
				 val = (int)(Math.random()*10) % (pivot);
				 System.out.println(arr[val] +"   "+Arrays.toString(arr) + pivot);
				 swap(arr,val,pivot);
				 pivot--;
			}
			
		}
	}
	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5,6,7,8};
		shufflePlay(arr,20);
	}
}
