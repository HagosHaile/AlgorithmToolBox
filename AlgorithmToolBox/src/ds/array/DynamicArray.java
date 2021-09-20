package ds.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicArray {

	public static void main(String[] args) {
		//int[] intArray = new int[10];
		Integer[] intArray = new Integer[]{ 1,2,3,4,5,6,7,8,9,10 };
		
		List<Integer> targetList = new ArrayList<Integer>(Arrays.asList(intArray));
		System.out.println(targetList);
		
		targetList.add(11); ////O(1)
		
		System.out.println(targetList);
		//targetList.remove(0);
		//insert an elment at index 5
		int pos = 5;
		targetList.add(4, 5); //O(n)
		System.out.println(targetList);
		
	}

}
