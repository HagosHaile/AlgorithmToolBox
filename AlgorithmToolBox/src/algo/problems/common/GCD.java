package algo.problems.common;

public class GCD {

	public static void main(String[] args) {
		int a=24, b=12;
		int result = a>=b? greatestCommonDivisor(a, b): greatestCommonDivisor(b, a);
		System.out.println(result);
	}
	
	public static int greatestCommonDivisor(int a, int b) {
		
		if(a%b==0)
			return b;
		return greatestCommonDivisor(b, a%b);
		
		
	}

}
