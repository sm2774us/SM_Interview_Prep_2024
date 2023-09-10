package com.codility.lessons.MaximumSliceProblem;

import static org.assertj.core.api.Assertions.assertThat;

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
public class MaxDoubleSliceSumTest {

	private static Logger LOG = LoggerFactory.getLogger(MaxDoubleSliceSumTest.class);

	static MaxDoubleSliceSum maxDoubleSliceSum;

	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);

	@BeforeClass
	public static void setup() {
		maxDoubleSliceSum = new MaxDoubleSliceSum();
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
        final int[] A = {3, 2, 6, -1, 4, 5, -1, 2};
		final int result = maxDoubleSliceSum.solution1(A);
		assertThat(result).isEqualTo(17);
    }
    
	@Test
    public void solutionTest_2() {
        final int[] A = {3, 2, 6, -1, 4, 5, -1, 2};
		final int result = maxDoubleSliceSum.solution2(A);
		assertThat(result).isEqualTo(17);
	}
}
