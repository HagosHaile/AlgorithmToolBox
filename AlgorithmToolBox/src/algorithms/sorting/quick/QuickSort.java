package algorithms.sorting.quick;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = {8,5,3,13,6,7,2};
		System.out.print("array input: ");
		for(int h=0; h<arr.length;h++) {
			System.out.print(arr[h]+ " ");
		}
		quick(arr,0,arr.length-1);
		
		System.out.print("\nsorted:");
		for(int h=0; h<arr.length;h++) {
			System.out.print(arr[h]+ " ");
		}
		
		

	}
	
	private static void quick(int[] arr, int lowerIndex, int higherIndex) {
		
		if(lowerIndex >= higherIndex)
			return;
		int pivot = arr[higherIndex];
		int leftPointer = lowerIndex;
		int rightPointer = higherIndex;
		while(leftPointer<rightPointer) {
			while(arr[leftPointer]<=pivot && leftPointer<rightPointer) {
				leftPointer++;
			}
			while(arr[rightPointer]>=pivot && leftPointer<rightPointer) {
				rightPointer--;
			}
			
			swap(arr, leftPointer, rightPointer);
		}
		
		swap(arr, leftPointer, higherIndex);
		quick(arr, lowerIndex, leftPointer-1);
		quick(arr, leftPointer, higherIndex);
		
		
	}
	
	private static void swap(int[] arr, int leftPointer, int rightPointer) {
		int temp = arr[leftPointer];
		arr[leftPointer] = arr[rightPointer];
		arr[rightPointer] = temp;
	}

}
