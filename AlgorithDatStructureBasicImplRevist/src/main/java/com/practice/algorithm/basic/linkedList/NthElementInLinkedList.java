package com.practice.algorithm.basic.linkedList;

public class NthElementInLinkedList {

	private Node head;
	 
	private static class Node {
		private int value;
		private Node next;
 
		Node(int value) {
			this.value = value;
 
		}
	}
 
	public void addToTheLast(Node node) {
 
		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null)
				temp = temp.next;
 
			temp.next = node;
		}
	}
 
 
	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.format("%d ", temp.value);
			temp = temp.next;
		}
		System.out.println();
	}
 
 
	public Node nthFromLastNode(Node head,int n)
	{
		Node firstPtr=head;
		Node secondPtr=head;
 
		for (int i = 0; i < n; i++) {
			firstPtr=firstPtr.next;
 
		}
 
		while(firstPtr!=null)
		{
			firstPtr=firstPtr.next;
			secondPtr=secondPtr.next;
		}
 
		return secondPtr;
	}
 
	public static void main(String[] args) {
		NthElementInLinkedList list = new NthElementInLinkedList();
		// Creating a linked list
		Node head=new Node(5);
		list.addToTheLast(head);
		list.addToTheLast(new Node(6));
		list.addToTheLast(new Node(7));
		list.addToTheLast(new Node(1));
		list.addToTheLast(new Node(2));
 
		list.printList();
		// Finding 3rd node from end
		Node nthNodeFromLast= list.nthFromLastNode(head,3);
		System.out.println("3th node from end is : "+ nthNodeFromLast.value);
		
		// Test if loop existed or not
				System.out.println("Loop existed-->" + list.ifLoopExists());
				System.out.println("Linked list palidrome: "+checkPalindrome(head));
	}
	
	/**
	 * Efficient approach for this problem would be Floyd’s cycle detection algorithm,so steps for this algo would be:
Use two pointer fastPtr and slowPtr and initialize both to head of linkedlist
Move fastPtr by two nodes and slowPtr by one node in each iteration.
If fastPtr and slowPtr meet at some iteration , then there is a loop in linkedlist.
If fastPtr reaches to the end of linkedlist without meeting slow pointer then there is no loop in linkedlist (i.e fastPtr->next or fastPtr->next->next become null)

	 * @return
	 */
	public boolean ifLoopExists() {
		Node fastPtr = head;
		Node slowPtr = head;
		while (fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			if (slowPtr == fastPtr)
				return true;
 
		}
		return false;
	}
	
	/**
	 * Find meeting point of slowPointer and fastPointer.
set slowPointer to head node of linkedlist.
Move slowPointer and fastPointer both by one node.
The node at which slowPointer and fastPointer meets, will be starting node of loop.
	 * @return
	 */
	public Node findStartNodeOfTheLoop() {
		Node fastPtr = head;
		Node slowPtr = head;
		boolean loopExists=false;
		while (fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			if (slowPtr == fastPtr)
			{
				loopExists=true;
				break;
			}
	 
		}
		if(loopExists)
		{
			slowPtr=head;
	 
			while(slowPtr!=fastPtr)
			{
				slowPtr=slowPtr.next;
				fastPtr=fastPtr.next;
			}
	 
	 
		}
		else
		{
			System.out.println("Loop does not exists");
			slowPtr=null;
		}
		return slowPtr;
	}
	
	// This function will find middle element in linkedlist
		public static Node findMiddleNode(Node head)
		{
			// step 1
			Node slowPointer, fastPointer; 
			slowPointer = fastPointer = head; 
	 
			while(fastPointer !=null) { 
				fastPointer = fastPointer.next; 
				if(fastPointer != null && fastPointer.next != null) { 
					slowPointer = slowPointer.next; 
					fastPointer = fastPointer.next; 
				} 
			} 
	 
			return slowPointer; 
		}
	 
		// Function to check if linked list is palindrome or not
		public static boolean checkPalindrome (Node head)
		{
			// Find middle node using slow and fast pointer
			Node middleNode=findMiddleNode(head);
			// we got head of second part
			Node secondHead=middleNode.next;
			// It is end of first part of linked list
			middleNode.next=null;
			// get reversed linked list for second part
			Node reverseSecondHead=reverseLinkedList(secondHead);
	 
			while(head!=null && reverseSecondHead!=null)
			{
				if(head.value==reverseSecondHead.value)
				{
					head=head.next;
					reverseSecondHead=reverseSecondHead.next;
					continue;
				}
				else
				{
					return false;
				}
			}
	 
			return true;
	 
	 
		}
	 
		public static Node reverseLinkedList(Node currentNode) 
		{ 
			// For first node, previousNode will be null 
			Node previousNode=null; 
			Node nextNode; 
			while(currentNode!=null) 
			{ 
				nextNode=currentNode.next; 
				// reversing the link 
				currentNode.next=previousNode; 
				// moving currentNode and previousNode by 1 node 
				previousNode=currentNode; 
				currentNode=nextNode; 
			} 
			return previousNode; 
		} 
}
