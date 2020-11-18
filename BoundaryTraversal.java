package Trees;

import java.util.ArrayList;

import Trees.LevelOrderTraversal.TreeNode;

//appriach
//left edge
//left leaf node
//right edges

public class BoundaryTraversal {

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int val) {
			this.val = val;
		}
	}
	private static void printLeftEdgeNodes(TreeNode root) {
		if(root==null)
			return;
 
		// if leaf node, ignore while printing edges
		if(root.left==null && root.right==null)
			return;
 
		System.out.print(root.val+" ");
 
		// If left is null, right will be the boundary edge.
		if(root.left==null)
		{
			printLeftEdgeNodes(root.right);
		}
		else
		{
			printLeftEdgeNodes(root.left);
		}
 
	}
	
	private static void printLeafNodes(TreeNode root) {
		if(root==null)
			return;
 
		if(root.left==null && root.right==null)
		{
			System.out.print(root.val+" ");
			return;
		}
		printLeafNodes(root.left);
		printLeafNodes(root.right);
	}
	
	private static void printRightBottomUp(TreeNode root)
	{
		if(root==null)
			return;
 
		// if leaf node, ignore while printing edges
		if(root.left==null && root.right==null)
		{
			return;
		}
 
		if(root.right!=null)
		{
			printRightBottomUp(root.right);
		}
		else if(root.left!=null)
		{
			printRightBottomUp(root.left);
		}
 
		System.out.print(root.val+" ");
	}
	
	static void boundaryTraversalOfTree(TreeNode root) {
		printLeftEdgeNodes(root);
		printLeafNodes(root);
		printRightBottomUp(root);
	}
	
	public static void main(String args[]) {
		TreeNode root = new TreeNode(1);
	      
	       root.left= new TreeNode(2);
	       root.right= new TreeNode(3);
	       root.left.left= new TreeNode(4);
	       root.left.right= new TreeNode(5);
	       root.right.left= new TreeNode(6);
	       root.right.right= new TreeNode(7);
	       root.left.left.left= new TreeNode(8);
	       root.right.left.left= new TreeNode(9);
	    boundaryTraversalOfTree(root);
	      
	       
	}
}
