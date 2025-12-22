package com.infy.queue;

import java.lang.reflect.Array;
import java.util.Arrays;

public class QueueImpl<T> implements Queue<T> {
	T[] queueDS;
	int index = -1;
	public QueueImpl(Class<T> clazz) {
		super();
		queueDS = (T[]) Array.newInstance(clazz, 10);
	}
	
	public QueueImpl(Class<T> clazz, int size) {
		super();
		queueDS = (T[]) Array.newInstance(clazz, size);
	}

	@Override
	public void insert(T element) {
		if(!isFull()) {
			queueDS[++index] = element;
			System.out.println(element+" enquied");
		}else {
			System.out.println("Can not insert ! Queue is out of memory, remove some elements then continue adding elements.");
		}
		
	}

	@Override
	public T front() {
		return queueDS[0];
	}

	@Override
	public T reare() {
		return queueDS[index];
	}
	
	@Override
	public T dequeue() {
		T element = null;
		if(!isEmpty()) {
			element = queueDS[0];
			updateQueue();
		}
		return element;
	}
	
	@Override
	public void retrieve() {
		if(!isEmpty()) {
			Arrays.stream(queueDS).forEach(element -> System.out.print(element+"  "));
		}
	}

	@Override
	public boolean isEmpty() {
		return index < 0 ? true : false;
	}
	
	@Override
	public boolean isFull() {
		return index < queueDS.length-1 ? false : true;
	}
	
	private void updateQueue(){
		for(int i=0; i<=index-1; i++) {
			queueDS[i] = queueDS[i+1];
		}
		queueDS[index--] = null;
	}

	@Override
	public int getSize() {
		return queueDS.length;
	}

}
