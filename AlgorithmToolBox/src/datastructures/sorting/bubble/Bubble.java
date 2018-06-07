package datastructures.sorting.bubble;

public class Bubble {

	public static void main(String[] args) {
		int[] intA = new int[] { 20, 35, -15, 7, 55, 1, -22 };
		
		

	}
	
	public static void swap(int[] intA, int i, int j){
		
		if(i==j) return;
		int temp = intA[i];
		intA[i]= intA[j];
		intA[j] = temp;
		
	}

}
