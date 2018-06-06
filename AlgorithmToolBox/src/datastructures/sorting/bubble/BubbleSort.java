package datastructures.sorting.bubble;
//quadratic time complexity
public class BubbleSort {

	public static void main(String[] args) {
		int[] intA = new int[] { 20, 35, -15, 7, 55, 1, -22 };
		int temp = 0;
		int len = intA.length;
		for (int i = 0; i < len; ) {
			for (int j = 1; j < len; j++) {
				if (intA[j-1] > intA[j]) {
					temp = intA[j-1];
					intA[j-1] = intA[j];
					intA[j] = temp;
				}
			}
			len--;
		}
		for (int i = 0; i < intA.length; i++) {
			System.out.println(intA[i]);
		}

	}

}
