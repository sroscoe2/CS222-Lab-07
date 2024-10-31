package main.queues;

import java.util.Objects;

import main.linkedLists.LL;

public class LLQueue<T> implements Queue<T> {

    LL<T> queue;

    public LLQueue(){
        queue = new LL<>();
    }



    @Override
    public void enqueue(T x) {
    	if (queue.size()==0) {
    		queue.insert(0, x);
    	}
    	else
    		queue.insert(queue.size()-1,x);
    }

    @Override
    public T dequeue() {
        if(queue.isEmpty())
            throw new IllegalArgumentException("queue is empty");
        T x = queue.get(0);
        queue.delete(0);
        return x;
    }

    @Override
    public T peekFront() {
        return queue.get(0);
    }

    @Override
    public T peekBack() {
        return queue.get(queue.size()-1);
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
		LLQueue other = (LLQueue) obj;
		return Objects.equals(queue, other.queue);
	}



	public static void main(String[] args) {
        LLQueue<Integer> q = new LLQueue<>();
        q.dequeue();
    }



	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return queue.isEmpty();
	}
    
}
