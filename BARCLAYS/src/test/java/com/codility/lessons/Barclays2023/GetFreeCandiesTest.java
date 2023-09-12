package com.codility.lessons.Barclays2023;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

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
public class GetFreeCandiesTest {
	private static Logger LOG = LoggerFactory.getLogger(GetFreeCandiesTest.class);

	static GetFreeCandies getFreeCandies;

	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);

	@BeforeClass
	public static void setup() {
		getFreeCandies = new GetFreeCandies();
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
		final int[] arr = { 3, 2, 1, 4 };
		final int k = 2;
		assertThat(getFreeCandies.findMinCost1(k, arr)).isEqualTo(3);
		assertThat(getFreeCandies.findMaxCost1(k, arr)).isEqualTo(7);
	}

	public void solutionTest_2() {
		final int[] arr = { 3, 2, 1, 4 };
		final int k = 2;
		assertThat(getFreeCandies.findMinCost2(k, arr)).isEqualTo(3);
		assertThat(getFreeCandies.findMaxCost2(k, arr)).isEqualTo(7);
	}

}
