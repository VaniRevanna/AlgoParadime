package com.practice.algorithm.basic.queue;

/**
 * Please note that LinkedList implementation of Queue is dynamic in nature.
 * There are two most important operations of Queue: enqueue : It is operation
 * when we insert element into the queue. dequeue : It is operation when we
 * remove element from the queue.
 * 
 * @author i508938
 *
 */
public class QueueUsingLinkedList {
	private Node front, rear;
	private int currentSize;

	private class Node {
		int data;
		Node next;
	}

	public QueueUsingLinkedList() {
		front = null;
		rear = null;
		currentSize = 0;
	}

	public boolean isEmpty() {
		return (currentSize == 0);
	}

	public int dequeue() {
		int data = front.data;
		front = front.next;
		if (isEmpty()) {
			rear = null;
		}
		currentSize--;
		System.out.println(data + " removed from the queue");
		return data;
	}

	// Add data to the end of the list.
	public void enqueue(int data) {
		Node temp = rear;
		rear = new Node();
		rear.data = data;
		rear.next = null;
		if (isEmpty()) {
			front = rear;
		} else {
			temp.next = rear;
		}
		currentSize++;
		System.out.println(data + " added to the queue");
	}

	public static void main(String a[]) {

		QueueUsingLinkedList queue = new QueueUsingLinkedList();
		queue.enqueue(6);
		queue.dequeue();
		queue.enqueue(3);
		queue.enqueue(99);
		queue.enqueue(56);
		queue.dequeue();
		queue.enqueue(43);
		queue.dequeue();
		queue.enqueue(89);
		queue.enqueue(77);
		queue.dequeue();
		queue.enqueue(32);
		queue.enqueue(232);
	}
}
