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

	public static Double maximumTest(Double a, Double b, Double c) {
		Double max = a;
		if (b.compareTo(max) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;
		return max;
	}
	
	public static String maximumTest(String a, String b, String c) {
		String max = a;
		if (b.compareTo(max) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;
		return max;
	}

	public static void main(String[] args) {
		Integer aInteger = 5, bInteger = 10, cInteger = 15;
		Double aDouble = 5.0, bDouble = 10.0, cDouble = 15.0;
		String aString = "Apple", bString = "Peach", cString = "Banana";
		System.out.println(maximumTest(aInteger, bInteger, cInteger));
		System.out.println(maximumTest(aDouble, bDouble, cDouble));
		System.out.println(maximumTest(aString, bString, cString));
	}
}
