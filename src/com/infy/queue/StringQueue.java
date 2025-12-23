package com.infy.queue;

public class StringQueue {

	public static void main(String[] args) {
		Queue<String> numbersQueue = new QueueImpl<>(String.class);
		System.out.println("Size of the default queue: "+numbersQueue.getSize());
		System.out.println("Is Queue empty ? : "+numbersQueue.isEmpty());
		System.out.println("Is queue full ? : "+numbersQueue.isFull());
		numbersQueue.insert("Pavan");
		numbersQueue.insert("Infosys");
		numbersQueue.insert("FS Unit");
		numbersQueue.insert("Power Programmer");
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
