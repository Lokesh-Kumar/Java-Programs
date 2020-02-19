package finished;
import java.util.*;


//1. Given an array with repeated elements, find the sum of all distinct (non-repeating) elements.
/*
 * Sol 1: Sort and check with nest element 
 * Sol 2: Use HashSet
 */
public class SumOfDistinctElements {

	public static int sumOfDistinct(int arr[]) {
		HashSet <Integer>hs = new HashSet<Integer>();
		int sum =0;
		for( int i=0;i<arr.length;i++) {
			if(!hs.contains(arr[i])) {
				sum +=arr[i];
				hs.add(arr[i]);
			}
		}
		return sum;
	}
	public static void main(String args[]) {
		Scanner s= new Scanner(System.in);
		int arr[] = {1,2,2,1,3};
		System.out.println(sumOfDistinct(arr));
	}
}
