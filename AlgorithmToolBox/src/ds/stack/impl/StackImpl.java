package ds.stack.impl;

public class StackImpl {

	public static void main(String[] args) {
		Stack stack = new Stack(5);

	    stack.push(1);
	    stack.push(2);
	    stack.push(3);
	    stack.push(4);

	    stack.pop();
	    System.out.println("\nAfter popping out");

	    stack.printStack();

	}

}
