package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import Trees.PostOrderTraversal.TreeNode;

public class LevelOrderTraversal {
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int val) {
			this.val = val;
		}
	}
	
	
		
	 // An iterative function to do postorder traversal  
    // of a given binary tree 
	static ArrayList<Integer> LevelOrderTraversal(TreeNode node)  
    { 
        Queue<TreeNode> S = new LinkedList();
        ArrayList<Integer> list = new ArrayList<Integer>();
        // Check for empty tree 
        if (node == null) 
            return list; 
        S.add(node); 
       
        while (!S.isEmpty())  
        { 
        	TreeNode tempNode=S.poll();
        	list.add(tempNode.val);
			System.out.printf("%d ",tempNode.val);
			if(tempNode.left!=null)
				S.add(tempNode.left);
			if(tempNode.right!=null)
				S.add(tempNode.right);
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
	       root.left.left.left= new TreeNode(8);
	       root.right.left.left= new TreeNode(9);
	      ArrayList<Integer>  response = LevelOrderTraversal(root);
	      
	       
	}
}
