package com.codility.lessons.StacksQueues;

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
public class BracketsTest {

	private static Logger LOG = LoggerFactory.getLogger(BracketsTest.class);

	static Brackets brackets;

	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);

	@BeforeClass
	public static void setup() {
		brackets = new Brackets();
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
		final String s = "{[()()]}";
		final int result = brackets.solution1(s);
		assertEquals(result, 0);
	}

	@Test
	public void solutionTest_2() {
		final String s = "{[()()]}";
		final int result = brackets.solution2(s);
		assertEquals(result, 0);
	}

	@Test
	public void solutionTest_3() {
		final String s = "{[()()]}";
		final int result = brackets.solution3(s);
		assertEquals(result, 0);
	}
}
