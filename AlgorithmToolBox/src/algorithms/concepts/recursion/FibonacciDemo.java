package algorithms.concepts.recursion;

public class FibonacciDemo {

	public static void main(String[] args) {
		System.out.println(fibonacci(8));

	}
	
	private static int  fibonacci(int i) {
		// updated
		if(i<2)
			return i;
		return fibonacci(i-1) + fibonacci(i-2);
	}

}
