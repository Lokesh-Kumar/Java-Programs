package stack;

import java.io.PushbackInputStream;
import java.util.ListIterator;
import java.util.Stack;

public class SortStackRecursion {

	
	static void printStack(Stack s) {
		ListIterator<Integer> li = s.listIterator();
		while(li.hasNext()) {
			System.out.print(li.next()+" ");
		}
	}
	static void sortedInsert(Stack s, int val) {
		if(s.isEmpty()|| (int)s.peek() < val) {
			s.push(val);
		}else {
			int temp = (int)s.pop();
			sortedInsert(s,val);
			s.push(temp);
		}
	}
	static void sortStack(Stack s) {
		if(!s.isEmpty()) {
			int temp = (int) s.pop();
			sortStack(s);
			sortedInsert(s,temp);
			
		}
	}
	public static void main(String args[]) {
		 Stack<Integer> s = new Stack<Integer>(); 
	        s.push(30); 
	        s.push(-5); 
	        s.push(18); 
	        s.push(14); 
	        s.push(-3); 
	       
	        System.out.println("Stack elements before sorting: "); 
	        printStack(s); 
	       
	        sortStack(s); 
	       
	        System.out.println(" \n\nStack elements after sorting:"); 
	        printStack(s); 
	}
}
