package finished;

public class FibonacciSeries {

	public static int fibonacci(int n) {
		if(n==1 || n==2) {
			return 1;
		}
		else {
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}
	public static void main(String args[]) {
		int n=9;
		for(int i=1;i<=n;i++) {
			System.out.println(fibonacci(i));
		}
	}
}
