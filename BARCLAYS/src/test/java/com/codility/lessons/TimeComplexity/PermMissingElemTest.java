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

// PermMissingElem
// https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
@RunWith(SpringRunner.class)
public class PermMissingElemTest {
    private static Logger LOG = LoggerFactory.getLogger(PermMissingElemTest.class);

    static PermMissingElem permMissingElem;

    @Rule
    public Timeout globalTimeout = Timeout.seconds(10);


    @BeforeClass
    public static void setup() {
        permMissingElem = new PermMissingElem();
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
        final int[] input = {2,3,1,5};

        // when
        final int result = permMissingElem.solution1(input);

        // then
        assertThat(result).isEqualTo(4);
    }

    @Test
    public void solutionTest_2() {
        // given
        final int[] input = {2,3,1,5};

        // when
        final int result = permMissingElem.solution2(input);

        // then
        assertThat(result).isEqualTo(4);
    }

    @Test
    public void solutionTest_3() {
        // given
        final int[] input = {2,3,1,5};

        // when
        final int result = permMissingElem.solution3(input);

        // then
        assertThat(result).isEqualTo(4);
    }

}