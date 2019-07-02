package com.jennifer.andy.recyclerscrolltoposition.verifications;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.test.espresso.NoMatchingViewException;
import android.support.test.espresso.ViewAssertion;
import android.view.View;

import static android.support.test.espresso.matcher.ViewMatchers.assertThat;
import static org.hamcrest.Matchers.is;

public class CollapsingToolbarLayoutAssertion implements ViewAssertion {
    private final String expectedContent;

    public CollapsingToolbarLayoutAssertion(String expectedContent) {
        this.expectedContent = expectedContent;
    }

    @Override
    public void check(View view, NoMatchingViewException noViewFoundException) {
        if (noViewFoundException != null) {
            throw noViewFoundException;
        }

        CollapsingToolbarLayout recyclerView = (CollapsingToolbarLayout) view;
        CharSequence title = recyclerView.getTitle();
        assertThat(null == title ? null : title.toString(), is(expectedContent));
    }
}
