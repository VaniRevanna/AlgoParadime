package com.practice;

public class LinkedList {
	private Node head;
    private Node tail;
 
    public LinkedList(){
        this.head = new Node("head");
        tail = head;
    }

    public Node head(){
        return head;
    }
 
    public void appendIntoTail(Node node) { Node current = head; 
    
    }
    
    public boolean isCyclic(){ 
    	Node fast = head; Node slow = head; 
    while(fast!= null && fast.next != null){ 
    	fast = fast.next.next; slow = slow.next; 
    	 slow = slow.next;
    	 if(fast == slow ){
             return true;
         }}
    return false;
    
    }
    //if fast and slow pointers are meeting then LinkedList is cyclic if(fast == slow ){ return true; } } return false; } 
    @Override 
    public String toString(){ 
    	StringBuilder sb = new StringBuilder(); 
    	Node current = head.next();
    	while(current != null){ 
    		sb.append(current).append("-->"); current = current.next(); 
    		} 
    	sb.delete(sb.length() - 3, sb.length());
    	return sb.toString();
    }
   
    
    

   
   
    public void add(Node node){
        tail.next = node;
        tail = node;
    }

    public static class Node{
        private Node next;
        private String data;

        public Node(String data){
            this.data = data;
        }
     
        public String data() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public Node next() {
            return next;
        }
        public void setNext(Node next) {
            this.next = next;
        }
     
        public String toString(){
            return this.data;
        }

    }
}
