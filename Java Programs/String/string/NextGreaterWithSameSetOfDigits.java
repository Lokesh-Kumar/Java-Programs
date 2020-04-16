package string;

import java.util.Arrays;

/*
 * Find next greater number with same set of digits
Input:  n = "218765"
Output: "251678"

Input:  n = "1234"
Output: "1243"

Input: n = "4321"
Output: "Not Possible"

Input: n = "534976"
Output: "536479"
 */
public class NextGreaterWithSameSetOfDigits {
	public static String swap(String str, int i , int j) {
		char a[]=str.toCharArray();
		char temp = a[i];
		a[i] = a[j];
		a[j]=temp;
		return String.valueOf(a);
	}
    static void findNext(char ar[], int n)  
    { 
        int i; 
          
        // I) Start from the right most digit  
        // and find the first digit that is smaller  
        // than the digit next to it. 
        for (i = n - 1; i > 0; i--)  
        { 
            if (ar[i] > ar[i - 1]) { 
                break; 
            } 
        } 
          
        // If no such digit is found, then all  
        // digits are in descending order means  
        // there cannot be a greater number with  
        // same set of digits 
        if (i == 0)  
        { 
            System.out.println("Not possible"); 
        }  
        else 
        { 
            int x = ar[i - 1], min = i; 
              
            // II) Find the smallest digit on right  
            // side of (i-1)'th digit that is greater  
            // than number[i-1] 
            for (int j = i + 1; j < n; j++)  
            { 
                if (ar[j] > x && ar[j] < ar[min])  
                { 
                    min = j; 
                } 
            } 
  
            // III) Swap the above found smallest  
            // digit with number[i-1] 
            swap(String.valueOf(ar), i - 1, min); 
  
            // IV) Sort the digits after (i-1)  
            // in ascending order 
            Arrays.sort(ar, i, n); 
            System.out.print("Next number with same" + 
                                    " set of digits is "); 
            for (i = 0; i < n; i++) 
                System.out.print(ar[i]); 
        } 
    } 
	public static void main(String args[]) {
		char a[] = "218765".toCharArray();
		findNext(a , a.length);
	}
}
