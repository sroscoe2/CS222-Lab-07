package main.stacks;

import main.linkedLists.LL;

public class LLStack<T> implements Stack<T> {

	private LL<T> list;

	public LLStack() {
		list = new LL<>();
	}

	@Override
	public void push(T x) {
		list.insert(0, x);
	}

	@Override
	public T pop() {
		T x = list.get(0);
		list.delete(0);
		return x;
	}

	@Override
	public T peek() {
		return list.get(0);
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	public void makeEmpty() {
		list.makeEmpty();
	}

}
