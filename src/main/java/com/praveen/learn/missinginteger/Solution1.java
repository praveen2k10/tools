package com.praveen.learn.missinginteger;

import java.util.Arrays;

public class Solution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {-1, -3};
		System.out.println(solution(input));

	}
	
	public static int solution(int[] A)
	{
		Arrays.sort(A);
		int smallestMissingInteger=1;
		for(int item : A)
		{
			if(smallestMissingInteger == item)
			{
				smallestMissingInteger++;
			}
			else if(item>smallestMissingInteger)
			{
				break;
			}
		}
		return smallestMissingInteger;
	}

}
