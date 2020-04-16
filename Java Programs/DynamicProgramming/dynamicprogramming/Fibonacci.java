package dynamicprogramming;

public class Fibonacci {

	static int lookup[] = new int[50];
	public static int fibonacci(int lookup[], int n) {
		
		if(n<=1) {
			return 1;
		}
		else {
			if(lookup[n] !=0) {
				return lookup[n];
			}else {
				lookup[n]=fibonacci(lookup, n-1)+fibonacci(lookup, n-2);
			}
		}
		return lookup[n];
	}
	public static void main(String args[]) {
		System.out.println(fibonacci(lookup,6));
	}
}

