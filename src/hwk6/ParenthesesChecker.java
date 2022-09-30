package hwk6;

/**
 * This class checks expressions that include parentheses and determine if each
 * expression has a matching set of parentheses or not.
 * 
 * @author Ngoc Tran
 *
 */
public class ParenthesesChecker {
	private String expression;
	private Stack<String> stack;
	private boolean isMatching;

	/**
	 * 
	 * @param expression the expression that needs to be checked
	 */
	public ParenthesesChecker(String expression) {
		this.setExpression(expression);
	}

	/**
	 * The method that checks the if the expression has matching parentheses.
	 */
	public void checkExpression() {
		isMatching = true;
		stack = new Stack<>();
		String[] elements = expression.trim().split(" ");
		for (String element : elements) {
			if (element.equals("(")) {
				stack.push(element);
			} else if (element.equals(")")) {
				if (stack.empty()) {
					missingLeft();
					break;
				} else {
					stack.pop();
				}
			}
		}
		if (!stack.empty()) {
			missingRight();
		} else {
			if (isMatching) {
				System.out.println("Parentheses match.");
			}

		}

	}

	/**
	 * Accessor of the field expression
	 * 
	 * @return the expression
	 */
	public String getExpression() {
		return expression;
	}

	/**
	 * Mutator of the field expression
	 * 
	 * @param expression the expression to set
	 */
	public void setExpression(String expression) {
		this.expression = expression;
	}

	/**
	 * The method deals with the case the expression misses a left parenthesis.
	 */
	private void missingLeft() {
		isMatching = false;
		System.out.println("Missing a left parenthesis!");
	}

	/**
	 * The method deals with the case the expression misses a right parenthesis.
	 */
	private void missingRight() {
		isMatching = false;
		System.out.println("Missing a right parenthesis!");
	}
}
