package stringFunctions;

public class StringTest {
	public static void main(String args[]) {
		String str ="a";
		String str2="a";
		System.out.println(str==str2);
		String str3 = new String("as");
		String str4 = new String("as");
		System.out.println(str3==str4);
		System.out.println(str==str4);
		
	}
}
