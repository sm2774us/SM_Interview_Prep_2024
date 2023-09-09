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
public class MaxCountersTest {
	private static Logger LOG = LoggerFactory.getLogger(MaxCountersTest.class);

	static MaxCounters maxCounters;

	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);

	@BeforeClass
	public static void setup() {
		maxCounters = new MaxCounters();
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
		final int[] expected = {3,2,2,4,2};
		final int N = 5;
		final int[] A = {3,4,4,6,1,4,4};

		final int result = maxCounters.solution1(N, A);
		assertEquals(result, expected);
	}

	@Test
	public void solutionTest_2() {
		final int[] expected = {3,2,2,4,2};
		final int N = 5;
		final int[] A = {3,4,4,6,1,4,4};

		final int result = maxCounters.solution2(N, A);
		assertEquals(result, expected);
	}
}
