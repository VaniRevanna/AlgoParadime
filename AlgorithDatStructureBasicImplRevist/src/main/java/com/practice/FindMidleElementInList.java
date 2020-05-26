package com.practice;

/**
 * Find middle element in single -pass
 * https://javarevisited.blogspot.com/2012/12/how-to-find-middle-element-of-linked-list-one-pass.html
 * @author i508938
 *
 */
public class FindMidleElementInList {
	public static void main(String args[]) {
        //creating LinkedList with 5 elements including head
      LinkedList linkedList = new LinkedList();
      LinkedList.Node head = linkedList.head();
      linkedList.add( new LinkedList.Node("1"));
      linkedList.add( new LinkedList.Node("2"));
      linkedList.add( new LinkedList.Node("3"));
      linkedList.add( new LinkedList.Node("4"));
   
      //finding middle element of LinkedList in single pass
      LinkedList.Node current = head;
      int length = 0;
      LinkedList.Node middle = head;
   
      while(current.next() != null){
          length++;
          if(length%2 ==0){
              middle = middle.next();
          }
          current = current.next();
      }
    
      if(length%2 == 1){
          middle = middle.next();
      }

      System.out.println("length of LinkedList: " + length);
      System.out.println("middle element of LinkedList : "  + middle);
      
      
      
    //creating LinkedList with 5 elements including head 
      LinkedList linkedList2 = new LinkedList(); linkedList2.appendIntoTail(new LinkedList.Node("101")); linkedList2.appendIntoTail(new LinkedList.Node("201")); linkedList2.appendIntoTail(new LinkedList.Node("301")); linkedList2.appendIntoTail(new LinkedList.Node("401")); System.out.println("Linked List : " + linkedList); 
      if(linkedList2.isCyclic()){ 
    	  System.out.println("Linked List is cyclic as it contains cycles or loop");
    	  }else{
    		  System.out.println("LinkedList is not cyclic, no loop or cycle found"); }

      
     
    }
 


}
