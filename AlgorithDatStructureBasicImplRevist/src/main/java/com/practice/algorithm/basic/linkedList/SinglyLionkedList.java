package com.practice.algorithm.basic.linkedList;

/**
 * It is one of the most used data structure. In singly linked list, Node has
 * data and pointer to next node. It does not have pointer to the previous node.
 * Last node ‘s next points to null, so you can iterate over linked list by
 * using this condition.
 * 
 * @author i508938
 *
 */
public class SinglyLionkedList {

	/**Singly linked list node **/
	class Node {
		 public int data;
		 public Node next;
		 
		 public void displayNodeData() {
		  System.out.println("{ " + data + " } ");
		 }
		}
	
	private Node head;
	 
	public boolean isEmpty() {
		return (head == null);
	}
	
	// used to insert a node at the start of linked list
		public void insertFirst(int data) {
			Node newNode = new Node();
			newNode.data = data;
			newNode.next = head;
			head = newNode;
		}
		
		public Node deleteFirst() {
			Node temp = head;
			head = head.next;
			return temp;
		}
		
		// Use to delete node after particular node
		public void deleteAfter(Node after) {
			Node temp = head;
			while (temp.next != null && temp.data != after.data) {
				temp = temp.next;
			}
			if (temp.next != null)
				temp.next = temp.next.next;
		}
	 
		// used to insert a node at the start of linked list
		public void insertLast(int data) {
			Node current = head;
			while (current.next != null) {
				current = current.next; // we'll loop until current.next is null
			}
			Node newNode = new Node();
			newNode.data = data;
			current.next = newNode;
		}
		
		// For printing Linked List
		public void printLinkedList() {
			System.out.println("Printing LinkedList (head --> last) ");
			Node current = head;
			while (current != null) {
				current.displayNodeData();
				current = current.next;
			}
			System.out.println();
		}
}
