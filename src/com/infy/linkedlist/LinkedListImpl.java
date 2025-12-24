package com.infy.linkedlist;

public class LinkedListImpl implements LinkedList {
	private Node headNode;
	private Node previousNode;
	private Node currentNode;
	private Node tailNode;
	
	@Override
	public void insertElement(Object data) {
		if(!isEmpty()) {
			currentNode = new Node(data);
			previousNode.setNext(currentNode);
			previousNode = currentNode;
			tailNode = currentNode;
			currentNode = previousNode;
		}else {
			headNode = new Node(data);
			previousNode = headNode;
			headNode = previousNode;
			System.out.println("Data has been inserted at head position");
		}
		
	}

	@Override
	public String searchElement(Object data) {
		Node current = headNode;
		int count = 0;
		while(current != null) {
			count +=1;
			if(current.getData() == data) {
				return "Element "+data+" found at "+count+" node";
			}
		}
		return "Element not found in this linked list";
	}

	@Override
	public void getList() {
		Node current = headNode;
		while(current != null) {
			System.out.print(current.getData()+"-->");
			current = current.getNext();
		}
		
	}

	@Override
	public Object headElement() {
		return headNode.getData();
	}

	@Override
	public Object tailElement() {
		return tailNode.getData();
	}

	@Override
	public int length() {
		int count = 0;
		Node current = headNode;
		while(current != null) {
			count++;
			current = current.getNext();
		}
		return count;
	}

	@Override
	public void deleteElement(Object data) {
		Node current = headNode;
		int count = 0;
		boolean flag = false;
		while(current != null) {
			count += 1;
			if(current.getData() == data && count ==1) {
				deleteHeadElement(data);
			}else if(current.getData() == data && current.getNext() == null) {
				deleteTailElement(data);
			}else if(current.getData() == data) {
				Node temp = current;
				currentNode = current.getNext();
				previousNode.setNext(currentNode);
				flag = true;
				System.out.println("The given element "+data+" has been deleted from the list");
				return;
			}
			previousNode = current;
			current = current.getNext();
		}
		if(!flag) {
			System.out.println("The given element "+data+" is not found in this list");
		}
		
	}
	
	@Override
	public void deleteHeadElement(Object data) {
		headNode = null;
		System.out.println("The given element "+data+" has been deleted successfully");		
	}

	@Override
	public void deleteTailElement(Object data) {
		tailNode = null;
		System.out.println("The given element "+data+" has been deleted successfully");
	}
	
	@Override
	public boolean isEmpty() {
		return headNode == null ? true : false;
	}

}
