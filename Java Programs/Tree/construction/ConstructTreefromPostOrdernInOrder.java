package construction;

import treeProblems.Node;

public class ConstructTreefromPostOrdernInOrder {
 /* Recursive function to construct binary of size n 
    from  Inorder traversal in[] and Postrder traversal 
    post[].  Initial values of inStrt and inEnd should 
    be 0 and n -1.  The function doesn't do any error 
    checking for cases where inorder and postorder 
    do not form a tree */
 Node buildUtil(int in[], int post[], int inStrt, 
                int inEnd, int pIndex) 
 { 
     // Base case 
     if (inStrt > inEnd) 
         return null; 

     /* Pick current node from Postrder traversal using 
        postIndex and decrement postIndex */
     Node node = new Node(post[pIndex]); 
     (pIndex)--; 

     /* If this node has no children then return */
     if (inStrt == inEnd) 
         return node; 

     /* Else find the index of this node in Inorder 
        traversal */
     int iIndex = search(in, inStrt, inEnd, node.n); 

     /* Using index in Inorder traversal, construct left and 
        right subtress */
     node.right = buildUtil(in, post, iIndex + 1, inEnd, pIndex); 
     node.left = buildUtil(in, post, inStrt, iIndex - 1, pIndex); 
/*		for PreorderTraversal
 * 	 tNode.left = buildTree(in, pre, inStrt, inIndex - 1); 
        tNode.right = buildTree(in, pre, inIndex + 1, inEnd); 
 */
     return node; 
 } 

 // This function mainly initializes index of root 
 // and calls buildUtil() 
 Node buildTree(int in[], int post[], int n) 
 { 
     int pIndex = n-1;  
     return buildUtil(in, post, 0, n - 1, pIndex); 
 } 

 /* Function to find index of value in arr[start...end] 
    The function assumes that value is postsent in in[] */
 int search(int arr[], int strt, int end, int value) 
 { 
     int i; 
     for (i = strt; i <= end; i++) { 
         if (arr[i] == value) 
             break; 
     } 
     return i; 
 } 

 /* This funtcion is here just to test  */
 void preOrder(Node node) 
 { 
     if (node == null) 
         return; 
     System.out.print(node.n + " "); 
     preOrder(node.left); 
     preOrder(node.right); 
 } 

 public static void main(String[] args) 
 { 
	 ConstructTreefromPostOrdernInOrder tree = new ConstructTreefromPostOrdernInOrder(); 
     int post[] = new int[] { 9,1,2,12,7,5,3,11,4,8 }; 
     int in[] = new int[] {9,5,1,7,2,12,8,4,3,11}; 
     int n = in.length; 
     Node root = tree.buildTree(in, post, n); 
     System.out.println("Preorder of the constructed tree : "); 
     tree.preOrder(root); 
 } 
} 
