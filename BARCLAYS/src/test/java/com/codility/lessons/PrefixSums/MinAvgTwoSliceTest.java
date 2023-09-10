package com.codility.lessons.PrefixSums;

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
public class MinAvgTwoSliceTest {

	private static Logger LOG = LoggerFactory.getLogger(MinAvgTwoSliceTest.class);

	static MinAvgTwoSlice minAvgTwoSlice;

	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);

	@BeforeClass
	public static void setup() {
		minAvgTwoSlice = new MinAvgTwoSlice();
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
 		final int[] A = {4, 2, 2, 5, 1, 5, 8};
		final int result = minAvgTwoSlice.solution1(A);
		assertEquals(result, 1);
    }
    
	@Test
    public void solutionTest_2() {
        final int[] A = {4, 2, 2, 5, 1, 5, 8};
		final int result = minAvgTwoSlice.solution2(A);
		assertEquals(result, 1);
	}
}
