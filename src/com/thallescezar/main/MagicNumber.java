package com.thallescezar.main;
import java.util.Arrays;
import java.util.List;

import com.thallescezar.util.NumberUtil;

public class MagicNumber {
	
	public static void main(String[] args) {

		final String INPUT = "[[8,27], [49,49]]";
		List<String> list = Arrays.asList(INPUT.replace("[", "").replace("]", "").split(", "));
		int count = 0;

		for (String interval : list) {
			String[] numbers = interval.split(",");

			count += NumberUtil.countMagicNumbers(Integer.valueOf(numbers[0]), Integer.valueOf(numbers[1]));
		}
		
		System.out.println("Total of Magic Numbers: " + count);

	}
}
