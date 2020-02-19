package finished;
/*
 * Input:  arr[] = {10, 12, 11};
Output: Length of the longest contiguous subarray is 3

Input:  arr[] = {14, 12, 11, 20};
Output: Length of the longest contiguous subarray is 2

Input:  arr[] = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45};
Output: Length of the longest contiguous subarray is 5

SOLUTION 1: Sort and Find the longest contigous sub array

OPTIMAL SOLUTION :  
		1 -> The difference between the maximum element and the minimium element in the subarray
		 will be equal to the length of it.(Without duplicates)
		2 -> For Duplicates remove with hashset 
 *
 */
public class LongestContigousSubArray {

	   int min(int x, int y)  
	    { 
	        return (x < y) ? x : y; 
	    } 
	   int max(int x, int y)  
	    { 
	        return (x > y) ? x : y; 
	    } 

	public  int longestContiguosSubarray(int arr[]) {
		int maxlen = 1;
		for(int i = 0; i<arr.length;i++) {
			int mn = arr[i],mx=arr[i];
			for(int j=i+1;j<arr.length;j++) {
				mn = min(mn,arr[j]);
				mx = max(mx,arr[j]);
				if(mx-mn == j-i && mx-mn >maxlen) {
					maxlen = mx-mn +1;
				}
			}
		}
		return maxlen;
	}
	public static void main(String args[]) {
		int arr[] = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45};
		LongestContigousSubArray l = new LongestContigousSubArray();
		System.out.println(l.longestContiguosSubarray(arr));
	}
}



/*
 *  for (int i=0; i<n-1; i++) 
        { 
            // Create an empty hash set and add i'th element 
            // to it. 
            HashSet<Integer> set = new HashSet<>(); 
            set.add(arr[i]); 
  
            // Initialize max and min in current subarray 
            int mn = arr[i], mx = arr[i]; 
  
            // One by one fix ending points 
            for (int j=i+1; j<n; j++) 
            { 
                // If current element is already in hash set, then 
                // this subarray cannot contain contiguous elements 
                if (set.contains(arr[j])) 
                    break; 
  
                // Else add curremt element to hash set and update 
                // min, max if required. 
                set.add(arr[j]); 
                mn = Math.min(mn, arr[j]); 
                mx = Math.max(mx, arr[j]); 
  
                // We have already cheched for duplicates, now check 
                // for other property and update max_len if needed 
                if (mx-mn == j-i) 
                    max_len = Math.max(max_len, mx-mn+1); 
            } 
        } 
 * 
 * 
 */
