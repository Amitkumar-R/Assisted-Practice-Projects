package com.assisted.project28;

public class DoublyLinkedList {
	
	Node head;
	class Node {
		int data;
		Node prev;
		Node next;
		
		Node (int d) {
			data = d;
		}
	}
	
	public void addNode(int newData) {
		Node newNode = new Node(newData);
		newNode.next = head;
		newNode.prev = null;
		if(head != null)
			head.prev = newNode;
		head = newNode;
	}
	
	public void addAfter(Node prevNode, int newData) {
		if(prevNode == null) {
			System.out.println("The previous node can't be NULL");
			return;
		}
		Node newNode = new Node(newData);
		newNode.next = prevNode.next;
		prevNode.next = newNode;
		newNode.prev = prevNode;
		if(newNode.next != null)
			newNode.next.prev = newNode;
	}
	
	void appendNode(int newData) {
		Node newNode = new Node(newData);
		Node last = head;
		newNode.next = null;
		if(head == null) {
			newNode.prev = null;
			head = newNode;
			return;
		}
		while(last.next != null) 
			last = last.next;
		last.next = newNode;
		newNode.prev = last;
	}
	
	public void displayNodeList(Node node) {
		Node last = null;
		System.out.println("Forward traversal");
		while(node != null) {
			System.out.println(node.data + " ");
			last = node;
			node = node.next;
		}
		System.out.println();
		System.out.println("Reverse traversal");
		while(last != null) {
			System.out.print(last.data + " ");
			last = last.prev;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DoublyLinkedList dll = new DoublyLinkedList();
		dll.appendNode(6);
		dll.addNode(7);
		dll.addNode(4);
		dll.appendNode(5);
		dll.addAfter(dll.head.next, 8);
		System.out.println("Doubly Linked List is Created: ");
		dll.displayNodeList(dll.head);
		
	}

}
