package com.jennifer.andy.recyclerscrolltoposition.verifications;

import android.support.test.espresso.NoMatchingViewException;
import android.support.test.espresso.ViewAssertion;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import static android.support.test.espresso.matcher.ViewMatchers.assertThat;
import static org.hamcrest.Matchers.is;

abstract public class ItemCountAssertion implements ViewAssertion {
    private final int expectedCount;

    public ItemCountAssertion(int expectedCount) {
        this.expectedCount = expectedCount;
    }

    @Override
    public void check(View view, NoMatchingViewException noViewFoundException) {
        if (noViewFoundException != null) {
            throw noViewFoundException;
        }

        RecyclerView recyclerView = (RecyclerView) view;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        verify(recyclerView, adapter, expectedCount);
    }

    protected abstract void verify(RecyclerView recyclerView, RecyclerView.Adapter adapter, int expectedCount);
}
