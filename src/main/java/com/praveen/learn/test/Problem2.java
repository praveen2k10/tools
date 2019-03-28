package com.praveen.learn.test;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(2, 1000000000));

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
			
			if(maxOfconsequitiveIntegralSquareRootCount == 4)
			{
				break;
			}	

		}

		// Return maximum value
		return maxOfconsequitiveIntegralSquareRootCount;
	}

}
