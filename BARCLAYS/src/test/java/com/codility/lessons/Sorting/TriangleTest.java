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
 * https://app.codility.com/programmers/lessons/6-sorting/triangle/
 *
 * @author Shaikat
 *
 */
@RunWith(SpringRunner.class)
public class TriangleTest {
	private static Logger LOG = LoggerFactory.getLogger(PermutationCheckTest.class);
	static Triangle triangle;
	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);

	@BeforeClass
	public static void setup() {
		triangle = new Triangle();
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
		int[] A = {10, 2, 5, 1, 8, 20};
		int res = triangle.solution1(A);
		assertEquals(res, 1);

		A = new int[] {10, 50, 5, 1};
		res = triangle.solution1(A);
		assertEquals(res, 0);
	}

	@Test
	public void solutionTest_2() {
		int[] A = {10, 2, 5, 1, 8, 20};
		int res = triangle.solution2(A);
		assertEquals(res, 1);

		A = new int[] {10, 50, 5, 1};
		res = triangle.solution2(A);
		assertEquals(res, 0);
	}
}
