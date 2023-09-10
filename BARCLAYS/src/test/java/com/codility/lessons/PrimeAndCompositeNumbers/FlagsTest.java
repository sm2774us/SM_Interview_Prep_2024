package com.codility.lessons.PrimeAndCompositeNumbers;

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
public class FlagsTest {

	private static Logger LOG = LoggerFactory.getLogger(FlagsTest.class);

	static Flags flags;

	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);

	@BeforeClass
	public static void setup() {
		flags = new Flags();
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
		final int[] A = {1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2};
		final int result = flags.solution1(A);
		assertThat(result).isEqualTo(3);
	}

	@Test
    public void solutionTest_2() {
        final int[] A = {1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2};
		final int result = flags.solution2(A);
		assertThat(result).isEqualTo(3);
    }
}
