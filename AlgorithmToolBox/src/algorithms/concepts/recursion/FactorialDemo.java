package algorithms.concepts.recursion;

public class FactorialDemo {

	public static void main(String[] args) {
		int value =factorial(5);
		System.out.println(value);
	}

	private static int factorial(int i) {
		
		if(i==2) {
			return i;
		}
		//i--;
		return i*factorial(i-1);
	}

}
