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
public class HeadsTailsAdjacencyTest {
	private static Logger LOG = LoggerFactory.getLogger(HeadsTailsAdjacencyTest.class);

	static HeadsTailsAdjacency headsTailsAdjacency;

	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);

	@BeforeClass
	public static void setup() {
		headsTailsAdjacency = new HeadsTailsAdjacency();
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
		int[] A = {1, 1, 1};
		int res = headsTailsAdjacency.solution(A);
		assertEquals(res, 2);

		A = new int[] {1, 1, 0, 0, 0};
		res = headsTailsAdjacency.solution(A);
		assertEquals(res, 3);

		A = new int[] {1, 1, 0, 1};
		res = headsTailsAdjacency.solution(A);
		assertEquals(res, 3);
	}

}
