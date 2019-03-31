package com.praveen.learn.passingcars;

public class Solution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {0,1,0,1,1};
		System.out.println(solution(input));

	}
	public static int solution(int[] A)
	{
		int pairCount = 0;
		for(int i=0; i<A.length; i++)
		{
			for (int j = i+1; j<A.length; j++)
			{
				if(A[i] != A[j] && A[j] ==1)
				{
					//System.out.println(i+":"+j);
					pairCount++;
				}
			}
		}
		return pairCount;
	}

}
