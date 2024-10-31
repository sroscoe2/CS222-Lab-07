package main;

import java.util.Random;

import main.stacks.ALStack;
import main.stacks.LLStack;
import main.stacks.Stack;

public class MinMaxStack {
	
	public static int minStack(Stack<Integer> s) {
		return 0;
	}
	
	public static int maxStack(Stack<Integer> s) {
		return 0;
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
