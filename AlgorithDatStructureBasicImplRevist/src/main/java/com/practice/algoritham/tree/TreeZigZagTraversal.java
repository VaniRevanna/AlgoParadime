package com.practice.algoritham.tree;

import java.util.List;
import java.util.Stack;

public class TreeZigZagTraversal {

	
	public static class TreeNode {
		    int val;
		     TreeNode left;
		     TreeNode right;
		     TreeNode() {}
		    TreeNode(int val) { this.val = val; }
		    TreeNode(int val, TreeNode left, TreeNode right) {
		       this.val = val;
		        this.left = left;
		        this.right = right;
		    }
		}

	    public void zigzagLevelOrder(TreeNode root) {
	    	// declare two stacks 
	        Stack<TreeNode> currentLevel = new Stack<>(); 
	        Stack<TreeNode> nextLevel = new Stack<>(); 
	        
	     // push the root 
	        currentLevel.push(root); 
	        boolean leftToRight = true; 
	      
	        // check if stack is empty 
	        while (!currentLevel.isEmpty()) { 
	      
	        // pop out of stack 
	        	TreeNode node = currentLevel.pop(); 
	          
	        // print the data in it 
	        System.out.print(node.val + " "); 
	      
	        // store data according to current 
	        // order. 
	        if (leftToRight) { 
	            if (node.left != null) { 
	            nextLevel.push(node.left); 
	            } 
	              
	            if (node.right != null) { 
	            nextLevel.push(node.right); 
	            } 
	        } 
	        else { 
	            if (node.right != null) { 
	            nextLevel.push(node.right); 
	            } 
	              
	            if (node.left != null) { 
	            nextLevel.push(node.left); 
	            } 
	        } 
	      
	        if (currentLevel.isEmpty()) { 
	            leftToRight = !leftToRight; 
	            Stack<TreeNode> temp = currentLevel; 
	            currentLevel = nextLevel; 
	            nextLevel = temp; 
	        } 
	        } 
	       
	    } 
	    
	 // driver program to test the above function 
	    public static void main(String[] args)  
	    { 
	        TreeNode tree = new TreeNode(1); 
	       
	        tree.left = new TreeNode(2); 
	        tree.right = new TreeNode(3); 
	        tree.left.left = new TreeNode(7); 
	        tree.left.right = new TreeNode(6); 
	        tree.right.left = new TreeNode(5); 
	        tree.right.right = new TreeNode(4); 
	      
	        System.out.println("ZigZag Order traversal of binary tree is"); 
	       new TreeZigZagTraversal().zigzagLevelOrder(tree); 
	    }
	    
	}

