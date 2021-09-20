package algorithms.sorting.bubble;

public class Bubble {

	public static void main(String[] args) {
		int[] intA = new int[] { 20, 35, -15, 7, 55, 1, -22 };
		for(int unsortedIndex = intA.length-1; unsortedIndex > 0; unsortedIndex--) {
			for(int i = 0; i < unsortedIndex; i++) {
				if(intA[i] > intA[i+1]) {
					swap(intA, i, i+1);
				}
			}
		}
		for(int i=0;i<intA.length; i++) {
			System.out.println(intA[i]);
		}
		
		

	}
	
	public static void swap(int[] intA, int i, int j){
		
		if(i==j) return;
		int temp = intA[i];
		intA[i]= intA[j];
		intA[j] = temp;
		
	}

}
