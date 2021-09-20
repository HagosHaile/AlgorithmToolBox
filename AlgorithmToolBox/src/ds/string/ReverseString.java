package ds.string;

public class ReverseString {

	public static void main(String[] args) {
		
		String value = "123";
		if(value == null || value.length()<=1)
			System.out.println(value);
		else
			System.out.print(reversedValue(value));

	}

	private static String reversedValue(String value) {
		
		char[] reversed = new char[value.length()];
		for(int i=0; i<= value.length()/2; i++) {
			if(value.length()%2==0) {
				reversed[i] = value.charAt(value.length()-1-i);
				reversed[value.length()-i-1] = value.charAt(i);
			}
			else {
				reversed[i] = value.charAt(value.length()-1-i);
				reversed[value.length()-i-1] = value.charAt(i);
				if(value.length()/2==i)
					reversed[i] =value.charAt(i);
			}
		}
		String stringValue = new String(reversed);
		return stringValue;
		
	}

}
