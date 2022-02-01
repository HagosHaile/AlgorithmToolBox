package algo.problems.common;

public class TowersOfHanoi {

	public static void main(String[] args) {
		solve(2,'A', 'B','C');

	}
	
	public static void solve(int disk, char source, char middle, char destination) {
		if(disk==0) {
			System.out.println("plate "+ disk +" move from "+ source + " to "+ destination);
			return;
		}
		
		solve(disk-1, source, destination, middle);
		System.out.println("plate "+ disk +" move from "+ source + " to "+ destination);
		solve(disk-1, middle, source, destination);
	}

}
