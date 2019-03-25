package com.praveen.learn.permmissingelem;

import java.util.HashSet;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1};
		System.out.println(solution(input));

	}

	public static int solution(int[] A) {
        // write your code in Java SE 8
		if(A.length == 0)
			return 1;

		
		Set <Integer> fullList = new HashSet<Integer>();
		Set <Integer> availableSet = new HashSet<Integer>();
		for(int item : A)
		{
			availableSet.add(item);
		}
		
		for(int i=1;i<=A.length+1;i++)
		{
			fullList.add(i);
		}
		
		fullList.removeAll(availableSet);		
		return fullList.iterator().next(); 
    }
	
}
