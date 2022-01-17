package algorithm.problems.alltype;

/*Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.

For example, 121 is a palindrome while 123 is not.
*/


public class PalindromeValue {

	public static void main(String[] args) {
		//int num = 1212;
		System.out.println(palindrome(151)); //2121

	}
	
	private static boolean  palindrome(int x) {
		int size = 0;
		int temp = x;
		if(x < 0)
			return false;
		while(temp>=10) {
			temp = temp/10;
			size++;
		}
		size++;
		int[] arr = new int[size];
		for(int i=0; i<size-1; i++) {
			arr[i] = x%10;
			x = x/10;	
		}
		arr[size-1]=x;
		for(int i=0; i<=size/2; i++) {
			if(arr[i]!=arr[arr.length-1-i])
				return false;
		}
		
		return true;
	}

}
