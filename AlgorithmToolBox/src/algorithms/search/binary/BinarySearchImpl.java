package algorithms.search.binary;

public class BinarySearchImpl {

	public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;
        int result = search(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "
                               + result);

	}
	//initialIndex=0; lastIndex=arr.length-1; noToSearch=10;
	// arr={ 2, 3, 4, 10, 40 };
	private static int search(int arr[], int initialIndex, int lastIndex, int noToSearch) {
		
		if (lastIndex >= initialIndex) {
            int mid = initialIndex + (lastIndex - initialIndex) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == noToSearch)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > noToSearch)
                return search(arr, initialIndex, mid - 1, noToSearch);

            // Else the element can only be present
            // in right subarray
            return search(arr, mid + 1, lastIndex, noToSearch);
		}
		return -1;
	}
	
}
