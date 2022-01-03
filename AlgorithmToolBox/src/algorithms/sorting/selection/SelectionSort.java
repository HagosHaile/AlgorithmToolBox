package algorithms.sorting.selection;

public class SelectionSort {

	public static void main(String[] args) {
		//int[] arr = {5,4,7,7,2,8};
		int[] arr = new int[] { 20, 35, -15, 7, 55, 1, -22 };
		int[] arr2 = sorted(arr);
		
		for(int j =0; j<arr2.length; j++) {
			System.out.print(arr2[j]+", ");
		}

	}
	private static int[] sorted(int[] arr) {
		int min;
		for(int i=0; i<arr.length-1; i++) {
			min = arr[i];
			int j=i+1;
			int minIndex =i;
			for(; j<arr.length; j++) {
				if(min>arr[j]) {
					min = arr[j];
					minIndex=j;
				}
			}
			arr[minIndex]= arr[i];
			arr[i]=min;
		}
		
		return arr;
	}

}
