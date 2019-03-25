package com.praveen.learn.oddoccurrencesinarray;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {9,3,9,3,9,7,9};
		System.out.println(solution(input));
	}
	
	public static int solution(int[] A)
	{
		// Integer,Occurance
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		for(int item : A)
		{
			if(m.get(item) == null)
			{
				m.put(item, 1);
			}else
			{
				m.remove(item);
			}
		}
	return m.keySet().iterator().next();	
	}

}
