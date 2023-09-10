package com.codility.lessons.CountingElements;

import static org.junit.Assert.assertEquals;

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
public class MissingIntegerTest {
	private static Logger LOG = LoggerFactory.getLogger(MissingIntegerTest.class);

	static MissingInteger missingInteger;

	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);

	@BeforeClass
	public static void setup() {
		missingInteger = new MissingInteger();
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
	public void solutionTest_1() {
		int[] A = {1, 3, 6, 4, 1, 2};
		int result = missingInteger.solution1(A);
		assertEquals(result, 5);

		A = new int[] {1, 2, 3};
		result = missingInteger.solution1(A);
		assertEquals(result, 4);

		A = new int[] {-1, -3};
		result = missingInteger.solution1(A);
		assertEquals(result, 1);
	}

	@Test
	public void solutionTest_2() {
		int[] A = {1, 3, 6, 4, 1, 2};
		int result = missingInteger.solution2(A);
		assertEquals(result, 5);

		A = new int[] {1, 2, 3};
		result = missingInteger.solution2(A);
		assertEquals(result, 4);

		A = new int[] {-1, -3};
		result = missingInteger.solution2(A);
		assertEquals(result, 1);
	}
}
