package com.codility.lessons.EuclideanAlgorithm;

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
public class CommonPrimeDivisorsTest {

	private static Logger LOG = LoggerFactory.getLogger(CommonPrimeDivisorsTest.class);

	static CommonPrimeDivisors commonPrimeDivisors;

	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);

	@BeforeClass
	public static void setup() {
		commonPrimeDivisors = new CommonPrimeDivisors();
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
		final int[] A = {15, 10, 3};
		final int[] B = {75, 30, 5};
		final int result = commonPrimeDivisors.solution(A, B);
		assertThat(result).isEqualTo(1);
    }

}
