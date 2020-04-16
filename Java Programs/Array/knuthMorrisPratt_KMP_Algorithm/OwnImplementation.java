package knuthMorrisPratt_KMP_Algorithm;

import java.util.Arrays;

public class OwnImplementation {

	public static void searchKMP(char arr[], char pat[]) {
		int temp[] = new int[pat.length];
		findTemp(pat,temp);
		System.out.println(Arrays.toString(temp));
		
		int i = 0; // index for txt[] 
		int j=0;
		int M = pat.length; 
        int N = arr.length; 
        while (i < N) { 
            if (pat[j] == arr[i]) { 
                j++; 
                i++; 
            } 
            if (j == M) { 
                System.out.println("Found pattern "
                                   + "at index " + (i - j)); 
                j = temp[j - 1]; 
            } 
            // mismatch after j matches 
            else if (i < N && pat[j] != arr[i]) { 
                // Do not match lps[0..lps[j-1]] characters, 
                // they will match anyway 
            	 if (j != 0) 
	                    j = temp[j - 1]; 
	                else
	                    i = i + 1; 
	            } 
            
        }
		
	}
	public static void findTemp(char pat[], int temp[]) {
		temp[0]=0;
		for(int i=1,j=0;i<pat.length;) {
			if(pat[j]==pat[i]) {
				temp[i] = j+1;
				i++;
				j++;
			}else {
				if(j!=0) {
					j=temp[j-1];
				}else {
					temp[i] = 0;
					i++;
				}
				
			}
		}
	}
	public static void main(String args[]) {
		char arr[] = {'a','b','x','a','b','c','a','b','c','a','b','y'};
		//char pat[] = {'a','b','c','a','b','y'};
		char pat[] = {'a','a','b','a','a','b','a','a','a'};
		searchKMP(arr, pat);
	}
}
