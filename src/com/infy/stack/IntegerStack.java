package com.infy.stack;

import java.util.Scanner;

public class IntegerStack implements Stack<Integer> {
	int[] intStack;
	int index = -1;
	@Override
	public void push(Integer t) {
		if(!isFull()) {
			intStack[++index] = t;
		}
		
	}
	
	@Override
	public Integer pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer top() {
		if(!isEmpty()) {
			return intStack[index];
		}
		return -1;
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
		System.out.println(iStack.isFull());
		System.out.println(iStack.isEmpty());
		iStack.push(10);
		System.out.println(iStack.isEmpty());
		System.out.println(iStack.top());
		
	}

}
