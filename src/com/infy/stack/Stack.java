package com.infy.stack;

public interface Stack<T> {
	public void push(T t);
	public T pop();
	public T top();
	public boolean isEmpty();
	public boolean isFull();
	public int size();
}
