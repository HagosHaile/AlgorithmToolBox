package algo.problems.common;

//recursion is at least twice as slow as iteration.
public class FactorialTest {

	public static void main(String[] args) {
		
		System.out.println(factorial(4));
		System.out.println(factorialAccumulator(4,1));

	}
	
	public static int factorial(int n) {
		if(n==2)
			return 2;
		return n*factorial(n-1);
	}
	
	
	public static int factorialAccumulator(int n, int fact) {
		if(n==2)
			return fact*2;
		return factorialAccumulator(n-1, fact*n);
	}


}
