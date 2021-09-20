package ds.array;

public class RemoveAnElement {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int pos = 5;
		
		for(int i=0; i<arr.length-1; i++)
			System.out.println(newArray(arr, pos)[i]);
		

	}
	
	private static int[] newArray(int[] arr, int pos) {
		int len = arr.length-1;
		int[] arr1 = new int[len];
		
		for(int i=0; i<len; i++ ) {
			if(i<pos-1)
				arr1[i]=arr[i];
			else
				arr1[i]=arr[i+1];
			}
		return arr1;
		}
}

