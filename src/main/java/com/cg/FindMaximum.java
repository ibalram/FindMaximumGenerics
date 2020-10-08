package com.cg;

public class FindMaximum <T extends Comparable>{
	T a,b,c;
	
	public FindMaximum(T a, T b, T c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public T maximumTest() {
		return maximumTest(a,b,c);
	}

	public static <T extends Comparable> T maximumTest(T a, T b, T c) {
		T max = a;
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
		
		System.out.println(new FindMaximum<Integer>(aInteger,bInteger,cInteger).maximumTest());
		System.out.println(new FindMaximum<Double>(aDouble,bDouble,cDouble).maximumTest());
		System.out.println(new FindMaximum<String>(aString,bString,cString).maximumTest());
	}
}
