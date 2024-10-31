package main;

import java.util.Random;

import main.queues.LLQueue;
import main.queues.Queue;
import main.stacks.ALStack;
import main.stacks.LLStack;
import main.stacks.Stack;

public class ReverseQueue {
	
	public static Queue<Integer> reverse(Queue<Integer> q){
		
		Stack<Integer> s = new ALStack<>();
		while (!q.isEmpty()) {
			s.push(q.dequeue());
		}
		while(!s.isEmpty()) {
			q.enqueue(s.pop());
		}
		
		return q;
	}

	public static void main(String[] args) {
		Queue<Integer> q = new LLQueue<>();
		
		Random r = new Random();
		for (int i=0; i<10; i++) {
			q.enqueue(r.nextInt());
		}
		
		reverse(q);
		

	}

}
