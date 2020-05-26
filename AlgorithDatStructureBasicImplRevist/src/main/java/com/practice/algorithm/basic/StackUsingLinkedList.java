package com.practice.algorithm.basic;

import com.practice.algorithm.basic.exception.LinkedListEmptyException;

/**
 * The Stack is an abstract data type that demonstrates Last in first out ( LIFO) behavior. We will implement the same behavior using Linked List.
 * 
 * @author i508938
 *
 */
public class StackUsingLinkedList {
	
	/**
	 * First node of linked list
	 */
	private Node head;
	/**
	 * Nested class to define a linked list
	 * @author i508938
	 *
	 */
		private class Node {
			int value;
			Node next;
			
			Node(final int  value, final Node pointer) {
				this.value = value;
				this.next = pointer;
			}
		
		}
		
		/**
		 * initializing linked list to null
		 */
		public StackUsingLinkedList() {
			head = null;
		}

		/**
		 * remove the node from beging(head) of the list
		 * @return removed element value
		 * @throws LinkedListEmptyException
		 */
		public int pop() throws LinkedListEmptyException {
			if (head == null) {
				throw new LinkedListEmptyException();
			}else {
			int value = head.value;
			//pop value from top of linked list,by replacing heads with next.
			head = head.next;
			return value;
			}
		}
		
		
			/**
			 * Push element to the stack
			 * @param value
			 */
		public void push(int value) {	
			Node Currenthead = head;
			head = new Node(value,Currenthead);
			
			
		}
	 
 
		public static void printList(Node head) {
			Node temp = head;
			while (temp != null) {
				System.out.format("%d ", temp.value);
				temp = temp.next;
			}
			System.out.println();
		}
		
		public static void main(String args[]) 
		{
			StackUsingLinkedList lls=new StackUsingLinkedList();
			lls.push(20);
			lls.push(50);
			lls.push(80);
			lls.push(40);
			lls.push(60);
			lls.push(75);
			System.out.println("Element removed from LinkedList: "+lls.pop());
			System.out.println("Element removed from LinkedList: "+lls.pop());
			lls.push(10);
			System.out.println("Element removed from LinkedList: "+lls.pop());
			printList(lls.head);
		}
		/**
		 * 
		 * Exception to indicate that LinkedList is empty.
		 */
		 
		class LinkedListEmptyException extends RuntimeException {
			private static final long serialVersionUID = 1L;
		 
			public LinkedListEmptyException() {
				super();
			}
		 
			public LinkedListEmptyException(String message) {
				super(message);
			}
		}
}
