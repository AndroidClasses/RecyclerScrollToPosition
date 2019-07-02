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

public class LinearSnappedLayoutManager extends LinearLayoutManager {
    private boolean snapToEnd;

    public LinearSnappedLayoutManager(Context context) {
        super(context);
    }

    public LinearSnappedLayoutManager(Context context, int orientation, boolean reverseLayout) {
        super(context, orientation, reverseLayout);
    }

    public LinearSnappedLayoutManager(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int position) {
        SnappedScroller snappedScroller = new SnappedScroller(recyclerView.getContext(), this, snapToEnd);
        snappedScroller.setTargetPosition(position);
        startSmoothScroll(snappedScroller);
    }

    public void setSnapToEnd(boolean snapToEnd) {
        this.snapToEnd = snapToEnd;
    }
}
