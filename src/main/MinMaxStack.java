package main;

import java.util.Random;

import main.stacks.ALStack;
import main.stacks.LLStack;
import main.stacks.Stack;

public class MinMaxStack {
	
	public static int minStack(Stack<Integer> s) {
		if (s.isEmpty())
			throw new IllegalArgumentException("can't find min of empty stack");
		Stack<Integer> spare = new ALStack<>();
		int min = s.peek();
		while (!s.isEmpty()) {
			int elt = s.pop();
			if (elt < min) {
				min = elt;
			}
			spare.push(elt);
		}
		// put back 
		while (!spare.isEmpty()) {
			s.push(spare.pop());
		}
		return min;
	}
	
	public static int maxStack(Stack<Integer> s) {
		if (s.isEmpty())
			throw new IllegalArgumentException("can't find max of empty stack");
		Stack<Integer> spare = new ALStack<>();
		int max = s.peek();
		while (!s.isEmpty()) {
			int elt = s.pop();
			if (elt > max) {
				max = elt;
			}
			spare.push(elt);
		}
		// put back 
		while (!spare.isEmpty()) {
			s.push(spare.pop());
		}
		return max;
	}


	public static void main(String[] args) {
		Stack<Integer> s1 = new ALStack<>();
		Stack<Integer> s2 = new LLStack<>();
		
		Random r = new Random();
		for (int i=0; i<10; i++) {
			s1.push(r.nextInt());
			s2.push(r.nextInt());
		}
		
		minStack(s1);
		maxStack(s2);

	}


}
