package com.praveen.learn.test;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int input = 919; //99872;
		System.out.println(solution(input));
		System.out.println(solution2(input));
		System.out.println(solution3(input));
		
		
		/*
		for(int i=0 ;i<200000 ; i++)
		{
			if(solution(i) != solution3(i))
			{
				System.out.println(i);
			}
		}
		*/
		

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
	
	public static int solution2(int N) {
		if(N<10) return 0;
		
		// Initilize with smallest single digit number 
		int smallestNumber = 1;
		double temp = N;
		while((int)temp>9)
		{
			//System.out.println(temp);
			temp = temp/10;
			
			smallestNumber = smallestNumber*10;
		}
		
		
		return smallestNumber;
	}
	
	public static int solution3(int N) {
		if(N<10) return 0;
		
		if(N > 9 && N <100) return 10;
		
		if (N>99) return 10*solution3(N/10);

		return 0;
	}
	
	
	
}
