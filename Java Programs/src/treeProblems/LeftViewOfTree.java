package treeProblems;

/*
 *  Print the first node in that level
 */
public class LeftViewOfTree extends HeightOfaTree{
	static Node root;
	static int maxlevel;
	
	public static void printView(Node root, int level) {
		if(root == null) {
			return;
		}else if (level > maxlevel) {
			System.out.print(root.n+" ");
			maxlevel = level;
		}
		printView(root.left, level+1);
		printView(root.right, level+1);
	}

	public static void main(String args[]) {
		root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(4); 
        root.left.left = new Node(3); 
        root.left.left.right = new Node(7); 
        root.left.right = new Node(5); 
        root.left.right.left = new Node(6); 
        int height = findHeight(root);
        printView(root,1);
        
	}
}
