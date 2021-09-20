package ds.array;

public class MergeSortedArrays {

	public static void main(String[] args) {
		
		int[] arr = new int[] {1, 6, 8};
		int[] arr1 = new int[] {2, 7, 10,17};
		int len1 = arr.length;
		int len2 = arr1.length;
		int len3 = len1 + len2;
		for(int x=0; x<len3; x++) {
			System.out.println(mergeArrays(arr, arr1, len1, len2, len3)[x]);
		}

	}

	private static int[] mergeArrays(int[] arr, int[] arr1, int len1, int len2, int len3) {
		int[] mergedArr = new int[len1+len2];
		int i=0; int j=0; int k=0;
		while(i<len1 && j<len2) {
			if(arr[i]< arr1[j]) {
				mergedArr[k++] = arr[i++];
				
			}
			
			else
				mergedArr[k++] = arr1[j++];
		}
		
		while(i<len1)
			mergedArr[k++] = arr[i++];
		while(j<len2)
			mergedArr[k++] = arr1[j++];
		
		return mergedArr;
	}
	

}
