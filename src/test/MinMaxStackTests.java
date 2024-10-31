package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import org.junit.jupiter.api.Test;

import main.MinMaxStack;
import main.stacks.ALStack;
import main.stacks.LLStack;
import main.stacks.Stack;

class MinMaxStackTests {
	
	@Test
	void minTest01() {
		Stack<Integer> s = new ALStack<>();
		Stack<Integer> scopy = new ALStack<>();
		ArrayList<Integer> arr = new ArrayList<>(); 
		Random r = new Random();
		for (int i=0; i<50; i++) {
			int x = r.nextInt();
			s.push(x);
			scopy.push(x);
			arr.add(x);
		}
		
		int expected = Collections.min(arr);
		int actual = MinMaxStack.minStack(s);
		assertEquals(expected,actual,"Min is incorrect");
		
		while (!s.isEmpty() && !scopy.isEmpty()) {
			assertEquals(s.pop(),scopy.pop(),"Stack order not preserved!");
		}
	}
	
	@Test
	void minTest02() {
		Stack<Integer> s = new LLStack<>();
		Stack<Integer> scopy = new LLStack<>();
		ArrayList<Integer> arr = new ArrayList<>(); 
		Random r = new Random();
		for (int i=0; i<50; i++) {
			int x = r.nextInt();
			s.push(x);
			arr.add(x);
		}
		
		int expected = Collections.min(arr);
		int actual = MinMaxStack.minStack(s);
		assertEquals(expected,actual,"Min is incorrect");
		
		while (!s.isEmpty() && !scopy.isEmpty()) {
			assertEquals(s.pop(),scopy.pop(),"Stack order not preserved!");
		}
	}
	
	@Test
	void maxTest01() {
		Stack<Integer> s = new ALStack<>();
		Stack<Integer> scopy = new ALStack<>();
		ArrayList<Integer> arr = new ArrayList<>(); 
		Random r = new Random();
		for (int i=0; i<50; i++) {
			int x = r.nextInt();
			s.push(x);
			arr.add(x);
		}
		
		int expected = Collections.max(arr);
		int actual = MinMaxStack.maxStack(s);
		assertEquals(expected,actual,"Max is incorrect");
		
		while (!s.isEmpty() && !scopy.isEmpty()) {
			assertEquals(s.pop(),scopy.pop(),"Stack order not preserved!");
		}
	}
	
	@Test
	void maxTest02() {
		Stack<Integer> s = new LLStack<>();
		Stack<Integer> scopy = new LLStack<>();
		ArrayList<Integer> arr = new ArrayList<>(); 
		Random r = new Random();
		for (int i=0; i<50; i++) {
			int x = r.nextInt();
			s.push(x);
			arr.add(x);
		}
		
		int expected = Collections.max(arr);
		int actual = MinMaxStack.maxStack(s);
		assertEquals(expected,actual,"Max is incorrect");
		
		while (!s.isEmpty() && !scopy.isEmpty()) {
			assertEquals(s.pop(),scopy.pop(),"Stack order not preserved!");
		}
	}

}
