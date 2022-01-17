package ds.hashtable;

import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

public class RecurringvalueInArray {

	public static void main(String[] args) {
		Integer[] arr = new Integer[] {2,5,5,2,6,7};
		Integer value = recurringvalue(arr);
		System.out.println(value);

	}

	private static int recurringvalue(Integer[] arr) {
		Map<Integer, Integer> map = new HashMap(); 
		for(int i=0; i<arr.length; i++) {
			if(map.containsKey(arr[i])) {
				return arr[i];
			}
			else
				map.put(arr[i],i);
		}
		return -1;
		
	}

}
