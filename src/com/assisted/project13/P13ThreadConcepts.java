package com.assisted.project13;

public class P13ThreadConcepts {
	
	private static Object obj = new Object();

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("Thread is going to sleep...");
		Thread.sleep(2000);
		System.out.println("Thread will activated after 1 second...");
		
		synchronized(obj) {
			System.out.println("Thread will wait...");
			obj.wait(3000);
		}
		
		System.out.println("Thread will activateafter wait...");
		
	}

}
