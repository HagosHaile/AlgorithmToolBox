package algo.problems.common;

public class LinearSearchRecursion {

	public static void main(String[] args) {
		int[] arr = {8,2,7,9,10};
		System.out.println(search(arr, 10, 0));

	}
	
	public static int search(int[] arr, int item, int index) {
		if(index >= arr.length)
			return -1;
		if(arr[index]==item)
			return index;
		return search(arr, item, index+1);
	}

}
