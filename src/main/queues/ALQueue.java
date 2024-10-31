package main.queues;

import java.util.ArrayList;
import java.util.Objects;

public class ALQueue<T> implements Queue<T>{
    ArrayList<T> queue;
    /*
     * front: beginning
     * back: end
     */

    public ALQueue(){
        queue = new ArrayList<>();
    }

    @Override
    public void enqueue(T x) {
        queue.addLast(x);
        // queue.add(x);
    }

    @Override
    public T dequeue() {
        if (queue.isEmpty())
            throw new IllegalStateException("Queue is empty");

        return queue.remove(0);
    }

    @Override
    public T peekFront() {
        if (queue.isEmpty())
            throw new IllegalStateException("Queue is empty");
        return queue.getFirst(); // .get(0)
    }

    @Override
    public T peekBack() {
        if (queue.isEmpty())
          throw new IllegalStateException("Queue is empty");

        return queue.getLast(); // .get(queue.size()-1)
    }

	@Override
	public int hashCode() {
		return Objects.hash(queue);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ALQueue other = (ALQueue) obj;
		return Objects.equals(queue, other.queue);
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return queue.isEmpty();
	}





}
