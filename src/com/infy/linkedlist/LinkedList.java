package com.infy.linkedlist;

public interface LinkedList<T> {
	public void insertElement(T data);
	public String searchElement(T data);
	public void getList();
	public T headElement();
	public T tailElement();
	public int length();
	public void deleteElement(T data);
	public void deleteHeadElement(T data);
	public void deleteTailElement(T data);
	public boolean isEmpty();
}
