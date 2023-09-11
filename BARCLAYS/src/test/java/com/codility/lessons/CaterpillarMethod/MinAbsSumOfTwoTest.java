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
public class MinAbsSumOfTwoTest {

	private static Logger LOG = LoggerFactory.getLogger(MinAbsSumOfTwoTest.class);

	static MinAbsSumOfTwo minAbsSumOfTwo;

	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);

	@BeforeClass
	public static void setup() {
		minAbsSumOfTwo = new MinAbsSumOfTwo();
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
		int[] A = {1, 4, -3};
		int result = minAbsSumOfTwo.solution1(A);
        assertThat(result).isEqualTo(1);

		A = new int[] {-8, 4, 5, -10, 3};
		result = minAbsSumOfTwo.solution1(A);
		assertThat(result).isEqualTo(3);
	}
	
	@Test
	public void solutionTest_2() {
		int[] A = {1, 4, -3};
		int result = minAbsSumOfTwo.solution2(A);
        assertThat(result).isEqualTo(1);

		A = new int[] {-8, 4, 5, -10, 3};
		result = minAbsSumOfTwo.solution2(A);
		assertThat(result).isEqualTo(3);
    }

}
