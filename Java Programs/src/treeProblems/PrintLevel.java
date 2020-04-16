package treeProblems;

public class PrintLevel {
	static Node root;
	
	public static void printLevel(Node root, int level) {
		if(root==null){
			return;
		}else {
			if(level == 1 ) {
				System.out.print(root.n + " ");
			}else if(level >=1) {
				printLevel(root.left,level-1);
				printLevel(root.right,level-1);
			}
		}
	}
	
	void printSpiral(Node node) 
    { 
        int h = 1;//height(node); 
		int i; 
        boolean ltr = false; 
        for (i = 1; i <= h; i++) { 
            printGivenLevel(node, i, ltr); 
            ltr = !ltr; 
        } 
    } 
	 void printGivenLevel(Node node, int level, boolean ltr) 
	    { 
	        if (node == null) 
	            return; 
	        if (level == 1) 
	            System.out.print(node.n + " "); 
	        else if (level > 1) { 
	            if (ltr != false) { 
	                printGivenLevel(node.left, level - 1, ltr); 
	                printGivenLevel(node.right, level - 1, ltr); 
	            } 
	            else { 
	                printGivenLevel(node.right, level - 1, ltr); 
	                printGivenLevel(node.left, level - 1, ltr); 
	            } 
	        } 
	    } 
	 public static void main(String args[]) {
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(2);
		root.left.left = new Node(3); 
		root.left.right = new Node(3);
		root.right.left=new Node(3);
		root.right.right=new Node(3);
		root.left.left.left = new Node(4);
		root.left.left.right = new Node(4);
		
		printLevel(root,3);
	}
}
