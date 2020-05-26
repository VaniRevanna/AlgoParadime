package com.practice.algorithm.basic;


/**
 * Array lookup is always O(1). It does not depend on the size of the array. The basic idea about arrays is that it contains objects/references with fixed size so you can just do size * index to have the position of the object you are looking for.	
 * 
 * Stack Last in first out
 * Stack supports following basic operations.

*push: Push element to the top of the Stack.This operation will increase size of stack by 1.
*pop: Remove element from the top of the Stack and returns the deleleted Object.This operation will decrease size of stack by 1.
*isEmpty: Check if Stack is empty or not.
*isFull: Check if Stack is full or not.
*peek: Returns top element from the stack without removing it.
 * 
 * 
 * https://java2blog.com/data-structure-and-algorithm-interview-questions-in-java/ ---for more concrete implementation
 * @author i508938
 *
 */
public class StackUsingArray {
	
	/** size is declared has variable to reduce the calculation of size 
	 * during every insertion or deletion
	 */
	int size;
	int arr[];
	int top =-1;
 
	/**
	 * Array in java are created/initialized with defined size, 
	 * parameter constructor is must in this scenario
	 * @param size
	 */
	StackUsingArray(int size) {
		this.size = size;
		this.arr = new int[size];
	}
 
	public void push(int pushedElement) {
		if (!isFull()) {
			top++;
			arr[top] = pushedElement;
			System.out.println("Pushed element:" + pushedElement);
		} else {
			System.out.println("Stack is full !");
		}
	}
	
	public int pop() {
		if (!isEmpty()) {
			int returnedTop = top;
			top--;
			System.out.println("Popped element :" + arr[returnedTop]);
			return arr[returnedTop];
 
		} else {
			System.out.println("Stack is empty !");
			return -1;
		}
	}
 
	public int peek() {
		if(!this.isEmpty())
                        return arr[top];
                else
                {
                        System.out.println("Stack is Empty");
                        return -1;
                }
	}
 
	
	public boolean isEmpty() {
		return (top == -1);
	}
 
	public boolean isFull() {
		return (size - 1 == top);
	}
	
	public static void main(String[] args) {
		StackUsingArray StackCustom = new StackUsingArray(10);
		StackCustom.pop();
		System.out.println("=================");
		StackCustom.push(10);
		StackCustom.push(30);
		StackCustom.push(50);
		StackCustom.push(40);
		System.out.println("=================");
		StackCustom.pop();
		StackCustom.pop();
		StackCustom.pop();
		System.out.println("=================");
	}

}
