package finished;
/*
 * Smallest subarray with sum greater than a given value
Given an array of integers and a number x, find the smallest subarray with sum greater than the given value.
Examples:
arr[] = {1, 4, 45, 6, 0, 19}
   x  =  51
Output: 3
Minimum length subarray is {4, 45, 6}

arr[] = {1, 10, 5, 2, 7}
   x  = 9
Output: 1
Minimum length subarray is {10}

arr[] = {1, 11, 100, 1, 0, 200, 3, 2, 1, 250}
    x = 280
Output: 4
Minimum length subarray is {100, 1, 0, 200}

arr[] = {1, 2, 4}
    x = 8
Output : Not Possible
Whole array sum is smaller than 8.
 
 
 Solution 1 :
 
 	Normal Iteration  N^2
 	
 
 *
 */
public class SmallestSubArrayWithSumGreaterThanGivenValue {

	public static int findSmallSubArray(int arr[], int x) {
		int start=0,end=0;
		int n=arr.length;
		int min_len = n+1;
		int cs=0;
		while(end<n) {
			
			while(cs<= x && end<n) {
				cs += arr[end++];
			}//add till it is greater than or equal to x
			
			while(cs>=x &&start<n) {
				if(end-start < min_len) {
					min_len = end-start;
				}
				cs -= arr[start];
				start++;
				
				
			}
		}
		return min_len;
		
	}
	
	public static void main(String agrs[]) {
		int arr[] = {1, 4, 45, 6, 10, 56}; 
		System.out.println(findSmallSubArray(arr,51));
	}
}
