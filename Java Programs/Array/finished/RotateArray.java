package finished;

public class RotateArray {

	public static void rotateArray(int arr[],int n) {
		for(int i = n % arr.length; i < arr.length + n;i++) {
			System.out.print(arr[i%arr.length]+" ");
		}
	}
	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5,6};
		rotateArray(arr,4);
	}
}
