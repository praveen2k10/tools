package com.praveen.learn.test;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 109;
		System.out.println(solution(input));

	}

	public static int solution(int N) {
		// Number of characters in the number
		int lengthOfNumber = Integer.toString(N).length();
		
		// case for single digit numbers
		if(lengthOfNumber==1)
		{
			return 0;
		}
		
		// Initilize with smallest single digit number 
		int smallestNumber = 1;
		
		// Loop for number of digits
		for (int i = 1; i < lengthOfNumber; i++) {
			// Compute smallest number for different lengths
			smallestNumber = smallestNumber * 10;
		}
		return smallestNumber;
	}
	
}
