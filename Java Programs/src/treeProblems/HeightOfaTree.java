package treeProblems;

 class Node{
	int n;
	Node left;
	Node right;
	Node(int n){
		this.n= n;
		this.left = null;
		this.right = null;
	}
}

public class HeightOfaTree {
	Node root;
	
	public static int findHeight(Node root) {
		if(root == null) {
			return 0;
		}else {
			int lh =  findHeight(root.left);
			int rh = findHeight(root.right);		
			return (lh>=rh)?lh+1:rh+1;
		}
	}
	
    
	public static void main(String[] args)  
    { 
		HeightOfaTree tree = new HeightOfaTree(); 
	    tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        tree.root.left.right.left = new Node(6); 
   
        System.out.println("Height of tree is : " +  
                                      tree.findHeight(tree.root)); 
    } 
}
