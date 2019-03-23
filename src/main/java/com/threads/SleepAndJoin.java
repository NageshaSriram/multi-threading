package com.threads;

public class SleepAndJoin implements Runnable{

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(new SleepAndJoin(),"T1");
		Thread t2 = new Thread(new SleepAndJoin(),"T2");
		Thread t3 = new Thread(new SleepAndJoin(),"T3");

		t1.start();
		t1.join();
		
		t2.start();
		t2.join();
		
		t3.start();
		t3.join();
		
		System.out.println("All threads executed...!");
	
		
	}

	@Override
	public void run() {
		try {
			System.out.println("Executing thread "+Thread.currentThread().getName());
			Thread.sleep(4000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
