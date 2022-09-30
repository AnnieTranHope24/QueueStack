package hwk6;
/**
 * The Node class.
 * Each node has a value and a reference to the next node.
 * @author Ngoc Tran
 *
 * @param <E> the type of the node
 */
public class Node<E> {

	E val;
	Node<E> next;
	/**
	 * 
	 * @param newVal the value of the node
	 */
	public Node(E newVal) {
			val = newVal;
			next = null;
		}
	/**
	 * 
	 * @param newVal the value of the node
	 * @param next the next node
	 */
	public Node(E newVal, Node<E> next) {
			val = newVal;
			this.next = next;
		}
	/**
	 * Accessor of the value.
	 * @return val the value of the node
	 */
	public E getVal() {
		return val;
	}
	/**
	 * Mutator of the value.
	 * @param val the value
	 */
	public void setVal(E val) {
		this.val = val;
	}
	/**
	 * Accessor of the next node
	 * @return next the next node
	 */
	public Node<E> getNext() {
		return next;
	}
	/**
	 * Mutator of the next node
	 * @param next the next node
	 */
	public void setNext(Node<E> next) {
		this.next = next;
	}

}
