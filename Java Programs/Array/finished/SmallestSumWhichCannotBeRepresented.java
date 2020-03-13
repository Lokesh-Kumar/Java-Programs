package finished;
/*
 * Find the smallest positive integer value that cannot be represented as sum of any subset of a given array
Given a sorted array (sorted in non-decreasing order) of positive numbers, find the smallest positive integer value that cannot be represented as sum of elements of any subset of given set.
Expected time complexity is O(n).
 */
public class SmallestSumWhichCannotBeRepresented {
	
	public static int findSmallestNumber(int arr[]) {
		int sum =1;
		for(int i=0;i<arr.length && arr[i]<=sum;i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
	
	public static void main(String args[]) {
		int arr1[] = {1, 3, 4, 5}; 
		int arr2[] = {1, 2, 6, 10, 11, 15}; 
		int arr3[] = {1, 1, 1, 1}; 
		int arr4[] = {1, 1, 3, 4}; 
		System.out.println(findSmallestNumber(arr1));
		
	}

}
