package com.leetcode;
import java.util.*;

public class StackUsingQueue_225 {
	private Queue<Integer> queue;
	
	public StackUsingQueue_225() {
		queue = new LinkedList<>();
	}
	
	public void push(int x) {
		queue.add(x);
		for(int i=1; i<queue.size(); i++)	queue.add(queue.remove());
	}
	
	public int pop() {
		return queue.remove();
	}
	
	public int top() {
		return queue.peek();
	}
	
	public boolean empty() {
		return queue.isEmpty();
	}
	
	public static void main(String[] args) {
		  StackUsingQueue_225 stack = new StackUsingQueue_225();

	        System.out.println("Pushing elements: 1, 2, 3");
	        stack.push(1);
	        stack.push(2);
	        stack.push(3);
	        System.out.println("Top element: " + stack.top());   
	        System.out.println("Pop element: " + stack.pop());  
	        System.out.println("Top element now: " + stack.top()); 
	        System.out.println("Is stack empty? " + stack.empty());
	        stack.pop();
	        stack.pop();
	        System.out.println("Is stack empty after popping all? " + stack.empty());
	    }
	}
