package com.assisted.project27;

public class CircularLinkedList {

	public class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	public Node head = null;
	public Node tail = null;

	public void insertNode(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
			newNode.next = head;
		} else {
			tail.next = newNode;
			tail = newNode;
			tail.next = head;
		}
	}

	public void displayNode() {
		Node current = head;
		if(head == null) {
			System.out.println("List is empty");
		} else {
			System.out.println("Nodes of circular Linked list are: ");
			do {
				System.out.print(" " + current.data);
				current = current.next;
			} while(current != head);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLinkedList cll = new CircularLinkedList();
		cll.insertNode(3);
		cll.insertNode(1);
		cll.insertNode(2);
		cll.insertNode(5);
		cll.displayNode();
	}

}
