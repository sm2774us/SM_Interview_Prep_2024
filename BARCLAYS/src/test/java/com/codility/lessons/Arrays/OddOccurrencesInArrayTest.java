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

// OddOccurrencesInArray
// https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/
@RunWith(SpringRunner.class)
public class OddOccurrencesInArrayTest {
    private static Logger LOG = LoggerFactory.getLogger(OddOccurrencesInArrayTest.class);

    static OddOccurrencesInArray oddOccurrencesInArray;

    @Rule
    public Timeout globalTimeout = Timeout.seconds(10);


    @BeforeClass
    public static void setup() {
        oddOccurrencesInArray = new OddOccurrencesInArray();
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
        final int[] input = {9, 3, 9, 3, 9, 7, 9};

        // when
        final int[] result = oddOccurrencesInArray.solution1(input);

        // then
        assertThat(result).isEqualTo(7);
    }

    @Test
    public void solutionTest_2() {
        // given
        final int[] input = {9, 3, 9, 3, 9, 7, 9};

        // when
        final int[] result = oddOccurrencesInArray.solution2(input);

        // then
        assertThat(result).isEqualTo(7);
    }

}
