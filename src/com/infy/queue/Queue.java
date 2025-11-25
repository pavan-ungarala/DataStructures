package com.infy.queue;

public interface Queue<T> {
	public void insert(T element);
	public <T>T front();
	public <T>T reare();
	public boolean isEmpty();
	public boolean isFull();
}
