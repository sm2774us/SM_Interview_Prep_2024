package com.codility.lessons.Barclays2023;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class MoveAllZerosToEndOfArrayTest {
	private static Logger LOG = LoggerFactory.getLogger(MoveAllZerosToEndOfArrayTest.class);

	static MoveAllZerosToEndOfArray moveAllZerosToEndOfArray;

	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);

	@BeforeClass
	public static void setup() {
		moveAllZerosToEndOfArray = new MoveAllZerosToEndOfArray();
	}

	static long start, end;
	static double diff;

	@Before
	public void start() {
		start = System.currentTimeMillis();
		LOG.info("start-->" + start);
	}

	@After
	public void end() {
		end = System.currentTimeMillis();
		LOG.info("end-->" + end);

		diff = end - start;
		LOG.info("millis-->" + (diff));// millis
		LOG.info("seconds-->" + (diff / 1000));// seconds
	}

	@Test
	public void solutionTest() {
		int[] arr = { 0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9 };
		int n = arr.length;
		int[] expected = {1, 9, 8, 4, 2, 7, 6, 9, 0, 0, 0, 0, 0};
		moveAllZerosToEndOfArray.solution(arr, n);
		assertThat(arr).isEqualTo(expected);

		arr = new int[] { 1, 2, 0, 0, 0, 3, 6 };
		n = arr.length;
		expected = new int[] {1, 2, 3, 6, 0, 0, 0};
		moveAllZerosToEndOfArray.solution(arr, n);
		assertThat(arr).isEqualTo(expected);
	}

}
