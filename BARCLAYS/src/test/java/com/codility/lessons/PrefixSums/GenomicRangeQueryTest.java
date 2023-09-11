package com.codility.lessons.PrefixSums;

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
public class GenomicRangeQueryTest {

	private static Logger LOG = LoggerFactory.getLogger(GenomicRangeQueryTest.class);

	static GenomicRangeQuery genomicRangeQuery;

	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);

	@BeforeClass
	public static void setup() {
		genomicRangeQuery = new GenomicRangeQuery();
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
        final String S = "CAGCCTA";
		final int[] P = {2, 5, 0};
		final int[] Q = {4, 5, 6};
		final int[] expected = {2, 4, 1};
		final int[] result = genomicRangeQuery.solution1(S, P, Q);
		assertThat(result).isEqualTo(expected);
    }
    
	@Test
    public void solutionTest_2() {
        final String S = "CAGCCTA";
		final int[] P = {2, 5, 0};
		final int[] Q = {4, 5, 6};
		final int[] expected = {2, 4, 1};
		final int[] result = genomicRangeQuery.solution2(S, P, Q);
		assertThat(result).isEqualTo(expected);
	}
}
