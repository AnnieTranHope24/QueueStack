package hwk6;

import java.util.Arrays;

/**
 * The Stack class implemented by array.
 * 
 * @author PC
 *
 * @param <E>
 */
public class Stack<E> {
	private int top;
	private E[] elements;

	public Stack() {
		elements = (E[]) new Object[10];
		top = 0;
	}

	/**
	 * 
	 * @param capacity the capacity of the stack
	 */
	public Stack(int capacity) {
		elements = (E[]) new Object[capacity];
		top = 0;
	}

	/**
	 * Pop the last element
	 * 
	 * @return the element to be popped
	 */
	public E pop() {
		if (!empty()) {
			top--;
			return elements[top + 1];

		}
		return null;
	}

	/**
	 * Peek the last element
	 * 
	 * @return the last element
	 */
	public E peek() {
		if (!empty()) {
			return elements[top - 1];
		}
		return null;
	}

	/**
	 * Push new element to the stack
	 * 
	 * @param item the element to be pushed
	 */
	public void push(E item) {
		// if the array is full, double the size of the underlying array
		if (!isFull()) {
			elements[top] = item;
			top++;
		} else {
			elements = Arrays.copyOf(elements, elements.length * 2);
			elements[top] = item;
			top++;
		}
	}

	/**
	 * if the stack is empty
	 * 
	 * @return if the stack is empty
	 */
	public boolean empty() {
		return top == 0;
	}

	/**
	 * if the stack is full
	 * 
	 * @return if the stack is full
	 */
	public boolean isFull() {
		return top == elements.length;
	}

	/**
	 * Return the size of the stack
	 * 
	 * @return the size of the stack
	 */
	public int size() {
		return top;
	}
}
