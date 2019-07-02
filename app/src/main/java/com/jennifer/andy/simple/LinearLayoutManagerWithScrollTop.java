package com.jennifer.andy.simple;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/**
 * Author:  andy.xwt
 * Date:    2018/6/20 16:28
 * Description:
 */

public class LinearLayoutManagerWithScrollTop extends LinearLayoutManager {
    private boolean snapToEnd;

    public LinearLayoutManagerWithScrollTop(Context context) {
        super(context);
    }

    public LinearLayoutManagerWithScrollTop(Context context, int orientation, boolean reverseLayout) {
        super(context, orientation, reverseLayout);
    }

    public LinearLayoutManagerWithScrollTop(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int position) {
        TopSnappedSmoothScroller topSnappedSmoothScroller = new TopSnappedSmoothScroller(recyclerView.getContext(), this, snapToEnd);
        topSnappedSmoothScroller.setTargetPosition(position);
        startSmoothScroll(topSnappedSmoothScroller);
    }

    public void setSnapToEnd(boolean snapToEnd) {
        this.snapToEnd = snapToEnd;
    }
}
