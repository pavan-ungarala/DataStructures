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
			if(current.getData().equals(data)) {
				return "Element "+data+" found at "+count+" node and the node object address is: "+current.hashCode();
			}
		}
		return "Element not found in this linked list";
	}

	@Override
	public void getList() {
		if(isEmpty()) {
			System.out.println("List is empty");
			return;
		}
		Node current = headNode;
		while(current != null) {
			System.out.print(current.getData()+"-->");
			current = current.getNext();
		}
		
	}

	@Override
	public Object headElement() {
		if(!isEmpty()) {
			return headNode.getData();
		}
		return "List is empty";
	}

	@Override
	public Object tailElement() {
		if(tailNode != null) {
			return tailNode.getData();
		}
		return "List is empty";
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
			if(current.getData().equals(data) && count ==1) {
				deleteHeadElement(data);
			}else if(current.getData().equals(data) && current.getNext() == null) {
				deleteTailElement(data);
			}else if(current.getData().equals(data)) {
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
	public void deleteList() {
		if(isEmpty()) {
			System.out.println("List is empty");
			return;
		}
		Node current = headNode;
		while(current != null) {
			headNode = current.getNext();
			current.setNext(null);
			current = headNode;
		}
		if(isEmpty()) {
			System.out.println("Entire list has been deleted");
		}
	}
	
	@Override
	public boolean isEmpty() {
		return headNode == null ? true : false;
	}


}
