package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] words = new String[3];
		_00_LinearSearch ls = new _00_LinearSearch();
		words[0] = "a";
		words[1] = "b";
		words[2] = "c";
	
		assertEquals(0, ls.linearSearch(words, "a"));
		assertEquals(1, ls.linearSearch(words, "b"));
		assertEquals(2, ls.linearSearch(words, "c"));
		assertEquals(-1, ls.linearSearch(words, "d"));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] array = new int[10];
		_01_BinarySearch bs = new _01_BinarySearch();
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
	
		
		assertEquals(0, bs.binarySearch(array, 0, 2, 1));
		assertEquals(1, bs.binarySearch(array, 0, 2, 2));
		assertEquals(2, bs.binarySearch(array, 0, 2, 3));
		assertEquals(-1, bs.binarySearch(array, 0, 2, 4));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
	}
}
