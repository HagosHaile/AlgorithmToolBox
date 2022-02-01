package algo.problems.common;

public class LengthOfLastWordTest {

	public static void main(String[] args) {
		
		System.out.println(lengthOfLastWord("Hello World"));

		/*
		 * "Hello World" 
		 * "   fly me   to   the moon  " 
		 * "luffy is still joyboy"
		 */
	}
	
	public static int lengthOfLastWord(String s) {
		int l = s.length();
		int count =0;
		int i =l-1;
		while(i>=0) {
			if(s.charAt(i) != ' ') {
				count++;
				i--;
			}
			else {
				
				while(s.charAt(i)==' ') {
					if(i==0 || count!= 0)
						return count;
					else {
						count=0;
						i--;
					}
						
				}
				
			}	
				
		}
		return count;	
	}

}
