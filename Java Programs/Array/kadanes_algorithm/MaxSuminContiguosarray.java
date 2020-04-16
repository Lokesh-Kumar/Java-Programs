package kadanes_algorithm;

public class MaxSuminContiguosarray {

	
	public static int maxSubArraySum(int arr[]) {
		int max_sum = 0;
		int curr_sum = 0;
		for(int i=0;i<arr.length;i++) {
			curr_sum = curr_sum+arr[i];
			if(curr_sum<0)
				curr_sum=0;
			if(curr_sum>max_sum)
				max_sum = curr_sum;
		}
		return max_sum;
	}
	public static void main(String args[]) {
		int [] a = {-2, -3, 4, -1, -2, 1, 5, -3}; 
        System.out.println("Maximum contiguous sum is " + 
                                       maxSubArraySum(a)); 
	}
}
