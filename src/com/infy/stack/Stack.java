package com.infy.stack;

public interface Stack<T> {
	public String push(T t);
	public T pop();
	public T top();
	public void retrieve();
	public boolean isEmpty();
	public boolean isFull();
	public int size();
}
