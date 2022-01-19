package ds.stack.arrayimpl;

public class StackImpl {
	/*
	 * time complexity of stack array implementation. 
	 * access O(n) 
	 * search O(n)
	 * insertion O(1) 
	 * deletion O(1)
	 * peek O(1)
	 * 
	 * Applications of Stack Data Structure
	 * Although stack is a simple data structure to implement, 
	 * it is very powerful. The most common uses of a stack are:
	 * 1. To reverse a word - Put all the letters in a stack and pop them out. 
	 * Because of the LIFO order of stack, you will get the letters in reverse order.In compilers - 
	 * 
	 * 2. Compilers use the stack to calculate the value of expressions like 2 + 4 / 5 * (7 - 9) by converting the expression to prefix or postfix form.
	 * 
	 * 3. In browsers - The back button in a browser saves all the URLs you have visited previously in a stack. Each time you visit a new page, it is added on top of the stack. When you press the back button, the current URL is removed from the stack, and the previous URL is accessed.
	 */
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
