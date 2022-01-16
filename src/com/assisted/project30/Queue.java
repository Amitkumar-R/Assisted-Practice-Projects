package com.assisted.project30;

public class Queue {
	
	int size = 5;
	int items[] = new int[size];
	int rear, front;
	
	Queue() {
		front = rear = -1;
	}
	
	boolean isFull() {
		if(front == 0 && rear == size - 1) {
			return true;
		}
		return false;
	}
	
	boolean isEmpty() {
		if(front == -1)
			return true;
		else
			return false;
	}
	
	void addElements(int ele) {
		if(isFull()) {
			System.out.println("The Queue is Full");
		} else {
			if(front == - 1) {
				front = 0;
			}
			rear++;
			items[rear] = ele;
			System.out.println("Insert " + ele);
		}
	}
	
	int deleteElements() {
		int ele;
		
		if(isEmpty()) {
			System.out.println("The Queue is Empty");
			return(-1);
		} else {
			ele = items[front];
			if(front >= rear) {
				front = -1;
				rear = -1;
			} else {
				front++;
			}
			System.out.println(ele + " is deleted");
			return ele;
		}
	}
	
	void display() {
		int i;
		if(isEmpty()) {
			System.out.println("Queue is Empty");
		} else {
			System.out.println("\nFront element: " + front);
			System.out.println("Items: ");
			for(i = front; i <= rear; i++) 
				System.out.println(items[i] + " ");
			System.out.println("\nRear element: " + rear);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue = new Queue();
		queue.deleteElements();
		for(int i = 0; i < 6; i++) {
			queue.addElements(i);
		}
		queue.addElements(6);
		queue.display();
		queue.deleteElements();
		queue.display();
	}

}
