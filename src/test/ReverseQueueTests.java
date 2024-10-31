package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import org.junit.jupiter.api.Test;

import main.MinMaxStack;
import main.ReverseQueue;
import main.queues.ALQueue;
import main.queues.LLQueue;
import main.queues.Queue;
import main.stacks.ALStack;
import main.stacks.Stack;

class ReverseQueueTests {

	@Test
	void reverseTest01() {
		Queue<Integer> q = new LLQueue<>();
		ArrayList<Integer> arr = new ArrayList<>();
		
		Random r = new Random();
		for (int i=0; i<50; i++) {
			int x = r.nextInt();
			q.enqueue(x);
			arr.add(x);
		}
		
		Collections.reverse(arr);
		Queue<Integer> qr = ReverseQueue.reverse(q);
		while (!qr.isEmpty()) {
			assertEquals(arr.remove(0),qr.dequeue(),"elements don't match");
		}
	}
}
