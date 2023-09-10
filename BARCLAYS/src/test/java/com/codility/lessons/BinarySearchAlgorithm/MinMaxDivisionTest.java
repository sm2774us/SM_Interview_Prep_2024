package com.codility.lessons.BinarySearchAlgorithm;

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
public class MinMaxDivisionTest {

	private static Logger LOG = LoggerFactory.getLogger(MinMaxDivisionTest.class);

	static MinMaxDivision minMaxDivision;

	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);

	@BeforeClass
	public static void setup() {
		minMaxDivision = new MinMaxDivision();
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
		final int K = 3;
		final int M = 3;
		final int[] A = {2, 1, 5, 1, 2, 2, 2};
		final int result = minMaxDivision.solution(K, M, A);
		assertThat(result).isEqualTo(6);
	}

}
