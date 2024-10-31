package main.stacks;

import java.util.ArrayList;

public class ALStack<T> implements Stack<T> {

	private ArrayList<T> arr;

	public ALStack() {
		arr = new ArrayList<>();
	}

	public ALStack(ArrayList<T> arr) {
		this.arr = arr;
	}

	@Override
	public void push(T x) {
		arr.add(x);
	}

	@Override
	public T pop() {
		return (T) arr.removeLast();
	}

	@Override
	public T peek() {
		return arr.getLast();
	}

	public boolean isEmpty() {
		return arr.isEmpty();
	}
	
	public void makeEmpty() {
		arr.clear();
	}

	public static void main(String[] args) {
		ALStack<Integer> thestack = new ALStack<>();
		// thestack.push("H");
		// thestack.push("E");
		// thestack.push("L");
		// thestack.push("L");
		// thestack.push("O");

		for (int i = 0; i < 10; i++) {
			thestack.push(i);
		}
		while (!thestack.isEmpty()) {
			System.out.println(thestack.pop());
		}
	}

}
