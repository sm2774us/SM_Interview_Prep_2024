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
public class PermutationCheckTest {
	private static Logger LOG = LoggerFactory.getLogger(PermutationCheckTest.class);

	static PermutationCheck permutationCheck;

	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);

	@BeforeClass
	public static void setup() {
		permutationCheck = new PermutationCheck();
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
		int[] A = {4,1,3,2};
		int res = permutationCheck.solution1(A);
		assertEquals(res, 1);
	}

	@Test
	public void solutionTest_2() {
		int[] A = {4,1,3,2};
		int res = permutationCheck.solution2(A);
		assertEquals(res, 1);
	}

	@Test
	public void solutionTest_3() {
		int[] A = {4,1,3,2};
		int res = permutationCheck.solution3(A);
		assertEquals(res, 1);
	}
}
