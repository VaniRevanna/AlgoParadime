package com.practice.algorithm.basic.linkedList;

public class ReverseLinkedList {
	
	Node head;
	public class Node {
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

	public static Node reverseLinkedListInPairItr(Node head) {
		 
		Node current=head;
		Node temp=null;
		Node newHead =null;
		while (current != null && current.next != null) {
	 
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
	

	
}
