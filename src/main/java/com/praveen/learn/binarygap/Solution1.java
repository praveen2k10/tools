package com.praveen.learn.binarygap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution1 {

	public static void main(String[] args) {
		System.out.println(solution(32));
		System.out.println(solution(1041));

	}

	public static int solution(int N) {
		String binaryString = Integer.toBinaryString(N);
		// Maintain largest binary gap found
		int largestMatch = 0;
		//List<String> allMatches = new ArrayList<String>();
		Matcher m = Pattern.compile("1(0+)1").matcher(binaryString);
		while (m.find()) {
			String match = m.group();
			//allMatches.add(m.group());
			if (match.length() > largestMatch) {
				largestMatch = match.length() - 2;
			}
		}

		return largestMatch;
	}

}
