package com.codility.lessons.StacksQueues;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FishTest {

	private static Logger LOG = LoggerFactory.getLogger(FishTest.class);

	static Fish fish;

	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);

	@BeforeClass
	public static void setup() {
		fish = new Fish();
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
        final int[] A = { 4, 3, 2, 1, 5 };
        final int[] B = { 0, 1, 0, 0, 0 };
        final int result = fish.solution1(A, B);
        assertEquals(result, 2);
    }
    
	@Test
    public void solutionTest_2() {
        final int[] A = {4, 3, 2, 1, 5};
        final int[] B = {0, 1, 0, 0, 0};
		final int result = fish.solution2(A, B);
		assertEquals(result, 2);
	}
}
