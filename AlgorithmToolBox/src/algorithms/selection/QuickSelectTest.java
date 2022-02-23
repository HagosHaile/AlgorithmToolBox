package algorithms.selection;

public class QuickSelectTest {

	public static void main(String[] args) {
		
		int[] nums = {4,6,12,7,13,2,5};
		QuickSelect quick = new QuickSelect(nums);
		int k = quick.select(7);
		
		System.out.println(k);

	}

}
