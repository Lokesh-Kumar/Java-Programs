package finished;

public class EqualLeftRightSum {

	public static void findEqualSum(int arr[]) {
		int sum = 0;
		for (int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		int lsum=0;
		for(int i=0;i<arr.length;i++) {
			lsum += arr[i];
			if(lsum == sum) {
				System.out.println(i);
			}
			sum -= arr[i];
		}
	}
	public static void main(String args[]) {
		int arr[] = {1,2,4,2,1,2,4};
		findEqualSum(arr);
	}
}
