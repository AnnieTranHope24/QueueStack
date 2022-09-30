package hwk6;

/**
 * The ArrayQueue class
 * 
 * @author PC
 *
 * @param <E>
 */
public class ArrayQueue<E> {
	private E[] elements;
	private int front;
	private int rear;
	private int cap;
	private int size;

	public ArrayQueue() {
		elements = (E[]) new Object[4];
		front = 0;
		rear = 0;
		size = 0;
		cap = elements.length;

	}

	/**
	 * Create an array with the length is 1 more than the size of the queue that the
	 * user wants to create.
	 * 
	 * @param capacity the size of the queue determined by the user
	 */
	public ArrayQueue(int capacity) {
		elements = (E[]) new Object[capacity + 1];
		front = 0;
		rear = 0;
		size = 0;
		cap = elements.length;
	}

	/**
	 * Return the size of the queue
	 * 
	 * @return the size of the queue
	 */
	public int size() {
		return size;
	}

	/**
	 * Enqueue
	 * 
	 * @param item
	 */
	public void enqueue(E item) {
		try {
			if (!isFull()) {
				elements[rear] = item;
				rear = (rear + 1) % cap;
				size++;
			} else {
				throw new FullQueueException();
			}
		} catch (FullQueueException e) {
			System.out.println("Queue is full!");
		}

	}

	/**
	 * Dequeue
	 * 
	 * @return
	 */
	public E dequeue() {
		try {
			if (!isEmpty()) {
				E tobeReturned = elements[front];
				front = (front + 1) % cap;
				size--;
				return tobeReturned;
			} else {
				throw new EmptyQueueException();
			}
		} catch (EmptyQueueException e) {
			System.out.println("Queue is empty!");
		}
		return null;
	}

	/**
	 * Return first item
	 * 
	 * @return the first item
	 */
	public E peek() {
		try {
			if (!isEmpty()) {
				return elements[front];
			} else {
				throw new EmptyQueueException();
			}
		} catch (EmptyQueueException e) {
			System.out.println("Queue is empty!");
		}
		return null;
	}

	/**
	 * Return if the queue is empty
	 * 
	 * @return if the queue is empty
	 */
	public boolean isEmpty() {
		return front == rear;
	}

	/**
	 * Return if the queue is full
	 * 
	 * @return if the queue is full
	 */
	public boolean isFull() {
		return front == (rear + 1) % cap;
	}

}
