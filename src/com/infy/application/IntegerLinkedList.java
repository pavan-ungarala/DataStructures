package com.infy.application;

import java.util.Scanner;

import com.infy.linkedlist.LinkedList;
import com.infy.linkedlist.LinkedListImpl;
import com.infy.linkedlist.Node;

public class IntegerLinkedList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LinkedList<Integer> ll = new LinkedListImpl();
		while(true) {
			System.out.println("Select the operation :::");
			System.out.println("1. Insert an element");
			System.out.println("2. Know the Length of the linked list");
			System.out.println("3. Know the head node element");
			System.out.println("4. Know the tail node element");
			System.out.println("5. Remove an element from linked list");
			System.out.println("6. Retrieve the linked list");
			System.out.println("7. Know the selected element position");
			System.out.println("8. Delete entire list");
			System.out.println("9. Know the list empty or not");
			System.out.print("Enter your option: ");
			int option = scan.nextInt();
			switch(option) {
				case 1:
					System.out.print("Enter an element: ");
					int element = scan.nextInt();
					ll.insertElement(element);
					break;
				case 2:
					System.out.println("Length of the linked list: "+ll.length());
					break;
				case 3:
					System.out.println("Head node element is: "+ll.headElement());
					break;
				case 4:
					System.out.println("Tail node element is: "+ll.tailElement());
					break;
				case 5:
					System.out.print("Enter an element: ");
					element = scan.nextInt();
					ll.deleteElement(element);
					break;
				case 6:
					System.out.println("List of elements are:::");
					ll.getList();
					break;
				case 7:
					System.out.print("Enter the element: ");
					element = scan.nextInt();
					ll.searchElement(element);
					break;
				case 8:
					ll.deleteList();
					break;
				case 9:
					if(!ll.isEmpty()) {
						System.out.println("List is not an empty");
					}else {
						System.out.println("List is empty");
					}
					break;
				default:
					System.out.println("Please eneter the correct option");
					break;
			}
			System.out.println("Select your service option");
			System.out.println("1. Exit");
			System.out.println("2. continue");
			System.out.print("Enter your option: ");
			int choice = scan.nextInt();
			if(choice == 1) {
				break;
			}
		}
	}

}
