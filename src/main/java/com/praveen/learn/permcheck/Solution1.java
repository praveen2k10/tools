package com.praveen.learn.permcheck;

import java.util.HashSet;
import java.util.Set;

public class Solution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {4,1,3,2};
		System.out.println(solution(input));
		
		int[] input2 = {4,1,3};
		System.out.println(solution(input2));

	}

	public static int solution(int[] A)
	{
		Set<Integer> givenElements = new HashSet<Integer>();
		for(int item: A)
		{
			if(givenElements.contains(item))
			{
				return 0;
			}else
			{
				givenElements.add(item);
			}
		}
		
		Set<Integer> possibleElements = new HashSet<Integer>();
		
		for(int i=1;i<=A.length;i++)
		{
			possibleElements.add(i);
		}
		
		possibleElements.removeAll(givenElements);
		
		return possibleElements.size()==0?1:0;
	}
}
