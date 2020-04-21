package dynamicprogramming;

import java.util.Arrays;

public class CoinChangeProblem {

	public static void count(int arr[],int N) {
		int poss[] = new int[N+1];
		poss[0]=1;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<=N;j++) {
				if(j>=arr[i]) {
					poss[j]+= poss[j-arr[i]]; 
				}
			}
		}
		System.out.println(Arrays.toString(poss));
	}
	public static void main(String args[]) {
		int arr[]= {1,2,5};
		int N =12;
		count(arr,N); 
	}
}
