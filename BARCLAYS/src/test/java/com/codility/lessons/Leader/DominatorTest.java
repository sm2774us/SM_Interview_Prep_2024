package com.codility.lessons.Leader;

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
public class DominatorTest {

	private static Logger LOG = LoggerFactory.getLogger(DominatorTest.class);

	static Dominator dominator;

	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);

	@BeforeClass
	public static void setup() {
		dominator = new Dominator();
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
        final int[] A = {3, 4, 3, 2, 3, -1, 3, 3};
		final int result = dominator.solution1(A);
		assertThat(Integer.valueOf(result))
			.isIn(
				Integer.valueOf(0),
				Integer.valueOf(2),
				Integer.valueOf(4),
				Integer.valueOf(6),
				Integer.valueOf(7)
			);
    }
    
	@Test
    public void solutionTest_2() {
        final int[] A = {3, 4, 3, 2, 3, -1, 3, 3};
		final int result = dominator.solution2(A);
		assertThat(Integer.valueOf(result))
			.isIn(
				Integer.valueOf(0),
				Integer.valueOf(2),
				Integer.valueOf(4),
				Integer.valueOf(6),
				Integer.valueOf(7)
			);
	}
}
