package com.cg;

public class FindMaximum<T extends Comparable> {
	T a, b, c;

	public FindMaximum(T a, T b, T c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public T maximumTest() {
		return maximumTest(a, b, c);
	}

	public static <T extends Comparable> T maximumTest(T a, T... b) {
		T max = a;
		for (T elem : b)
			if (elem.compareTo(max) > 0)
				max = elem;
		return max;
	}
	
	public static <T extends Comparable> T maximumTest(T a, T b, T c) {
		T max = a;
		if (b.compareTo(max)>0)
			max = b;
		if (c.compareTo(max)>0)
			max = c;
		printMax(a,b,c,max);
		return max;
	}
	
	public static <T> void printMax(T a, T b, T c, T max) {
		System.out.println(String.format("Maximum of %s, %s and %s is: %s", a,b,c,max));
	}

	public static void main(String[] args) {
		Integer aInteger = 5, bInteger = 10, cInteger = 15;
		Double aDouble = 5.0, bDouble = 10.0, cDouble = 15.0;
		String aString = "Apple", bString = "Peach", cString = "Banana";
		System.out.println(maximumTest(aInteger, bInteger, cInteger));
		System.out.println(maximumTest(aDouble, bDouble, cDouble));
		System.out.println(maximumTest(aString, bString, cString));

		new FindMaximum<Integer>(aInteger, bInteger, cInteger).maximumTest();
		new FindMaximum<Double>(aDouble, bDouble, cDouble).maximumTest();
		new FindMaximum<String>(aString, bString, cString).maximumTest();
	}
}
