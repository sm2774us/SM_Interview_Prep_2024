package com.codility.lessons.Barclays2023;

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
public class PackageTest {
	private static Logger LOG = LoggerFactory.getLogger(PackageTest.class);

	static Package pkg;

	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);

	@BeforeClass
	public static void setup() {
		pkg = new Package();
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
		assertThat(pkg.packingSolution(81, new float[] { 53.38f, 88.62f, 78.48f, 72.30f, 30.18f, 46.34f }, new int[] { 45, 98, 3, 76, 9, 48 })).isEqualTo("2");
		assertThat(pkg.packingSolution(75, new float[] { 85.31f, 14.55f, 3.98f, 26.24f, 63.69f, 76.25f, 60.02f, 93.18f, 89.95f }, new int[] { 29, 74, 16, 55, 52, 75, 74, 35, 78 })).isEqualTo("2,7");
	}

}
