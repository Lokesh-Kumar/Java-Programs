package kadanes_algorithm;

public class Max0sbyflippingsubarray {

	public static int findMaxZeroCount(int arr[], int n) 
    { 
        int orig_zero_count = 0; 
        int max_diff = 0; 
        int curr_max = 0; 
       
        for (int i = 0; i < n; i ++) 
        { 
            if (arr[i] == 0) 
               orig_zero_count ++; 
       
            int val = (arr[i] == 1)? 1 : -1; 
       
            // Update current max and max_diff 
            curr_max = Math.max(val, curr_max + val); 
            max_diff = Math.max(max_diff, curr_max); 
        } 
        max_diff = Math.max(0, max_diff); 
       
        return orig_zero_count + max_diff; 
    } 
      
    public static void main(String[] args)  
    { 
        int arr[] = {0, 1, 0, 0, 1, 1, 0}; 
          
        System.out.println(findMaxZeroCount(arr, arr.length)); 
        System.out.println(Math.max(0, -1));
    } 
}
