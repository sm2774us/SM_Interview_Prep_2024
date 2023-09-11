package com.codility.lessons.CaterpillarMethod;

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
public class CountDistinctSlicesTest {

	private static Logger LOG = LoggerFactory.getLogger(CountDistinctSlicesTest.class);

	static CountDistinctSlices countDistinctSlices;

	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);

	@BeforeClass
	public static void setup() {
		countDistinctSlices = new CountDistinctSlices();
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
		final int M = 6;
		final int[] A = {3, 4, 5, 5, 2};
		final int result = countDistinctSlices.solution1(M, A);
		assertThat(result).isEqualTo(9);
	}
	
	@Test
	public void solutionTest_2() {
		final int M = 6;
		final int[] A = {3, 4, 5, 5, 2};
		final int result = countDistinctSlices.solution2(M, A);
		assertThat(result).isEqualTo(9);

    }

}
