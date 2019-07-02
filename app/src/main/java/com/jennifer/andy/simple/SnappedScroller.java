package com.jennifer.andy.simple;

import android.content.Context;
import android.graphics.PointF;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSmoothScroller;
import android.util.DisplayMetrics;

class SnappedScroller extends LinearSmoothScroller {
    private final LinearLayoutManager layoutManager;
    private final boolean snapToEnd;
    public SnappedScroller(Context context, LinearLayoutManager layoutManager, boolean snapToEnd) {
        super(context);
        this.layoutManager = layoutManager;
        this.snapToEnd = snapToEnd;
    }

    @Nullable
    @Override
    public PointF computeScrollVectorForPosition(int targetPosition) {
        return layoutManager.computeScrollVectorForPosition(targetPosition);
    }

    /**
     * MILLISECONDS_PER_INCH 默认为25，及移动每英寸需要花费25ms，如果你要速度变快一点，
     * 就直接设置设置小一点，注意这里的单位是f
     */
    protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        return 15f / displayMetrics.densityDpi;
    }

    @Override
    protected int getVerticalSnapPreference() {
        return snapToEnd ? SNAP_TO_END : SNAP_TO_START;
    }

    @Override
    protected int getHorizontalSnapPreference() {
        return snapToEnd ? SNAP_TO_END : SNAP_TO_START;
    }
}
