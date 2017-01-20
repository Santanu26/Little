package com.shantanu;

public class TrailingZero {
	public static void main(String[] args) {
		int n = 5;
		int result = zeroCount(n);
		System.out.println("Number of Trailing Zero of 100! is : " + result);
	}

	public static int zeroCount(int data) {
		int count = 0;
		for (int i = 5; data / i >= 1; i = i * 5) {
			count = count + data / i;
		}
		return count;
	}

}
