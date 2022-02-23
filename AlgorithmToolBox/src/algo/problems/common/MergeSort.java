package algo.problems.common;

//time complexity O(nlogn)
//space complexity O(n)  uses extra space.
public class MergeSort {
	
	public static void main(String args) {
		int[] arr = {2,7,6,3,9};
		mergeSort(arr, new int[arr.length], 0, arr.length-1);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	private static void mergeSort(int[] arr, int[] temp, int leftStart, int rightEnd) {
		
		if(leftStart >= rightEnd) {
			return;
		}
		
		int middle = (leftStart + rightEnd)/2;
		mergeSort(arr, temp, leftStart, middle);
		mergeSort(arr, temp,  middle+1, rightEnd);
		mergeHalves(arr, temp,  leftStart, rightEnd);
		
	}

	private static int[] mergeHalves(int[] arr, int[] temp,  int leftStart, int rightEnd) {
		int leftEnd = (rightEnd + leftStart)/2;
		int rightStart = leftEnd +1;
		int size = rightEnd - leftStart +1;
		
		int left = leftStart;
		int right = rightStart;
		int index = leftStart;
		
		while(leftStart <= leftEnd && rightStart <= rightEnd) {
			if(arr[left]<= arr[right]) {
				temp[index]=arr[left];
				left++;
			}
			else {
				temp[index]=arr[right];
				right++;
			}
			index++;
		}
		//public static void arraycopy(Object source_arr, int sourcePos,
        // Object dest_arr, int destPos, int len)
		System.arraycopy(arr, left, temp, index, leftEnd-left +1);
		System.arraycopy(arr, right, temp, index, rightEnd-right +1);
		System.arraycopy(temp, leftStart, arr, leftStart, size);
		
		return arr;
		
	}
	
	

}
