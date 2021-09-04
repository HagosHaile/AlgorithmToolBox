package algorithms.array;
//O(a*b) time complexity
////O(1) space complexity
public class CommonItems {

	public static void main(String[] args) {
		boolean haveCommonItem = containsCommonItem(new int[] {1,2,3,4},new int[] {9,5,6,7});
		System.out.println(haveCommonItem);

	}
	
	
	public static boolean containsCommonItem(int[] arr, int[] arr1) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr1.length; j++) {
				if(arr[i]==arr1[j])
					return true;
			}
		}
		
		return false;
		
	}

}
