package com.threads;

public class ThreadBuRunnableInterface implements Runnable{

	public void run() {
		System.out.println("Running "+Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		
		Thread t = new Thread(new ThreadBuRunnableInterface());
		t.setName("My thread");
		t.setPriority(1);
		
		t.start();
		
		
		//using Runnable as ananymous class
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				System.out.println("Running "+Thread.currentThread().getName());
			}
		});
		t1.start();
		
		Thread t2 = new Thread(()-> {
			System.out.println("Running "+Thread.currentThread().getName());
		});
		
		t2.start();
	}


}
