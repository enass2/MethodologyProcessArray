package nass;

import static org.junit.Assert.*;

import org.junit.Test;

import nass.Program;

public class Tests {

	@Test
	public void maxValIsCorrect() {
		int[] array = { 78, 90, 4, 2, 1, 89, 76, 9 };
		Program p = new Program();
		assertEquals(90, p.getMaxVal(array));

	}

	@Test
	public void maxValIsCorrectArrayHasZeros() {
		int[] array = { 3, 0, 60, 0, 9, 7, 0, 1 };
		Program p = new Program();
		assertEquals(60, p.getMaxVal(array));

	}

	@Test
	public void maxValIsCorrectArrayHasNegatives() {
		int[] array = { 3 - 3, 0, 6, -10, 9, 7, 0, 100 };
		Program p = new Program();
		assertEquals(100, p.getMaxVal(array));

	}


	
	@Test
	public void minValIsCorrect() {
		int[] array = { 1, 7, 90, 56, 90, 56, 87 };
		Program p = new Program();
		assertEquals(1, p.getMinVal(array));
	}

	@Test
	public void minValIsCorrectArrayHasZeros() {
		int[] array = { 0, 5, 67, 0, 78, 100, 3 };
		Program p = new Program();
		assertEquals(0, p.getMinVal(array));
	}

	@Test
	public void minValIsCorrectArrayHasNegatives() {
		int[] array = { -9, 90, 7, 2, -43, 8, 7, 60, -7 };
		Program p = new Program();
		assertEquals(-43, p.getMinVal(array));
	}



	@Test
	public void averageIsCorrect() {
		int[] array = { 1, 7, 90, 56, 90, 56, 87 };
		Program p = new Program();
		assertEquals(55.29, p.getAverage(array), .001);

	}

	@Test
	public void averagelIsCorrectArrayHasZeros() {
		int[] array = { 0, 5, 67, 0, 78, 100, 3 };
		Program p = new Program();
		assertEquals(36.14, p.getAverage(array), .001);
	}

	@Test
	public void averageIsCorrectArrayHasNegatives() {
		int[] array = { -9, 90, 7, 2, -43, 8, 7, 60, -7 };
		Program p = new Program();
		assertEquals(12.78, p.getAverage(array), .001);
	}

	@Test
	public void averageIsCorrectEmptyArray() {
		int[] array = { };
		Program p = new Program();
		assertEquals(0, p.getAverage(array),.001);
	}

	@Test
	public void sumOfArray() {
		int[] array = { 1, 7, 6, 5, 55, 90, 72 };
		Program p = new Program();
		assertEquals(236, p.getSum(array));
	}

	@Test
	public void sumOfArrayArrayHasZero() {
		int[] array = { 0, 7, 6, 5, 55, 90, 72, 0 };
		Program p = new Program();
		assertEquals(235, p.getSum(array));
	}

	@Test
	public void sumOfArrayArrayHasNegatives() {
		int[] array = { -1, 7, 6, 5, -55, -43, 72 };
		Program p = new Program();
		assertEquals(-9, p.getSum(array));
	}

	@Test
	public void sumOfARrayIsCorrectEmptyArray() {
		int[] array = {};
		Program p = new Program();
		assertEquals(0, p.getSum(array));

	}

}