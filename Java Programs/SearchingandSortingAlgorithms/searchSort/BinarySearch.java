package searchSort;

/*
 * The elements in a binary search should be present in sorte order
 */

public class BinarySearch {

	public static int binarySearch(int arr[],int l,int r, int x) {
	//	System.out.println(l+" "+r+"");
		if(l<=r) {
			int mid = l+ (r-l)/2;
			if(arr[mid] == x) {
				return mid;
			}
			if(arr[mid] > x)
				return binarySearch(arr,l,mid-1,x);
			
			return binarySearch(arr,mid+1,r,x);
		}
		return -1;
	}
	public static void main(String args[]) {
		int arr[] = {1,2,5,6,8,11,13,15};
		System.out.println(binarySearch(arr,0,arr.length,6));
	}
}
