package ds.array.rotation;

public class Rotate {

	public static void main(String[] args) {
		int arr[] = new int[] {1, 2, 3, 4, 5, 6, 7};
		int temp[] = new int[] {1, 2};
		//int j = ;
		int k = arr.length;
		for(int i=0, j =0; i<k && j < temp.length; i++) {
			
			if(i < k-temp.length) {
				arr[i] = arr[i+2];
				System.out.println(arr[i]);
			}
			else {
				
				arr[i] = temp[j];
				++j;
				System.out.println(arr[i]);
			}
				
		}
		
		

	}

}
