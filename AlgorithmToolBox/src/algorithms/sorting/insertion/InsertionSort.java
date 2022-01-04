package algorithms.sorting.insertion;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] arr = {5,9,4,7,2,8};
		int[] arr2 = sorted(arr);
		
		for(int j =0; j<arr2.length; j++) {
			System.out.print(arr2[j]+", ");
		}
		
	}
	
	public static int[] sorted(int[] arr) {
	
		for(int i=1; i<arr.length; i++) {
			int current = arr[i];
			int j=i-1;
			while(j>-1 && arr[j]>current) {
				arr[j+1] = arr[j];
				j=j-1;
				
			}
			if(j+1 != i)
			arr[j+1]= current;
					
		}
		return arr;
	}

}
