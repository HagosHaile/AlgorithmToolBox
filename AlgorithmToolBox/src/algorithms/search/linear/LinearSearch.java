package algorithms.search.linear;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = {};
		int[] arr1 = {4,5,2,9,8};
		
		System.out.println(search(arr, 0));	//-1
		System.out.println(search(arr1, 9)); //3
		System.out.println(search(arr1, 6)); //-1
		System.out.println(search(arr1, 4)); //0

	}

	private static int search(int[] arr, int i) {
		for(int j=0; j<arr.length; j++) {
			if(arr[j]==i)
				return j;
		}
		
		return -1;
		
	}
	
}
