package com.infy.queue;

public class IntQueue {

	public static void main(String[] args) {
		Queue<Integer> numbersQueue = new QueueImpl<>(Integer.class);
		System.out.println("Size of the default queue: "+numbersQueue.getSize());
		System.out.println("Is Queue empty ? : "+numbersQueue.isEmpty());
		System.out.println("Is queue full ? : "+numbersQueue.isFull());
		numbersQueue.insert(10);
		numbersQueue.insert(20);
		numbersQueue.insert(30);
		numbersQueue.insert(40);
		System.out.println("Is Queue empty ? : "+numbersQueue.isEmpty());
		System.out.println("Is queue full ? : "+numbersQueue.isFull());
		System.out.println("Front of the queue: "+numbersQueue.front());
		System.out.println("Reare of the queue: "+numbersQueue.reare());
		System.out.print("Numbers in the queue is: ");
		numbersQueue.retrieve();
		System.out.println();
		System.out.println("Dequeing: "+numbersQueue.dequeue());
		System.out.print("Numbers after dequing one element: ");
		numbersQueue.retrieve();
	}

}