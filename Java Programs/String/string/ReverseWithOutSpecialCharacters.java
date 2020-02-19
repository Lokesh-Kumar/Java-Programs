package string;
/*
 * 
 * 
Input:   str = "a,b$c"
Output:  str = "c,b$a"
Note that $ and , are not moved anywhere.  
Only subsequence "abc" is reversed

Input:   str = "Ab,c,de!$"
Output:  str = "ed,c,bA!$"
 */
public class ReverseWithOutSpecialCharacters {

	public static boolean isSpecialChar(char c) {
	    return  String.valueOf(c).matches("[^A-Za-z0-9 ]");
	}
    public static char[] swap(char charArray[], int i, int j) 
    { 
        char temp; 
        temp = charArray[i]; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return charArray; 
    } 
	public static String reverseSpecial(String str) {
		char word[]=str.toCharArray();
		int i=0,j=str.length()-1;
		while(i<=j) {
			if(isSpecialChar(word[i])) {
				i++;
			}
			if(isSpecialChar(word[j])) {
				j--;
			}
			if(!isSpecialChar(word[j]) && !isSpecialChar(word[j])) {
				word = swap(word,i,j);
				i++;
				j--;
			}

		}
		return String.valueOf(word);
	}
	public static void main(String args[]) {
		String str = "a,hh";
		System.out.println(reverseSpecial(str));
	}
}
