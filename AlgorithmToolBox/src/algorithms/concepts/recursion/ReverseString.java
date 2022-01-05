package algorithms.concepts.recursion;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println(reverse(null)); //null
		System.out.println(reverse("")); //empty string
		System.out.println(reverse("a")); // a
		System.out.println(reverse("abc")); // cba

	}
	
	private static String reverse(String str) {
		if(str==null)
			return null;
		if(str.length()<2)
			return str;
		return str.charAt(str.length()-1) + reverse(str.substring(0,str.length()-1));
	}

}
