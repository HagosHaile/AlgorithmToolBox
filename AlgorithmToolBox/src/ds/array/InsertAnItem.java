package ds.array;

public class InsertAnItem {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int pos = 5;
		int value =90;
		
		for(int i=0; i<arr.length+1; i++)
			System.out.println(newArray(arr, pos, value)[i]);
		

	}
	
	private static int[] newArray(int[] arr, int pos, int value) {
		int len = arr.length;
		int arr1[] = new int[len+1];
		for(int i=0; i<len+1; i++) {
			if(i< pos-1)
				arr1[i]=arr[i];
			else if(i==pos-1)
				arr1[i] = value;
			else
				arr1[i] = arr[i-1];
				
		}
		
		
		return arr1;
		
	}

}
