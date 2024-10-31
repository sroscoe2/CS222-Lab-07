package main.queues;

public interface Queue<T> {
    public void enqueue(T x);
    public T dequeue();

    public T peekFront();
    public T peekBack();
	public boolean isEmpty();
	public boolean equals(Object q);

}
