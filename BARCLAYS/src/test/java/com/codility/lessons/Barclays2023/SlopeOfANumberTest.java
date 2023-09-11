package com.codility.lessons.Barclays2023;

import static org.junit.Assert.assertEquals;

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
public class SlopeOfANumberTest {
	private static Logger LOG = LoggerFactory.getLogger(SlopeOfANumberTest.class);

	static SlopeOfANumber slopeOfANumber;

	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);

	@BeforeClass
	public static void setup() {
		slopeOfANumber = new SlopeOfANumber();
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
		String S = "1213321";
		int res = slopeOfANumber.solution1(S);
		assertEquals(res, 2);

		//S = "273299302236131";
		//res = slopeOfANumber.solution1(S);
		//assertEquals(res, 6);
	}

	@Test
	public void solutionTest_2() {
		int num = 1213321;
		int res = slopeOfANumber.solution2(num);
		assertEquals(res, 2);

		//num = 273299302236131;
		//res = slopeOfANumber.solution2(num);
		//assertEquals(res, 6);
	}

}
