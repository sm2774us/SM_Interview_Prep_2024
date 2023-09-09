package com.codility.lessons.TimeComplexity;

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

// TapeEquilibrium
// https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/
@RunWith(SpringRunner.class)
public class TapeEquilibriumTest {
    private static Logger LOG = LoggerFactory.getLogger(TapeEquilibriumTest.class);

    static TapeEquilibrium tapeEquilibrium;

    @Rule
    public Timeout globalTimeout = Timeout.seconds(10);


    @BeforeClass
    public static void setup() {
        tapeEquilibrium = new TapeEquilibrium();
    }

    long start, end, diff;

    @Before
    public void start() {
        start = System.currentTimeMillis();
    }

    @After
    public void end() {
        end = System.currentTimeMillis();
        diff = end - start;
        LOG.info("diff-->" + diff);
    }

    @Test
    public void solutionTest_1() {
        // given
        final int[] A = {3,1,2,4,3};

        // when
        final int result = tapeEquilibrium.solution1(A);

        // then
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void solutionTest_2() {
        // given
        final int[] A = {3,1,2,4,3};

        // when
        final int result = tapeEquilibrium.solution2(A);

        // then
        assertThat(result).isEqualTo(1);
    }

}