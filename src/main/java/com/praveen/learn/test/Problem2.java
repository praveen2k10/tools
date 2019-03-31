package com.praveen.learn.test;

import java.util.HashMap;
import java.util.Map;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution3(2, 1000000000));

	}

	public static int solution(int A, int B) {
		// write your code in Java SE 8
		// Maximum integral squares detected
		int maxOfconsequitiveIntegralSquareRootCount = 0;

		for (int i = A; i <= B; i++) {

			// Maximum integral squares detected for this iteration
			int consequitiveIntegralSquareRootCountDetected = 0;

			double sqrt = Math.sqrt(i);

			// Check for integer
			while (sqrt == (int) sqrt) {
				sqrt = Math.sqrt(sqrt);

				// increment detection count for current iteration
				consequitiveIntegralSquareRootCountDetected++;
			}
			
			// Retain maximum value detected
			if (consequitiveIntegralSquareRootCountDetected > maxOfconsequitiveIntegralSquareRootCount) {
				maxOfconsequitiveIntegralSquareRootCount = consequitiveIntegralSquareRootCountDetected;
			}

		}

		// Return maximum value
		return maxOfconsequitiveIntegralSquareRootCount;
	}
	
	public static int solution2(int A, int B) {
		// write your code in Java SE 8
		// Maximum integral squares detected
		int maxOfconsequitiveIntegralSquareRootCount = 0;

		for (int i = A; i <= B; i++) {

			// Maximum integral squares detected for this iteration
			int consequitiveIntegralSquareRootCountDetected = 0;

			double sqrt = Math.sqrt(i);

			// Check for integer
			while (sqrt == (int) sqrt) {
				sqrt = Math.sqrt(sqrt);

				// increment detection count for current iteration
				consequitiveIntegralSquareRootCountDetected++;
			}
			
			// Retain maximum value detected
			if (consequitiveIntegralSquareRootCountDetected > maxOfconsequitiveIntegralSquareRootCount) {
				maxOfconsequitiveIntegralSquareRootCount = consequitiveIntegralSquareRootCountDetected;
			}
			
			if(maxOfconsequitiveIntegralSquareRootCount == 4)
			{
				break;
			}	

		}

		// Return maximum value
		return maxOfconsequitiveIntegralSquareRootCount;
	}
	
	
	// Worst solution throws out of memory exception
	public static int solution3(int A, int B) {
		// write your code in Java SE 8
		// Maximum integral squares detected
		int maxOfconsequitiveIntegralSquareRootCount = 0;
		Map <Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = A; i <= B; i++) {

			// Maximum integral squares detected for this iteration
			int consequitiveIntegralSquareRootCountDetected = 0;

			if(!map.containsKey(i))
			{

				double sqrt = Math.sqrt(i);

				// Check for integer
				while (sqrt == (int) sqrt) {
					sqrt = Math.sqrt(sqrt);

					// increment detection count for current iteration
					consequitiveIntegralSquareRootCountDetected++;
				}
				map.put(i, consequitiveIntegralSquareRootCountDetected);
			}
			else
			{
				consequitiveIntegralSquareRootCountDetected = map.get(i);
			}
			
			
			// Retain maximum value detected
			if (consequitiveIntegralSquareRootCountDetected > maxOfconsequitiveIntegralSquareRootCount) {
				maxOfconsequitiveIntegralSquareRootCount = consequitiveIntegralSquareRootCountDetected;
			}	

		}

		// Return maximum value
		return maxOfconsequitiveIntegralSquareRootCount;
	}

}
