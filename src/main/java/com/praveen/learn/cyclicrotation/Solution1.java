package com.praveen.learn.cyclicrotation;

import java.util.Arrays;

public class Solution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {3, 8, 9, 7, 6};
		int rotateCont =3;
		System.out.println(Arrays.toString(solution(input, rotateCont)));

	}

	public static int[] solution(int[] A, int K)
	{
		if(A.length == 0)
		{
			return A;
		}
		for (int i=0; i<K ; i++)
		{
			A = rotateOne(A);
		}
		return A;
		
	}
	
	public static int[] rotateOne (int[] A)
	{
		int lastElement = A[A.length-1];
		for(int i=A.length-2 ;i>=0; i--)
		{
			A[i+1] = A[i];
		}
		A[0] = lastElement;
		return A;
	}
}
