package com.jetbrains.androidweardemo;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by breandan on 4/2/2015.
 */
public class JUnitTest {
    @Test
    public void checkTestPasses() {
        assertThat(true, is(true));
    }

    @Test
    public void checkTestFails() {
        assertThat(true, is(false));
    }
}
