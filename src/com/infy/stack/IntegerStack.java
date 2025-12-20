package com.infy.stack;

import java.util.Arrays;
import java.util.Scanner;

public class IntegerStack implements Stack<Integer> {
	int[] intStack;
	int index = -1;
	@Override
	public String push(Integer t) {
		if(!isFull()) {
			intStack[++index] = t;
			return "Item inserted";
		}else {
			return "Item has not been inserted, stack is full";
		}
		
	}
	@Override
	public Integer pop() {
		int item = -1;
		if(!isEmpty()) {
			item = intStack[index];
			intStack[index--] = 0;
		}
		return item;
	}
	@Override
	public Integer top() {
		if(!isEmpty()) {
			return intStack[index];
		}
		return -1;
	}
	@Override
	public void retrieve() {
		if(!isEmpty()) {
			System.out.print("Stack elements are: ");
			Arrays.stream(intStack).forEach(num -> System.out.print(num+" "));
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
		return index < intStack.length-1 ? false : true;
	}
	@Override
	public int size() {
		return intStack.length;
	}
	
	public static void main(String[] args) {
		IntegerStack iStack = new IntegerStack();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter size of the stack: ");
		int size = scan.nextInt();
		iStack.intStack = new int[size];
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
					int element = scan.nextInt();
					System.out.println(iStack.push(element));
					break;
				case 2:
					if(!iStack.isFull()) {
						System.out.println("Stack if not full");
					}else {
						System.out.println("Yes! stack is full");
					}
					break;
				case 3:
					if(iStack.isEmpty()) {
						System.out.println("Stack is empty");
					}else {
						System.out.println("Stack is not an empty");
					}
					break;
				case 4:
					System.out.println("Size of the stack is: "+iStack.size());
					break;
				case 5:
					int item = iStack.pop();
					System.out.println("Poped the item form statck: "+item);
					break;
				case 6:
					iStack.retrieve();
					break;
				case 7:
					int value = iStack.top();
					if(value == -1) {
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
