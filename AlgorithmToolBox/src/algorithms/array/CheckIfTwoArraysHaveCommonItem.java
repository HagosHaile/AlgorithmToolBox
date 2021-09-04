package algorithms.array;

//O(a*b) time complexity
import java.util.Hashtable;

public class CheckIfTwoArraysHaveCommonItem {

	public static void main(String[] args) {
		boolean haveCommonItem = containsCommonItem(new int[] {1,2,3,4},new int[] {9,5,6,7});
		System.out.println(haveCommonItem);
	}

	private static boolean containsCommonItem(int[] arr, int[] arr2) {
		Hashtable<Integer, String> ht = new Hashtable<>();
		for(int i=0; i<arr.length; i++) {
			ht.put(arr[i], "true");
			
		}
		
		for(int j=0; j<arr2.length; j++) {
			if(ht.containsKey(arr2[j]))
				return true;
			
		}
		return false;
	}

}
