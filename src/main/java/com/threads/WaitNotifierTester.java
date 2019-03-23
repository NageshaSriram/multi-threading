package com.threads;

public class WaitNotifierTester {

	public static void main(String[] args) {

		Message msg = new Message("Procces it");
		
		Waiter w1 = new Waiter(msg);
		Thread t1 = new Thread(w1,"w1");
		t1.start();

		Waiter w2 = new Waiter(msg);
		Thread t2 = new Thread(w2,"w2");
		t2.start();
		
		Notifier n1 = new Notifier(msg);
		Thread t3 = new Thread(n1,"n1");
		t3.start();
		
//		Notifier n2 = new Notifier(msg);
//		Thread t4 = new Thread(n2,"n2");
//		t4.start();
		
	}

}
