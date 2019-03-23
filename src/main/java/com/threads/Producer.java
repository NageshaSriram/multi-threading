package com.threads;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{

	private BlockingQueue<Message> queue;
	
	public Producer(BlockingQueue<Message> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			try {
				Thread.sleep(i);
				System.out.println("Producing "+i);
				Message msg = new Message(" "+i);
				queue.put(msg);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	
		try {
			Message msg = new Message("exit");
			queue.put(msg);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}
