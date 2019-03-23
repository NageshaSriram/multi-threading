package com.threads;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{

	private BlockingQueue<Message> queue;
	
	String msg;
	
	public Consumer(BlockingQueue<Message> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			while((msg =  queue.take().getName()) != "exit") {
				Thread.sleep(10);
				System.out.println("Consuming "+msg);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
