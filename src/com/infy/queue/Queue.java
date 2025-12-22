package com.infy.queue;

public interface Queue<T> {
	public void insert(T element);
	public T front();
	public T reare();
	public T dequeue();
	public void retrieve();
	public boolean isEmpty();
	public boolean isFull();
	public int getSize();
}
