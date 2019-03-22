package com.threads;

public class ThreadByThreadClass extends Thread{
	
	public void run() {
			System.out.println("Running "+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		ThreadByThreadClass t = new ThreadByThreadClass();
		t.start();
		
	}

}
