package com.codility.lessons.SieveOfEratosthenes;

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
public class CountSemiprimesTest {

	private static Logger LOG = LoggerFactory.getLogger(CountSemiprimesTest.class);

	static CountSemiprimes countSemiprimes;

	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);

	@BeforeClass
	public static void setup() {
		countSemiprimes = new CountSemiprimes();
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
		final int N = 26;
		final int[] P = {1, 4, 16};
		final int[] Q = {26, 10, 20};
		final int[] expected = {10, 4, 0};
		final int[] result = countSemiprimes.solution1(N, P, Q);
		assertThat(result).isEqualTo(expected);
	}
	
	@Test
    public void solutionTest_2() {
        final int N = 26;
		final int[] P = {1, 4, 16};
		final int[] Q = {26, 10, 20};
		final int[] expected = {10, 4, 0};
		final int[] result = countSemiprimes.solution2(N, P, Q);
		assertThat(result).isEqualTo(expected);
    }

}
