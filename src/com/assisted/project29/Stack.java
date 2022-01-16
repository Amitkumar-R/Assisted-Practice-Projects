package com.assisted.project29;

public class Stack {
	
	int maxSize;
	long[] stackArr;
	int top;
	
	public Stack(int s) {
		maxSize = s;
		stackArr = new long[maxSize];
		top = -1;
	}
	
	public void push(long j) {
		stackArr[++top] = j;
 	}
	
	public long pop() {
		return stackArr[top--];
	}
	
	public long topElement() {
		return stackArr[top];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == maxSize - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack stack = new Stack(10);
		stack.push(11);
		stack.push(21);
		stack.push(31);
		stack.push(41);
		stack.push(51);
		
		while(!stack.isEmpty()) {
			long value = stack.pop();
			System.out.println(value);
			System.out.print("");
		}
		System.out.println(" ");
	}

}
