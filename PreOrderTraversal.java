package Trees;

import java.util.Stack;

public class PreOrderTraversal {

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int val) {
			this.val = val;
		}
	}
	
	// recursive traversal
	public static void preOrderTraversalRecursive(TreeNode root) {
		
		if(root!=null) {
			System.out.println(root.val);
			preOrderTraversalRecursive(root.left);
			preOrderTraversalRecursive(root.right);
		}
	}
		
		//Iterative appproach
	public static void preOrderTraversal(TreeNode root) {
		if(root == null || root.val ==0 ) {
			System.out.println("Empty tree Node");
		}else {
			//LIFO
			Stack<TreeNode> stack = new Stack<PreOrderTraversal.TreeNode>();
			stack.push(root);
			
			while(!stack.isEmpty()) {
				TreeNode node = stack.pop();
				System.out.println(node.val);
				//inserting value right to left as stack is LIFO
				if(node.right!=null) {
					stack.add(node.right);
				}
			
				if(node.left!=null) {
					stack.add(node.left);
				}
				
				
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
	       preOrderTraversal(root);
	       preOrderTraversalRecursive(root);
	       
	}
	
}
