package com.codility.lessons.FibonacciNumbers;

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
public class LadderTest {

	private static Logger LOG = LoggerFactory.getLogger(LadderTest.class);

	static Ladder ladder;

	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);

	@BeforeClass
	public static void setup() {
		ladder = new Ladder();
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
		final int[] A = {4, 4, 5, 5, 1};
		final int[] B = {3, 2, 4, 3, 1};
		final int[] expected = {5, 1, 8, 0, 1};
		final int[] result = ladder.solution1(A, B);
		assertThat(result).isEqualTo(expected);
	}
	
	@Test
	public void solutionTest_2() {
		final int[] A = {4, 4, 5, 5, 1};
		final int[] B = {3, 2, 4, 3, 1};
		final int[] expected = {5, 1, 8, 0, 1};
		final int[] result = ladder.solution2(A, B);
		assertThat(result).isEqualTo(expected);
    }

}
