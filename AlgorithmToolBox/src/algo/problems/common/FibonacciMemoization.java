package algo.problems.common;

import java.util.HashMap;
import java.util.*;

public class FibonacciMemoization {

	private static Map<Integer, Integer> map = new HashMap<>();
	public static void main(String[] args) {
		
		System.out.println(fibo(10));

	}
	
	private static int fibo(int n) {
		
		if(n<=1) {
			return n;
		}
		if(map.containsKey(n))
        {
            return map.get(n);
        }
		int result = fibo(n-1)+ fibo(n-2);
		map.put(n, result);
		return result;
	}

}
