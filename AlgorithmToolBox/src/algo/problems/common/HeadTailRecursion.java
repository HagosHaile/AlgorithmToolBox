package algo.problems.common;

//tail recursion removes backtracking

public class HeadTailRecursion {

	public static void main(String[] args) {
		System.out.println("Head recursion");
		head(5);
		System.out.println("\ndifference between Head and tail recursions\n");
		System.out.println("Tail recursion");
		tail(5);

	}

	private static void head(int n) {
		System.out.println("calling the function for "+ n);
		if(n==0)
			return;
		head(n-1);
		System.out.println("n = "+n);
		
	}

	private static void tail(int n) {
		System.out.println("calling the function for "+ n);
		if(n==0)
			return;
		System.out.println("n = "+n);
		tail(n-1);
		
		
	}

}
