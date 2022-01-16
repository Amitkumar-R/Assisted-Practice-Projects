package com.assisted.project26;

import java.util.LinkedList;

public class SinglyLinkedList {
	
	class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public Node head = null;
	public Node tail = null;
	
	public void insertNode(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	public void displayNode() {
		Node current = head;
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("Nodes of linked list: ");
		while(current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.insertNode(2);
		sll.insertNode(1);
		sll.insertNode(3);
		sll.insertNode(5);
		sll.displayNode();
	}

}
