package com.jetbrains.androidweardemo;

import android.app.AlertDialog;
import android.widget.Button;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.shadows.ShadowAlertDialog;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.robolectric.Shadows.shadowOf;
import static org.robolectric.shadows.ShadowView.clickOn;

/**
 * Created by breandan on 4/2/2015.
 */

@RunWith(RobolectricGradleTestRunner.class)
//@Config(manifest = "app/src/main/AndroidManifest.xml", emulateSdk = 21)
public class MainActivityTest {
    @Test
    public void buttonTapDisplaysAnAlertDialog() {
        MainActivity helloActivity = Robolectric.setupActivity(MainActivity.class);

        Button button = (Button) helloActivity.findViewById(R.id.hello_button);

        clickOn(button);

        AlertDialog latestAlertDialog = ShadowAlertDialog.getLatestAlertDialog();
        assertThat(latestAlertDialog, is(notNullValue()));

        ShadowAlertDialog shadowAlertDialog = shadowOf(latestAlertDialog);
        assertThat(shadowAlertDialog.getTitle().toString(), is("Hello there!"));
    }
}