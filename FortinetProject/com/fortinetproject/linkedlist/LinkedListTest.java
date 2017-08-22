/* 
 * To Perform JUnit testing
 */
package com.fortinetproject.linkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void testEmptyList() {
	
		 LinkedList l1 = new LinkedList();
   	     Node head = l1.reverseList(l1.head);	  
	     assertEquals(null,head);		  		  
	}

	@Test
	public void testSingleNodeList() {
	
		 LinkedList l1 = new LinkedList();
    	 l1.add(10);
	     Node head = l1.reverseList(l1.head);
		  
	     assertEquals(head,l1.head);		  		  
	}
	
	@Test
	public void testMultiNodeList() {
	
		 LinkedList l1 = new LinkedList();
    	 l1.add(10);
    	 l1.add(20);
    	 l1.add(30);
    	 l1.add(40);
	     
    	 Node head = l1.reverseList(l1.head);
		 String str ="";
    	 while(head !=null){
    		 str += head.value;
    		 head = head.next;
    	 }
    	 
	     assertEquals("40302010",str);		  		  
	     
	}
}
