package com.jetbrains.androidweardemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by breandan on 4/2/2015.
 */
@RunWith(RobolectricTestRunner.class)
public class RobolectricTest {
    @Test
    public void testIt() {
        assertThat(RuntimeEnvironment.application, nullValue());
    }
}