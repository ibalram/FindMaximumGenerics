package com.cg;

public class FindMaximum {

	public static Integer maximumTest(Integer a, Integer b, Integer c) {
		Integer max = a;
		if (b.compareTo(max) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;
		return max;
	}

	public static void main(String[] args) {
		Integer a = 5, b = 10, c = 15;
		System.out.println(maximumTest(a, b, c));
	}
}
