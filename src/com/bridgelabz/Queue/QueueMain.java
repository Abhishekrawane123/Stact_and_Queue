package com.bridgelabz.Queue;

public class QueueMain {

	public static void main(String[] args) {
		Queue queue = new Queue(5);
		queue.enQueue(30);
		queue.enQueue(20);
		queue.deQueue();
		queue.deQueue();

	}
}