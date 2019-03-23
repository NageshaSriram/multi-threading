package com.threads;

public class Waiter implements Runnable{

	Message msg;
	
	public Waiter(Message msg){
		this.msg = msg;
	}

	@Override
	public void run() {

		synchronized(msg) {
			System.out.println("Waitng for Msg Object");
			try {
				msg.wait();
				System.out.println("After waiting Msg is name is "+msg.getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
