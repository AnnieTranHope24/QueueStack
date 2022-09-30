/**
 * 
 */
package hwk6;

import java.util.EmptyStackException;

/**
 * The DropOutStack behaves like the Stack but if the stack is full and another
 * element is pushed in the stack, the first element drops out of the stack.
 * 
 * @author Ngoc Tran
 *
 */

public class DropOutStack<E> {
	private int maxSize;
	private int size;
	private Node<E> front;

	/**
	 * 
	 * @param maxSize the size of the stack determined by the user
	 */
	public DropOutStack(int maxSize) {
		setMaxSize(maxSize);
		size = 0;
		front = null;

	}

	/**
	 * Return true if the stack is empty, false if it is not.
	 * 
	 * @return whether or not the size of the stack is 0
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * Return true if the stack is full, false if it is not.
	 * 
	 * @return whether or not the size of the stack equals to the max size of the
	 *         stack.
	 */
	public boolean isFull() {
		return size == maxSize;
	}

	/**
	 * Remove the last item added.
	 * 
	 * @return the value of the item popped
	 */
	public E pop() {
		try {
			if (!isEmpty()) {
				E toBeReturned = front.getVal();
				front = front.getNext();
				size--;
				return toBeReturned;
			} else {
				throw new EmptyStackException();
			}
		} catch (EmptyStackException e) {
			System.out.println("Stack is empty!");
		}
		return null;
	}

	/**
	 * Check the last item added.
	 * 
	 * @return the value of the last item added
	 */
	public E peek() {
		try {
			if (isEmpty()) {
				throw new EmptyStackException();
			} else {
				return front.getVal();
			}
		} catch (EmptyStackException e) {
			System.out.println("Stack is empty!");
		}
		return null;
	}

	/**
	 * Push an item to the stack.
	 * 
	 * @param val the value to be pushed in the stack
	 */
	public void push(E val) {
		Node<E> newNode = new Node<>(val);
		newNode.setNext(front);
		front = newNode;

		if (isFull()) {
			Node<E> copy = front;
			for (int i = 0; i < size - 1; i++) {
				copy = copy.getNext();
			}
			copy.setNext(null);

		} else {
			size++;
		}

	}

	/**
	 * Return a String contains elements of the stack.
	 * 
	 * @return a String contains elements of the stack.
	 */
	public String toString() {
		String stack = "";
		Node<E> copy = front;
		for (int i = 0; i < size; i++) {
			stack += copy.getVal() + " ";
			copy = copy.getNext();
		}
		return stack;
	}

	/**
	 * Accessor of the max size of the stack.
	 * 
	 * @return the maxSize
	 */
	public int getMaxSize() {
		return maxSize;
	}

	/**
	 * Mutator of the max size of the stack.
	 * 
	 * @param maxSize the maxSize to set
	 */
	public void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}

	/**
	 * Accessor of the current size of the stack.
	 * 
	 * @return the size
	 */
	public int getSize() {
		return size;
	}
}
