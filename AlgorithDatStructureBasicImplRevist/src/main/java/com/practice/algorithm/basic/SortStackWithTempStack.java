package com.practice.algorithm.basic;

/**
 * Let’s say,  you have two stacks, stack and tempStack.
Pop an element currentData from stack and compare it with head of tempStack.
If currentData it greater, push it to tempStack.
If currentData is lesser than  head of tempStack, pop an element from tempStack and push it to stack until you get the element which is greater than currentData
In the end, tempStack will be sorted stack.
 * @author i508938
 *
 */
public class SortStackWithTempStack {

	public static StackUsingArray sortStack(StackUsingArray stack)
	{
		StackUsingArray tempStack = new StackUsingArray(10);
		while(!stack.isEmpty())
		{
			int currentData=stack.pop();
			while(!tempStack.isEmpty() && tempStack.peek() > currentData) {
				stack.push(tempStack.pop());
			}
			tempStack.push(currentData);
		}
		return tempStack;
	} 
}
