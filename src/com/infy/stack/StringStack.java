package com.infy.stack;

import java.util.Arrays;
import java.util.Scanner;

public class StringStack implements Stack<String> {
	String[] strStack;
	int index = -1;
	
	@Override
	public String push(String t) {
		if(!isFull()) {
			strStack[++index] = t;
			return "Item inserted";
		}else {
			return "Item has not been inserted, stack is full";
		}
	}
	@Override
	public String pop() {
		String item = null;
		if(!isEmpty()) {
			item = strStack[index];
			strStack[index--] = null;
		}
		return item;
	}
	@Override
	public String top() {
		if(!isEmpty()) {
			return strStack[index];
		}
		return null;
	}
	@Override
	public void retrieve() {
		if(!isEmpty()) {
			System.out.print("Stack elements are: ");
			Arrays.stream(strStack).forEach(num -> System.out.print(num+" "));
			System.out.println();
		}else {
			System.out.println("Stack is not created");
		}
	}
	@Override
	public boolean isEmpty() {
		return index < 0 ? true : false;
	}
	@Override
	public boolean isFull() {
		return index < strStack.length-1 ? false : true;
	}
	@Override
	public int size() {
		return strStack.length;
	}
	
	public static void main(String[] args) {
		StringStack sStack = new StringStack();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter size of the stack: ");
		int size = scan.nextInt();
		sStack.strStack = new String[size];
		while(true) {
			System.out.println("Select the operation :::");
			System.out.println("1. Insert an element");
			System.out.println("2. Know the stack is full or not");
			System.out.println("3. Know the stack is empty or not");
			System.out.println("4. Know the stack size");
			System.out.println("5. Remove an element from the stack");
			System.out.println("6. Retrieve the stack");
			System.out.println("7. See the top element");
			System.out.print("Enter your option: ");
			int opt = scan.nextInt();
			switch(opt) {
				case 1:
					System.out.print("Enter an element: ");
					String element = scan.nextLine();
					System.out.println(sStack.push(element));
					break;
				case 2:
					if(!sStack.isFull()) {
						System.out.println("Stack if not full");
					}else {
						System.out.println("Yes! stack is full");
					}
					break;
				case 3:
					if(sStack.isEmpty()) {
						System.out.println("Stack is empty");
					}else {
						System.out.println("Stack is not an empty");
					}
					break;
				case 4:
					System.out.println("Size of the stack is: "+sStack.size());
					break;
				case 5:
					String item = sStack.pop();
					System.out.println("Poped the item form statck: "+item);
					break;
				case 6:
					sStack.retrieve();
					break;
				case 7:
					String value = sStack.top();
					if(value == null) {
						System.out.println("Stack is empty");
					}else {
						System.out.println("Top value of the stack is: "+value);
					}
					break;
				default:
					System.out.println("Please enter the correct option");
			}
			System.out.println("Do you want to contineu this service ? please select one option");
			System.out.println("1. Yea");
			System.out.println("2. No");
			System.out.print("Enter your option: ");
			int selection = scan.nextInt();
			if(selection ==2) {
				System.out.println("Thanks for utilizing the algorithm :)");
				break;
			}
			continue;
		}
		
	}
	
}
