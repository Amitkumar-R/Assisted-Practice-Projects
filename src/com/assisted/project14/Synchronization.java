package com.assisted.project14;

class Sync implements Runnable {

	int a = 1;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		synchronized(this) {
			Thread thread = Thread.currentThread();
			String name = thread.getName();
			System.out.println(a + " alloted to " + name);
			a++;
		}
		
	}
	
}

public class Synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sync sync = new Sync();
		Thread thread1 = new Thread(sync);
		Thread thread2 = new Thread(sync);
		thread1.setName("Thread 1");
		thread2.setName("Thread 2");
		thread1.start();
		thread2.start();

	}

}
