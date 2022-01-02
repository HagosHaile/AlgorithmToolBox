package algorithms.sorting.merge;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = {8,5,3,13,6,7,2};
		System.out.print("array input: ");
		for(int h=0; h<arr.length;h++) {
			System.out.print(arr[h]+ " ");
		}
		mergeSort(arr);
		
		System.out.print("\nsorted:");
		for(int h=0; h<arr.length;h++) {
			System.out.print(arr[h]+ " ");
		}

	}
	
	private static void mergeSort(int[] arr) {
		int inputLength = arr.length;
		if(inputLength <2) {
			return;
		}
		
		int midIndex = inputLength/2;
		int[] leftHalf = new int[midIndex];
		int[] rightHalf = new int[inputLength-midIndex];
		for(int i=0; i<midIndex; i++) {
			leftHalf[i] = arr[i];
		}
		for(int j=midIndex;j<arr.length;j++) {
			rightHalf[j-midIndex] = arr[j];
		}
	
		mergeSort(leftHalf);
		mergeSort(rightHalf);
		merge(arr, leftHalf, rightHalf);
		
		}
	private static void merge(int[] arr, int[] leftHalf, int[] rightHalf) {
		int i=0, j=0, k=0;
		while(i<leftHalf.length && j<rightHalf.length) {
			if(leftHalf[i] <= rightHalf[j]) {
				arr[k]=leftHalf[i];
				i++;
				k++;
			}
			else {
				arr[k]= rightHalf[j];
				j++;
				k++;
			}	
		}
		while(i<leftHalf.length) {
			arr[k]=leftHalf[i];
			i++;
			k++;
		}
		while(j<rightHalf.length) {
			arr[k]=rightHalf[j];
			j++;
			k++;
		}
		
	}
	
}

