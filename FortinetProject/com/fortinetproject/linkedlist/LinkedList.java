// Java program for reversing the linked list

package com.fortinetproject.linkedlist;

//Node class
class Node {

	int value;
	Node next;

	Node(int n) {

		value = n;
		next = null;
	}
}

// LinkedList class to create Singly linkedList
public class LinkedList {

	Node head = null;

	// to add new node to linkedList
	public void add(int n) {

		if (head == null) {
			head = new Node(n);
		} else {

			Node temp = head;

			while (temp.next != null) {
				temp = temp.next;
			}

			temp.next = new Node(n);
		}

	}

	// to reverse the linkedList
	public Node reverseList(Node head) {

		// check if list is empty
		if (head == null)
			return null;
		else
		// if list has only one element
		if (head.next == null) {
			return head;
		}

		Node prevNode = null;
		Node currentNode = head;
		Node nextNode = null;

		while (currentNode != null) {
			nextNode = currentNode.next;
			currentNode.next = prevNode;
			prevNode = currentNode;
			currentNode = nextNode;

		}

		head = prevNode;

		return head;
	}

	// To traverse the LinkedList
	public void traverseList(Node head) {

		if (head == null) {
			System.out.println("List is empty");
		} else {
			Node temp = head;
			while (temp != null) {

				System.out.print(temp.value + " ");
				temp = temp.next;
			}

		}
	}

	public static void main(String args[]) {

		LinkedList l1 = new LinkedList();

		// add elements to linked list
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);

		// print the original list
		System.out.println("Original LinkedList :");
		l1.traverseList(l1.head);

		Node head = l1.reverseList(l1.head);

		// print the reverse list
		System.out.println("\nReverse LinkedList :");
		l1.traverseList(head);

	}
}
