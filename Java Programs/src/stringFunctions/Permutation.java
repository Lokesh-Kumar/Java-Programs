package stringFunctions;

import java.util.ArrayList;
import java.util.Collections;

public class Permutation {

	   public static ArrayList<String> arl = new ArrayList<String>();
	   
	   private static void permute(String str, int l, int r) 
	    { 
	        if (l == r) 
	            arl.add(str); 
	        else { 
	            for (int i = l; i <= r; i++) { 
	            	//System.out.println("str "+str+" l "+l+" r "+r);
	                str = swap(str, l, i); 
	                permute(str, l + 1, r); 
	                str = swap(str, l, i); 
	            } 
	        } 
	    }
	    public static String swap(String a, int i, int j) 
	    { 
	        char temp; 
	        char[] charArray = a.toCharArray(); 
	        temp = charArray[i]; 
	        charArray[i] = charArray[j]; 
	        charArray[j] = temp; 
	        return String.valueOf(charArray); 
	    } 
	    
	    public static void main(String[] args) 
	    { 
	        String str = "acb"; 
	        int n = str.length(); 
	        permute(str, 0, n - 1); 
	        Collections.sort(arl);
	        System.out.println(arl.indexOf("acb"));
	    } 
}
