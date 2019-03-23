package com.praveen.learn.binarygap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution2 {

	public static void main(String[] args) {
		System.out.println(solution(66561));
		System.out.println(solution(32));
		System.out.println(solution(1041));

	}

	public static int solution(int N) {
		// Binary representation of the input
		String binaryString = Integer.toBinaryString(N);
		
		// Storage for matches
		List<String> listOfStrings = new ArrayList<String>();
		
		// If any matches are found
		boolean matchFound = false;

		// Substring under process
		String temp = "";
		
		// Found first 1
		boolean foundBeginMarker = false;
		for (char c : binaryString.toCharArray()) {
			if (c == '0') {
				if (foundBeginMarker) {
					// found 1 and found 0 afterwards
					temp = temp + "0";
				}
			} else {
				temp = temp + "1";
				if (!foundBeginMarker) {
					foundBeginMarker = true;
				} else {
					// System.out.println(temp);
					// Found ending 1, reset temp and foundBeginMarker
					listOfStrings.add(temp);
					matchFound =true;
					temp = "1";
				}
			}
		}

		// find largest string found
		String largestString = "";
		Iterator<String> itr = listOfStrings.iterator();
		while (itr.hasNext()) {
			String str = itr.next();
			if(str.length() > largestString.length())
			{
				largestString = str;
			}
		}
		if (matchFound) {
			return largestString.length() - 2;
		} else {
			return 0;
		}

	}

}
