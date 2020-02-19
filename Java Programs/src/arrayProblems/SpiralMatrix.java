package arrayProblems;

public class SpiralMatrix {
	
	public static void printSpiralMatrix(int arr[][]) {
		int l=0;
		int r=arr[l].length;
		int t=0,d=arr.length;
		System.out.println(l +" "+r+" "+t+" "+d);
		while(l<r && t<d) {
			
				for(int i = l;i<r;i++) {
					System.out.print(arr[t][i]+" ");
				}
				t++;
				for(int i= t;i<d;i++) {
					System.out.print(arr[i][r-1]+" ");
				}
				r--;
		
			if(l<r) {
				for(int i=r-1;i>=l;i--) {
					System.out.print(arr[d-1][i]+" ");
				}
				d--;
			}
			if(t<d) {
				for(int i=d-1;i>=t;i--) {
					System.out.print(arr[i][l]+" ");
				}
				l++;
			}
		}
	}

	public static void main(String args[]) {
		int arr[][]= {
						{1,2,3,4,5},
						{6,7,8,9,10},
						{11,12,13,14,15},
						{16,17,18,19,20},
						{21,22,23,24,25},
						{26,27,28,29,30}				
					};
		printSpiralMatrix(arr);
	}
}


/*
 * 
 *  Geeks Solution
 * package arrayProblems;
public class Test { 
    // Function print matrix in spiral form 
    static void spiralPrint(int m, int n, int a[][]) 
    { 
        int i, k = 0, l = 0; 
        /*  k - starting row index 
        m - ending row index 
        l - starting column index 
        n - ending column index 
        i - iterator 
        
  
        while (k < m && l < n) { 
            // Print the first row from the remaining rows 
            for (i = l; i < n; ++i) { 
                System.out.print(a[k][i] + " "); 
            } 
            k++; 
  
            // Print the last column from the remaining columns 
            for (i = k; i < m; ++i) { 
                System.out.print(a[i][n - 1] + " "); 
            } 
            n--; 
  
            // Print the last row from the remaining rows 
            if (k < m) { 
                for (i = n - 1; i >= l; --i) { 
                    System.out.print(a[m - 1][i] + " "); 
                } 
                m--; 
            } 
  
            // Print the first column from the remaining columns 
            if (l < n) { 
                for (i = m - 1; i >= k; --i) { 
                    System.out.print(a[i][l] + " "); 
                } 
                l++; 
            } 
        } 
    } 
  
    // driver program 
    public static void main(String[] args) 
    { 
        int R = 6; 
        int C = 5; 
        int a[][] = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25},
				{26,27,28,29,30}	}; 
        spiralPrint(R, C, a); 
    } 
} 
 * 
 */
