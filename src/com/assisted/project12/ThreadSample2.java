package com.assisted.project12;

public class ThreadSample2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is Activated");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadSample2 ts2 = new ThreadSample2();
		Thread th1 = new Thread(ts2);
		th1.start();
	}
}
