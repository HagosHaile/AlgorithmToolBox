package algorithms.concepts.recursion;

public class StackOverFlow {
	//public static int counter =0;
	public static void main(String[] args) {
		System.out.println("Before Memory Overflow");
		overflow();
	}

	private static void overflow() {
		/*
		 * counter++; if(counter > 4) { System.out.println("End of overflow method");
		 * return; }
		 */
		System.out.println("Memory Overflow");
		overflow();
		
	}
}