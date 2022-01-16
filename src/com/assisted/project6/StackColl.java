package com.assisted.project6;

import java.util.Iterator;
import java.util.Stack;

public class StackColl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Stack collection");
		
		Stack<String> stack = new Stack<String>();  
		stack.push("Abhi");  
		stack.push("Parva");  
		stack.push("Punith");  
		stack.push("Shiva");  
		stack.push("Raghu");
		
		stack.pop();  
		Iterator<String> iterator = stack.iterator();  
		while(iterator.hasNext()){  
		System.out.println(iterator.next());  
		}  
	}

}
