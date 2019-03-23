package com.threads;

public class Notifier implements Runnable{

	private Message msg;
	
	public Notifier(Message msg) {
		this.msg = msg;
	}
	
	@Override
	public void run() {
		//working on something here
		try {
			Thread.sleep(4000);
			synchronized(msg) {
				msg.setName(Thread.currentThread().getName()+" work is done...!!!");
				msg.notifyAll();
				//msg.notify();
			}
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

}
