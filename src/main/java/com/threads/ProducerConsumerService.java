package com.threads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerService {

	public static void main(String[] args) {

		BlockingQueue<Message> queue = new ArrayBlockingQueue<>(10);
		
		Consumer c = new Consumer(queue);
		new Thread(c).start();
		
		Producer p = new Producer(queue);
		new Thread(p).start();
	}

}
