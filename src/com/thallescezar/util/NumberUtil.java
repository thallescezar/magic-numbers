package com.thallescezar.util;
public class NumberUtil {

	/**
	 * Method capable of tell if a number is a prime number.
	 * 
	 * @param number Number in test.
	 * @return true if number is a prime, false in case not.
	 */
	public static boolean isPrime(int number) {
		
		if(number > 2 && number % 2 == 0) {
			return false;
		}
		
		int maximumNumber = (int) Math.sqrt(number);

		for(int i = 3; i < maximumNumber; i += 2) {
			if(number % i == 0) {
				return false;
			}
		}
		return true; 
	}

	/**
	 * Method capable of determine is a number is a perfect square
	 * 
	 * @param number Number in test
	 * @return true if number is a perfect square, false in case not.
	 */
	public static boolean hasSquareRoot(int number) {

		int sqrt = (int) Math.sqrt(number);
		return sqrt*sqrt == number;
	}
	
	/**
	 * Method that, given an interval, counts how many magic numbers exist.
	 * @param firstNumber first number of the interval.
	 * @param lastNumber last number of the interval.
	 * @return how many magic number exist in the interval.
	 */
	public static int countMagicNumbers(int firstNumber, int lastNumber) {
		
		int count = 0;
		
		for (int i = firstNumber; i <= lastNumber; i++) {
			if(NumberUtil.hasSquareRoot(i)) {
				if(NumberUtil.isPrime((int) Math.sqrt(i))) {
					count++;
				}
			}
		}
		
		return count;
	}
}
