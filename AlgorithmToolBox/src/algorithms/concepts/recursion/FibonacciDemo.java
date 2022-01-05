package algorithms.concepts.recursion;

public class FibonacciDemo {

	public static void main(String[] args) {
		System.out.println(fibonacci(8));

	}
	
	private static int  fibonacci(int i) {
		
		if(i==0)
			return 0;
		if(i==1)
			return 1;
		i--;
		return fibonacci(i) + fibonacci(i-1);
	}

}
