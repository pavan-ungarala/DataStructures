package com.infy.stack;

public interface Stack<T> {
	public void push(T t);
	public <T>T pop();
	public <T>T top();
	public boolean isEmpty();
	public boolean isFull();
}
