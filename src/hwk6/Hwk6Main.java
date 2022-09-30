package hwk6;

/**
 * The main class to test the ParenthesesChecker, the DropOutStack, and the
 * ArrayQueue classes
 * 
 * @author Ngoc Tran
 *
 */
public class Hwk6Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// In the main method
		System.out.println("Test ParenthesesChecker");
		System.out.println("Case 1:");
		System.out.println("Expect: Missing a right parenthesis");
		String expression = "( ( ( 2 + 4 ) * 3";
		ParenthesesChecker checker = new ParenthesesChecker(expression);
		// Check the expression and print out an appropriate message depending on the results of the check.
		// If the parentheses don’t match, print out a message stating which is missing (left or right parenthesis).
		System.out.print("Result: ");
		checker.checkExpression();
		System.out.println();
		System.out.println("Case 2:");
		System.out.println("Expect: Missing a left parenthesis");
		checker.setExpression("( ( 2 + 4 ) ) ) * 3");
		System.out.print("Result: ");
		checker.checkExpression();
		System.out.println();
		System.out.println("Case 3:");
		System.out.println("Expect: Matching parentheses");
		checker.setExpression("( ( ( 2 + 4 ) ) ) * 3");
		System.out.print("Result: ");
		checker.checkExpression();
		System.out.println();

		// Drop-out Stack
		System.out.println("Test DropOutStack");
		DropOutStack<Integer> stack = new DropOutStack<>(3);
		stack.pop();
		stack.peek();
		stack.push(11);
		stack.push(2);
		System.out.println("Expect: 2 11 ");
		System.out.print("Current stack: ");
		System.out.println(stack.toString());
		stack.pop();
		System.out.println("Expect: 11 ");
		System.out.print("Current stack: ");
		System.out.println(stack.toString());
		stack.push(3);
		stack.push(21);	
		System.out.println("Expect: 21 3 11 ");
		System.out.print("Current stack: ");
		System.out.println(stack.toString());
		stack.push(15);	
		System.out.println("Expect: 15 21 3 ");
		System.out.print("Current stack: ");
		System.out.println(stack.toString());
		stack.push(6);
		System.out.println("Expect: 6 15 21 ");
		System.out.print("Current stack: ");
		System.out.println(stack.toString());
		System.out.println("Expect: 6");
		System.out.print("Returned by peek(): ");
		System.out.println(stack.peek());
		System.out.println();
		
		//ArrayQueue
		System.out.println("Test ArrayQueue");
		ArrayQueue<Integer> numbers = new ArrayQueue<>(4);
		numbers.dequeue();
		numbers.peek();
		numbers.enqueue(4);
		numbers.enqueue(7);
		numbers.enqueue(14);
		numbers.enqueue(15);
		numbers.enqueue(17);		
		
		System.out.println("Expect: 4");
		System.out.print("Returned by peek(): ");
		System.out.println(numbers.peek());
		System.out.println("Expect: 4");
		System.out.print("Returned by dequeue(): ");
		System.out.println(numbers.dequeue());
		System.out.println("Expected current size: 3");
		System.out.print("Current size: ");
		System.out.println(numbers.size());
		numbers.enqueue(17);
		System.out.println("Expected current size: 4");
		System.out.print("Current size: ");
		System.out.println(numbers.size());
		System.out.println("Expect: 7");
		System.out.print("Returned by dequeue(): ");
		System.out.println(numbers.dequeue());
		



	}

}
