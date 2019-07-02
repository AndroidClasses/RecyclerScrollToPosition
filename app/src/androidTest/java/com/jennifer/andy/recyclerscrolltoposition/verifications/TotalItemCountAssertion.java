package com.jennifer.andy.recyclerscrolltoposition.verifications;

import android.support.v7.widget.RecyclerView;

import static android.support.test.espresso.matcher.ViewMatchers.assertThat;
import static org.hamcrest.Matchers.is;

public class TotalItemCountAssertion extends ItemCountAssertion {
    public TotalItemCountAssertion(int expectedCount) {
        super(expectedCount);
    }

    @Override
    protected void verify(RecyclerView recyclerView, RecyclerView.Adapter adapter, int expectedCount) {
        assertThat(adapter.getItemCount(), is(expectedCount));
    }
}
