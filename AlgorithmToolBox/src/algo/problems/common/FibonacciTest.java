package algo.problems.common;

public class FibonacciTest {

	public static void main(String[] args) {

		System.out.println(tailRecursion(8, 0, 1)); // 0 1 1 2 3 5 8 13 21 34 55 89
		System.out.println(fibonacciIteration(8));
		
	}

	private static int tailRecursion(int n, int a, int b) {

		if (n == 0)
			return a;
		if (n == 1)
			return b;

		return tailRecursion(n - 1, b, a + b);
	}

	private static int fibonacciIteration(int n) {
		if(n==0|| n==1)
			return n;
		
		int[] series = new int[n+1];
		series[0] =0;
		series[1] =1;
		for(int i=2; i<=n; i++) {
			series[i] = series[i-1] + series[i-2];
		}
		
		return series[n];
	    
	}

}
