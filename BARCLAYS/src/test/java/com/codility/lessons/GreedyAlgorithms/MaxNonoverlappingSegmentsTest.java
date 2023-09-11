package com.codility.lessons.GreedyAlgorithms;

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
public class MaxNonoverlappingSegmentsTest {

	private static Logger LOG = LoggerFactory.getLogger(MaxNonoverlappingSegmentsTest.class);

	static MaxNonoverlappingSegments maxNonoverlappingSegments;

	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);

	@BeforeClass
	public static void setup() {
		maxNonoverlappingSegments = new MaxNonoverlappingSegments();
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
		final int[] A = {1, 3, 7, 9, 9};
		final int[] B = {5, 6, 8, 9, 10};
		final int result = maxNonoverlappingSegments.solution(A, B);
		assertThat(result).isEqualTo(3);
	}

}
