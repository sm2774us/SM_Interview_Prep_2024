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
public class LargestNumberOfVaccinesTest {
	private static Logger LOG = LoggerFactory.getLogger(LargestNumberOfVaccinesTest.class);

	static LargestNumberOfVaccines largestNumberOfVaccines;

	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);

	@BeforeClass
	public static void setup() {
		largestNumberOfVaccines = new LargestNumberOfVaccines();
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
		assertThat(largestNumberOfVaccines.solve(5, new int[] { 9, 4, 2, 2, 6, 3, 2, 2, 1 })).isEqualTo(99999);
		assertThat(largestNumberOfVaccines.solve(2, new int[] { 5, 11, 2, 2, 5, 8, 9, 10, 19 })).isEqualTo(4);
		assertThat(largestNumberOfVaccines.solve(5, new int[] { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 })).isEqualTo(-1);
		assertThat(largestNumberOfVaccines.solve(32, new int[] {7, 8, 9, 8, 7, 9, 8, 8, 10})).isEqualTo(9855);		
	}

}
