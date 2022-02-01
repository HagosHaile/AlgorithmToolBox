package algo.problems.common;

import java.util.Stack;

public class ReverseStringTest {

	public static void main(String[] args) {
		char[] s = {'H', 'e', 'l', 'l'};
		s = reverseString(s);
		
		for(int i=0; i<s.length; i++) {
			System.out.print(s[i]);
		}
		
		
	}
	
	public static char[] reverseString(char[] s) {
	int l = s.length/2;
		for(int i=0; i<l; i++) {
			char swap = s[i];
			s[i] = s[s.length-1-i];
			s[s.length-1-i] = swap;
		}
		
		return s;
	}

}
