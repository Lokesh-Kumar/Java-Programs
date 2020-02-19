package finished;

import java.util.HashSet;

public class FindDuplicates {

	public static void findDuplicate(String str) {
		HashSet<Character> hs = new HashSet<Character>();
		for(Character a:str.toCharArray()) {
			if(hs.contains(a)) {
				System.out.print(a+" ");
			}else {
				hs.add(a);
			}
		}
		//System.out.print(hs.toArray());
	}
	public static void main(String args[]) {
		String str = "This is a sample String";
		findDuplicate(str);
	}
}
