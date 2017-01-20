package com.shantanu.stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

	Queue<Integer> q1 = new LinkedList<Integer>();
	Queue<Integer> q2 = new LinkedList<Integer>();

	public static void main(String[] args) {
		StackUsingQueue stack = new StackUsingQueue();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);

		System.out.println("\n\n remove item 1 : " + stack.pop());
		System.out.println("\n\n remove item 2 : " + stack.pop());
		System.out.println("\n\n remove item 3 : " + stack.pop());
		/*System.out.println("\n\n remove item 4 : " + stack.pop());
		System.out.println("\n\n remove item 5 : " + stack.pop());
		System.out.println("\n\n remove item 6 : " + stack.pop());*/

	}

	public int pop() {
		if (q1.peek() == null) {
			System.out.println("The Stack is Empty...");
			int i = 0;
			return i;
		} else {
			int pop = q1.remove();
			return pop;
		}
	}

	public void push(int data) {
		if (q1.peek() == null) {
			q1.add(data);
		} else {
			for (int i = q1.size(); i > 0; i--) {
				q2.add(q1.remove());
				
			}
			q1.add(data);
			for (int j = q2.size(); j > 0; j--) {
				q1.add(q2.remove());
			}
			
		}
	}

}
