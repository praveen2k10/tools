package com.praveen.learn.frogjmp;

public class Solution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(10, 85, 30));

	}

	public static int solution(int X, int Y, int D) {
        // write your code in Java SE 8
		double remainder = (Y-X)/(D*1.0);
		return (int)Math.ceil(remainder);
    }
	
}
