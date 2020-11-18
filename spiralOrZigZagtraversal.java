package Trees;

import java.util.Stack;

import Trees.InorderTraversal.TreeNode;

public class spiralOrZigZagtraversal {

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int val) {
			this.val = val;
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
	       zigZagTraversal(root);
	      
	       
	}
	
	
	public  static void zigZagTraversal(TreeNode root) {
		if(root != null) {
		
			Stack<TreeNode> current = new Stack<TreeNode>();
			current.add(root);
			boolean isDirection = false;
			while(!current.isEmpty()) {
				
				Stack<TreeNode> tempStack = new Stack<TreeNode>();
				
				while(!current.isEmpty()) {
					
					TreeNode node = current.pop();
					System.out.println(node.val);
					
					if(!isDirection) {
						if(node.left!=null) {
							tempStack.push(node.left);
						}
						if(node.right!=null) {
							tempStack.push(node.right);
						}
					}else {
						if(node.right!=null) {
							tempStack.push(node.right);
						}
						if(node.left!=null) {
							tempStack.push(node.left);
						}
					}
				}
				isDirection = !isDirection;
				
				current = tempStack;
			}
		}
	}
}
