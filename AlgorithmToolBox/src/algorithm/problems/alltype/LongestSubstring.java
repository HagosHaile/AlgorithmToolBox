package algorithm.problems.alltype;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("pwwkew"));
		//"abcabcbb" 3
		//"bbbbb"  1
		//"pwwkew" 3
		// dvdf    3
		//abba     2

	}

	private static int lengthOfLongestSubstring(String s) {
		Map<Character, Integer> map = new HashMap();
		String str = new String();
		int max=0;		
		int k = 0;
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				if(k>max)
					max=k;
				if(map.get(s.charAt(i))>k)
					k = i-map.get(s.charAt(i));
				map.remove(s.charAt(i));
				map.put(s.charAt(i), i);
			}

			else {
				map.put(s.charAt(i), i);
				k++;
			}

		}

		return max>=k ? max:k;
		//return k;

	}

}
