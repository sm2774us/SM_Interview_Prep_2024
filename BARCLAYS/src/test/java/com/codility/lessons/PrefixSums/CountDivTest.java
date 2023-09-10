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
public class CountDivTest {

	private static Logger LOG = LoggerFactory.getLogger(CountDivTest.class);

	static CountDiv countDiv;

	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);

	@BeforeClass
	public static void setup() {
		countDiv = new CountDiv();
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
        final int A = 6;
		final int B = 11;
		final int K = 2;
		final int result = countDiv.solution1(A, B, K);
		assertEquals(result, 3);
    }
    
	@Test
    public void solutionTest_2() {
        final int A = 6;
		final int B = 11;
		final int K = 2;
		final int result = countDiv.solution2(A, B, K);
		assertEquals(result, 3);
	}
}
