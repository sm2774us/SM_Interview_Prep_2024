package com.codility.lessons.Arrays;

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

// CyclicRotation
// https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/
@RunWith(SpringRunner.class)
public class CyclicRotationTest {
    private static Logger LOG = LoggerFactory.getLogger(CyclicRotationTest.class);

    static CyclicRotation cyclicRotation;

    @Rule
    public Timeout globalTimeout = Timeout.seconds(10);


    @BeforeClass
    public static void setup() {
        cyclicRotation = new CyclicRotation();
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
        int A[] = {3, 8, 9, 7, 6};
        int K = 3;

        // when
        int[] result = cyclicRotation.solution1(A, K);

        // then
        assertThat(result).isEqualTo(new int[]{9, 7, 6, 3, 8});

        // given
        A[] = {};
        K = 3;

        // when
        result = cyclicRotation.solution1(A, K);

        // then
        assertThat(result).isEqualTo(new int[]{});
    }

    @Test
    public void solutionTest_2() {
        // given
        int A[] = {3, 8, 9, 7, 6};
        int K = 3;

        // when
        int[] result = cyclicRotation.solution2(A, K);

        // then
        assertThat(result).isEqualTo(new int[]{9, 7, 6, 3, 8});

        // given
        A[] = {};
        K = 3;

        // when
        result = cyclicRotation.solution2(A, K);

        // then
        assertThat(result).isEqualTo(new int[]{});
    }

}