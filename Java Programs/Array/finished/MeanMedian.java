package finished;
import java.util.*; 

public class MeanMedian {

	// Java program to find mean  
	// and median of an array 

	    // Mean is sum of all the numbers divided by the count
	    public static double findMean(int a[], int n) 
	    { 
	        int sum = 0; 
	        for (int i = 0; i < n; i++)  
	            sum += a[i]; 
	      
	        return (double)sum / (double)n; 
	    } 
	  
	    // Median is the middle element of an sorted  array if length is even number divide two middel elements
	    public static double findMedian(int a[], int n) 
	    { 
	        // First we sort the array 
	        Arrays.sort(a); 
	  
	        // check for even case 
	        if (n % 2 != 0) 
	        return (double)a[n / 2]; 
	      
	        return (double)(a[(n - 1) / 2] + a[n / 2]) / 2.0; 
	    } 
	    //Mode is the most frequent element in an array
	    public static int findMode(int a[], int n) {
	    	HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
	    	int max=0;
	    	int mode=0;
	    	for(int i =0;i<n;i++) {
	    		if(hm.containsKey(a[i])) {
	    			int val = hm.get(a[i]);
	    			hm.put(a[i],val++);
	    			if(val>max) {
	    				mode = a[i];
	    				max = val;
	    			}
	    		}
	    		else {
	    			hm.put(a[i],1);
	    		}
	    	}
	    	return mode;
	    }
	  
	    // Driver program 
	    public static void main(String args[]) 
	    { 
	        int a[] = { 1, 3, 4, 2, 7, 5, 8, 6 }; 
	        int n = a.length; 
	        System.out.println("Mean = " + findMean(a, n));  
	        System.out.println("Median = " + findMedian(a, n));  
	        System.out.println("Mode = " + findMode(a, n));  
	    } 
} 
	  

