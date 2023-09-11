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

// FrogJmp
// https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/
@RunWith(SpringRunner.class)
public class FrogJmpTest {
    private static Logger LOG = LoggerFactory.getLogger(FrogJmpTest.class);

    static FrogJmp frogJmp;

    @Rule
    public Timeout globalTimeout = Timeout.seconds(10);


    @BeforeClass
    public static void setup() {
        frogJmp = new FrogJmp();
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
        final int x = 10;
        final int y = 85;
        final int d = 30;

        // when
        final int result = frogJmp.solution1(x, y, d);

        // then
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void solutionTest_2() {
        // given
        final int x = 10;
        final int y = 85;
        final int d = 30;

        // when
        final int result = frogJmp.solution2(x, y, d);

        // then
        assertThat(result).isEqualTo(3);
    }

}
