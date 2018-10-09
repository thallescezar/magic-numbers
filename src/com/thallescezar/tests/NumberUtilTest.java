package com.thallescezar.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.thallescezar.util.NumberUtil;

public class NumberUtilTest {

	@Test
	public void testIsPrime() {
		int primeNumber = 17;
		int notPrimeNumber = 6;
		
		assertTrue(NumberUtil.isPrime(primeNumber));
		assertFalse(NumberUtil.isPrime(notPrimeNumber));
	}

	@Test
	public void testHasSquareRoot() {
		int squareRootNumber = 64;
		int notSquareRootNumber = 33;
		
		assertTrue(NumberUtil.hasSquareRoot(squareRootNumber));
		assertFalse(NumberUtil.hasSquareRoot(notSquareRootNumber));
	}

	@Test
	public void testCountMagicNumbers() {
		
		int minInterval = 8;
		int maxInterval = 27;
		
		assertTrue(NumberUtil.countMagicNumbers(minInterval, maxInterval) == 2);
	}

}
