package com.jennifer.andy.recyclerscrolltoposition.verifications;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import static android.support.test.espresso.matcher.ViewMatchers.assertThat;
import static org.hamcrest.Matchers.is;

public class TopItemAssertion extends ItemCountAssertion {
    public TopItemAssertion(int expectedCount) {
        super(expectedCount);
    }

    @Override
    protected void verify(RecyclerView recyclerView, RecyclerView.Adapter adapter, int expectedCount) {
        LinearLayoutManager layoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        assertThat(layoutManager.findFirstCompletelyVisibleItemPosition(), is(expectedCount));
    }
}
