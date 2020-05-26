package com.practice.algorithm.basic;

import java.util.LinkedList;
import java.util.Queue;


/**
 * Stack is abstract data type which demonstrates Last in first out (LIFO) behavior. We will implement same behavior using two queue.
There are two most important operations of Stack:
Lets say you have two queues : queue1 , queue2

Push : 
If queue1 is empty, add elements to queue1
If queue1 is not empty, add all elements of queue1 to queue2 , add current element to queue1 and copy all elements of queue2 to queue1.
Pop : Simply remove element from queue1.


Queue is an abstract type : which does First in First out
to implement stack using queue we take two q1 and q2,
if q1 is empty we directly add value to q1,
if q1 is not empty- > we copy value to q2(to retain the value in q2), q2 is temp value which is helping us reverse the queue opertion.
delete all values from q1 and then add the new value.
 * @author i508938
 *
 */
public class StackusingTwoQueue {
	
	Queue<Integer> queue1;
	Queue<Integer> queue2;
	
	StackusingTwoQueue()
	{
		queue1=new LinkedList();
		queue2=new LinkedList();
	}
	
	/** insert to stack
	 * 
	 * @param i
	 */
		public void push(int i){
			if(queue1.size()==0)
				queue1.add(i);
			else{
				
				//copy all q1 value to q2 for back and then remove the values from q1
				queue2.addAll(queue1);
				//removes all value from linked list
				queue1.clear();
				
				//insert values back to q1
				queue1.add(i);
				queue1.addAll(queue2);
				queue2.clear();
			}
		}

		public int pop(){
			if(queue1.size()==0)
				throw new QueueEmptyException("Underflow Exception");
			return queue1.remove();
		}
		
		public static void main(String[] args) {
			StackusingTwoQueue stack = new StackusingTwoQueue();
			stack.push(20);
			stack.push(40);
			stack.push(70);
			stack.push(50);
			stack.push(90);
			stack.push(110);
			stack.push(30);
			System.out.println("Removed element : "+ stack.pop());
			stack.push(170);
			System.out.println("Removed element : "+ stack.pop());
		}
		
		
		/**
		 * Exception to indicate that Queue is empty.
		 */
		 
		class QueueEmptyException extends RuntimeException {
			private static final long serialVersionUID = 1L;
		 
			public QueueEmptyException() {
				super();
			}
		 
			public QueueEmptyException(String message) {
				super(message);
			}
		}
}
