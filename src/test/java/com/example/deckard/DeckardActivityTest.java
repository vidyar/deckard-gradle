package com.example.deckard;

import android.app.Activity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;

import static org.junit.Assert.assertTrue;

@RunWith(RobolectricGradleTestRunner.class)
public class DeckardActivityTest {
    @Test
    public void itWorks() throws Exception {
        Activity activity = Robolectric.buildActivity(DeckardActivity.class).create().get();
        assertTrue(activity != null);
    }
}
