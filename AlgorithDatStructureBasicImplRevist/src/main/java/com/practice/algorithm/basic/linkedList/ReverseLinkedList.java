package com.practice.algorithm.basic.linkedList;


public class ReverseLinkedList {
	
	Node head;
	public static class Node {
		int value;
		Node next;
		public void displayNode () {
			System.out.println("Node value +   "+ value);
		}
		public Node(int value) {
			this.value = value;
 
		}
		public Node () {
			
		}
	}

	public static void reverseLinkedListInPairItr(Node head) {
		
		Node pointer = head;
		Node previous = null;
		Node  current = null;
		while (pointer != null) {
			current = pointer; 
			pointer = pointer.next; 
	        current.next = previous; 
	        previous = current; 
	        head = current;
	        }
		
}
	
	
	public static Node reverSeBetweenTheNodes(Node head, Node Last) {
		 
		Node current=head;
		Node temp=null;
		Node newHead =null;
		while (current != null && current.next != null && current.next!=Last.next) {
	 
			if (temp != null) {
				// This is important step
				temp.next.next = current.next;
			}
			temp=current.next; 
			current.next=temp.next;
			temp.next=current;
	 
			if (newHead == null)
				newHead = temp;
			current=current.next;
	 
		} 
		return newHead;
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
	
	
	public void printList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.format("%d ", temp.value);
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		ReverseLinkedList list = new ReverseLinkedList();
		// Creating a linked list
		Node head=new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);
		list.printList(head);
		list.reverseLinkedListInPairItr(head);
		list.printList(head);
		// Finding 3rd node from end
	//	Node nthNodeFromLast= list.nthFromLastNode(head,3);
		//System.out.println("3th node from end is : "+ nthNodeFromLast.value);
		list.reverSeBetweenTheNodes(head, new Node(3));
		list.printList(head);
		// Test if loop existed or not
				//System.out.println("Loop existed-->" + list.ifLoopExists());
				//System.out.println("Linked list palidrome: "+checkPalindrome(head));
	}
	
}
