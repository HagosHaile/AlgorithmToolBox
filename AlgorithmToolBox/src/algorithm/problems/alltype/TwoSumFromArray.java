package algorithm.problems.alltype;

import java.util.HashMap;
import java.util.Map;

/*Given an array of integers nums and an integer target, 
return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly 
one solution, and you may not use the same element twice.

You can return the answer in any order.
*/
public class TwoSumFromArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[] values =sumOfTwo(arr, 8);
		for(int i=0; i<values.length; i++)
			System.out.print(values[i]+" ");

	}
	
	private static int[] sumOfTwo(int[] arr, int target) {
		Map<Integer, Integer> map = new HashMap();
		
		for(int i=0; i<arr.length; i++) {
			int current = arr[i];
			int value = target-current;
			if(map.containsKey(value))
				return new int[] {map.get(value), i};
			map.put(current, i);
		}
		
		return null;
		
	}

}
