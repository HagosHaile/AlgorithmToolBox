package ds.array;

//time complexity  O(n)
//Big O exercise.
public class CarFuelRefill {

	public static void main(String[] args) {
		System.out.println(calculateNumOfRefills());
	}
	
	
	
	private static int calculateNumOfRefills() {
		int[] gasStation = {0, 1, 2, 4, 5, 6, 7, 8, 10, 11, 12};
		int l = 3;
		int numRefills = 0;
		int currentRefill =0;
		int len = gasStation.length-2;
		
		while(currentRefill <= len) {
			int lastRefill = currentRefill;
			
			while(currentRefill <= len && gasStation[currentRefill + 1]- gasStation[lastRefill] <= l) {
				currentRefill = currentRefill + 1;
			}
			
			if(currentRefill == lastRefill)
				return -1;
			else if(currentRefill <= len)
				numRefills = numRefills + 1;
		}
		return numRefills;
	}

}
