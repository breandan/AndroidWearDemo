package com.jetbrains.androidweardemo;

import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.*;

/**
 * Created by breandan on 4/1/2015.
 */

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Rule
    public final ActivityRule<MainActivity> main = new ActivityRule<>(MainActivity.class);

    @Test
    public void launchesMainScreen() {
        onView(withText("Hello world!")).check(matches(isDisplayed()));
    }

    @Test
    public void displaysHello() {
        onView(withId(R.id.hello_button)).perform(click());
        onView(withText("Hello there!")).check(matches(isDisplayed()));
    }
}
