package com.codility.lessons.Sorting;

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

import com.codility.lessons.CountingElements.PermutationCheckTest;

/**
 * https://app.codility.com/programmers/lessons/6-sorting/distinct/
 * 
 * @author Shaikat
 *
 */
@RunWith(SpringRunner.class)
public class DistinctTest {

	private static Logger LOG = LoggerFactory.getLogger(PermutationCheckTest.class);

	static Distinct distinct;

	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);

	@BeforeClass
	public static void setup() {
		distinct = new Distinct();
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
		final int[] A = {2, 1, 1, 2, 3, 1};
		final int res = distinct.solution1(A);
		assertEquals(res, 3);
	}

	@Test
	public void solutionTest_2() {
		final int[] A = {2, 1, 1, 2, 3, 1};
		final int res = distinct.solution2(A);
		assertEquals(res, 3);
	}

}
