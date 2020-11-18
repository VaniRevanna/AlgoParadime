package Trees;

import java.util.ArrayList;
import java.util.Stack;

import Trees.PostOrderTraversal.TreeNode;

public class InorderTraversal {

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int val) {
			this.val = val;
		}
	}
	
	// recursive traversal
	public static void inorderRecursive(TreeNode root) {
		
		if(root!=null) {
			
			inorderRecursive(root.left);
			System.out.println(root.val);
			inorderRecursive(root.right);
			
		}
	}
	
	// Iterative solution
	public static  void inOrderIter(TreeNode root) {
 
		if(root == null)
			return;
 
		Stack<TreeNode> s = new Stack<TreeNode>();
		TreeNode currentNode=root;
 
		while(!s.empty() || currentNode!=null){
 
			if(currentNode!=null)
			{
				s.push(currentNode);
				currentNode=currentNode.left;
			}
			else
			{
				TreeNode n=s.pop();
				System.out.printf("%d ",n.val);
				currentNode=n.right;
			}
		}
	}
	
	
	public static void main(String args[]) {
		TreeNode root = new TreeNode(1);
	      
	       root.left= new TreeNode(2);
	       root.right= new TreeNode(3);
	       root.left.left= new TreeNode(4);
	       root.left.right= new TreeNode(5);
	       root.right.left= new TreeNode(6);
	       root.right.right= new TreeNode(7);
	     inOrderIter(root);
	      inorderRecursive(root);
	       
	}
		
}
