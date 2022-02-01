package algo.problems.common;

public class SumRecursion {

	public static void main(String[] args) {
		
		System.out.println(sum(4));
		System.out.println(sumAccumulate(4,0));
	}
	
	
	public static int sum(int n) {
		if(n==1)
			return 1;
		return n + sum(n-1);
	}
	
	public static int sumAccumulate(int n, int sum) {
		if(n==1)
			return 1+sum;
		return sumAccumulate(n-1, sum+n);
	}

}
