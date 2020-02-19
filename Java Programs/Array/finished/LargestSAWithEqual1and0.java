package finished;
/*
 * Input: arr[] = {1, 0, 1, 1, 1, 0, 0}
Output: 1 to 6 (Starting and Ending indexes of output subarray)

Input: arr[] = {1, 1, 1, 1}
Output: No such subarray

Input: arr[] = {0, 0, 1, 1, 0}
Output: 0 to 3 Or 1 to 4
 */
public class LargestSAWithEqual1and0 {

	public static int findLargeSA(int arr[]) {
		int max = 0;
		int start = 0;
		int end = 0;
		for(int i =0 ;i<arr.length;i++) {
			int length = 0;
			int val = 0;
			for(int j=i;j<arr.length;j++) {
				if(arr[j]==0) {
					val--;
				} else {
					val++;
				}
				if(val==0 &&(j-i)>max) {
					max = j-i+1;
					start = i;
				}
			}
		}
		System.out.println(start+" "+(start+max-1));
		return max;
	}
	public static void main(String args[]) {
		//int arr[] = {1, 0, 1, 1, 1, 0, 0};
		//int arr[] = {1, 1, 1, 1};
		int arr[] = {0, 0, 1, 1, 0};
		System.out.println(findLargeSA(arr));
	}
}
