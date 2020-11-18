package com.practice.algorithm.basic.queue;

public class BlockingQueue {
	private Node front;
    private Node rear;
    private int length;

   public static class Node {
	   int value;
	   Node next;
	    public Node(int value) {
	    	this.value = value;
	    }
   }
    public BlockingQueue(){
    }

    public synchronized void put(int data) throws InterruptedException {
    	 System.out.println("put method called...");
         if(this.length > 9){
             System.out.println("Maximum capacity reached. Hence waiting for take() operation");
             wait();
         }
         Node node = new Node(data);
         if(isEmpty()){
             front = node;
         }else {
             rear.next =node;
         }
         rear = node;
         length++;
         System.out.println("Data added in the queue. Going to notify the observers.");
         notifyAll();
    }

    public synchronized int take() throws InterruptedException {
    	   System.out.println("take() method called");
           int data;
           if(isEmpty()){
               System.out.println("No data found in the queue. take()() method execution paused.");
               wait();
           }
           System.out.println("Data became available. take() method resumed.");
           data = front.value;
           front = front.next;
           length--;
           return data;
        
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue queue = new BlockingQueue();
        
    }
}
