package algo.problems.common;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		int value = search(arr, 7, 0, arr.length-1);
		System.out.println(value);

	}
	
	private static int search(int[] arr, int target, int left, int right) {
		if(right<left)
			return -1;
		int middle = left + right;
		if(arr[middle] == target)
			return middle;
		if(arr[middle]>target)
			return search(arr, target,left, middle-1);
		else
			return search(arr, target, middle+1, right);	
		
	}

}
