package com.codility.lessons.Barclays2015;

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
public class LongestIncreasingSequenceDiffTest {
	private static Logger LOG = LoggerFactory.getLogger(LongestIncreasingSequenceDiffTest.class);

	static LongestIncreasingSequenceDiff longestIncreasingSequenceDiff;

	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);

	@BeforeClass
	public static void setup() {
		longestIncreasingSequenceDiff = new LongestIncreasingSequenceDiff();
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
		final int[] A = {6, 8, 6, 7, 9};
		final int res = longestIncreasingSequenceDiff.solution(A);
		assertEquals(res, 3);
	}

}
