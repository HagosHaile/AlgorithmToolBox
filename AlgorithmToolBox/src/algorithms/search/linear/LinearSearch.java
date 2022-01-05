package algorithms.search.linear;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = {};
		int[] arr1 = {4,5,2,9,8};
		String[] str = {"abc", "123", "def", "xyz", "\n"};
		
		System.out.println("=====int search=======");
		System.out.println(search(arr, 0));	//-1
		System.out.println(search(arr1, 9)); //3
		System.out.println(search(arr1, 6)); //-1
		System.out.println(search(arr1, 4)); //0
		System.out.println("=====String search=======");
		System.out.println(search(str, "\n"));
		System.out.println(search(str, ""));
		System.out.println(search(null, null));
		System.out.println(search(null, "abc"));

	}

	private static int search(int[] arr, int i) {
		for(int j=0; j<arr.length; j++) {
			if(arr[j]==i)
				return j;
		}
		
		return -1;
		
	}
	
	private static int search(String[] str, String i) {
		if(str==null)
			return -1;
		for(int j=0; j<str.length; j++) {
			if(str[j]==i)
				return j;
		}
		
		return -1;
		
	}
	
}
