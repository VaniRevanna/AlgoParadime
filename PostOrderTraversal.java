package Trees;

import java.util.ArrayList;
import java.util.Stack;

import Trees.PreOrderTraversal.TreeNode;

public class PostOrderTraversal {
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int val) {
			this.val = val;
		}
	}
	
	// recursive traversal
	public static void postOrderTraversalRecursive(TreeNode root) {
		
		if(root!=null) {
			
			postOrderTraversalRecursive(root.left);
			postOrderTraversalRecursive(root.right);
			System.out.println(root.val);
		}
	}
		
	static // An iterative function to do postorder traversal  
    // of a given binary tree 
    ArrayList<Integer> postOrderIterative(TreeNode node)  
    { 
        Stack<TreeNode> S = new Stack<TreeNode>(); 
        ArrayList<Integer> list = new ArrayList<Integer>();
        // Check for empty tree 
        if (node == null) 
            return list; 
        S.push(node); 
        TreeNode prev = null; 
        while (!S.isEmpty())  
        { 
        	TreeNode current = S.peek(); 
   
            /* go down the tree in search of a leaf an if so process it  
            and pop stack otherwise move down */
            if (prev == null || prev.left == current ||  
                                        prev.right == current)  
            { 
                if (current.left != null) 
                    S.push(current.left); 
                else if (current.right != null) 
                    S.push(current.right); 
                else
                { 
                    S.pop(); 
                    list.add(current.val); 
                } 
   
                /* go up the tree from left node, if the child is right  
                   push it onto stack otherwise process parent and pop  
                   stack */
            }  
            else if (current.left == prev)  
            { 
                if (current.right != null) 
                    S.push(current.right); 
                else 
                { 
                    S.pop(); 
                    list.add(current.val); 
                } 
                   
                /* go up the tree from right node and after coming back 
                 from right node process parent and pop stack */
            }  
            else if (current.right == prev)  
            { 
                S.pop(); 
                list.add(current.val); 
            } 
   
            prev = current; 
        } 
   
        return list; 
    } 
		
	public static void main(String args[]) {
		TreeNode root = new TreeNode(1);
	      
	       root.left= new TreeNode(2);
	       root.right= new TreeNode(3);
	       root.left.left= new TreeNode(4);
	       root.left.right= new TreeNode(5);
	       root.right.left= new TreeNode(6);
	       root.right.right= new TreeNode(7);
	      ArrayList<Integer>  response = postOrderIterative(root);
	       postOrderTraversalRecursive(root);
	       
	}
}
