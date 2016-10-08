package com.tencent.avsdk.widget;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import java.util.Arrays;

public class ViewDragHelper
{
  private static final int BASE_SETTLE_DURATION = 256;
  private static final float DEFAULT_SCROLL_THRESHOLD = 0.2F;
  public static final int EDGE_LEFT = 1;
  public static final int EDGE_RIGHT = 2;
  public static final int INVALID_POINTER = -1;
  private static final int MAX_SETTLE_DURATION = 600;
  public static final int STATE_DRAGGING = 1;
  public static final int STATE_IDLE = 0;
  public static final int STATE_SETTLING = 2;
  private static final String TAG = "zyw";
  private static final Interpolator sInterpolator = new ViewDragHelper.1();
  private boolean DEBUG = true;
  private int mActivePointerId = -1;
  private Handler mActivityHandler;
  private View mCapturedView;
  private int mDragState;
  private float[] mInitialMotionX;
  private float[] mInitialMotionY;
  private float[] mLastMotionX;
  private float[] mLastMotionY;
  private float mMaxVelocity;
  private float mMinVelocity;
  private float mScrollPercent;
  private float mScrollThreshold = 0.2F;
  private Scroller mScroller;
  private final Runnable mSetIdleRunnable = new ViewDragHelper.2(this);
  private final SwipeBackLayout mSwipeBackLayout;
  private int mTouchSlop;
  private ViewDragHelper.TrackEdge mTrackEdge = ViewDragHelper.TrackEdge.EDGE_NONE;
  private VelocityTracker mVelocityTracker;
  
  private ViewDragHelper(Context paramContext, SwipeBackLayout paramSwipeBackLayout)
  {
    if (paramSwipeBackLayout == null) {
      throw new IllegalArgumentException("Parent view may not be null");
    }
    this.mSwipeBackLayout = paramSwipeBackLayout;
    paramSwipeBackLayout = ViewConfiguration.get(paramContext);
    float f = paramContext.getResources().getDisplayMetrics().density;
    this.mTouchSlop = paramSwipeBackLayout.getScaledTouchSlop();
    if (this.mTouchSlop <= 4) {
      this.mTouchSlop = 4;
    }
    this.mMaxVelocity = paramSwipeBackLayout.getScaledMaximumFlingVelocity();
    this.mMinVelocity = paramSwipeBackLayout.getScaledMinimumFlingVelocity();
    this.mScroller = new Scroller(paramContext, sInterpolator);
  }
  
  private int clampMag(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = Math.abs(paramInt1);
    if (i < paramInt2) {
      paramInt2 = 0;
    }
    do
    {
      return paramInt2;
      if (i <= paramInt3) {
        break;
      }
      paramInt2 = paramInt3;
    } while (paramInt1 > 0);
    return -paramInt3;
    return paramInt1;
  }
  
  private void clearMotionHistory()
  {
    if (this.mInitialMotionX == null) {
      return;
    }
    Arrays.fill(this.mInitialMotionX, 0.0F);
    Arrays.fill(this.mInitialMotionY, 0.0F);
    Arrays.fill(this.mLastMotionX, 0.0F);
    Arrays.fill(this.mLastMotionY, 0.0F);
  }
  
  private int computeAxisDuration(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 == 0) {
      return 0;
    }
    int i = this.mSwipeBackLayout.getWidth();
    int j = i / 2;
    float f1 = (float)Math.sin((float)((Math.min(1.0F, Math.abs(paramInt1) / i) - 0.5F) * 0.4712389167638204D));
    float f2 = j;
    float f3 = j;
    paramInt2 = Math.abs(paramInt2);
    if (paramInt2 > 0) {}
    for (paramInt1 = Math.round(Math.abs((f1 * f3 + f2) / paramInt2) * 1000.0F) * 4;; paramInt1 = (int)((Math.abs(paramInt1) / paramInt3 + 1.0F) * 256.0F)) {
      return Math.min(paramInt1, 600);
    }
  }
  
  private int computeSettleDuration(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt3 = clampMag(paramInt3, (int)this.mMinVelocity, (int)this.mMaxVelocity);
    paramInt4 = clampMag(paramInt4, (int)this.mMinVelocity, (int)this.mMaxVelocity);
    int i = Math.abs(paramInt1);
    int j = Math.abs(paramInt2);
    int k = Math.abs(paramInt3);
    int m = Math.abs(paramInt4);
    int n = k + m;
    int i1 = i + j;
    float f1;
    if (paramInt3 != 0)
    {
      f1 = k / n;
      if (paramInt4 == 0) {
        break label151;
      }
    }
    label151:
    for (float f2 = m / n;; f2 = j / i1)
    {
      paramInt1 = computeAxisDuration(paramInt1, paramInt3, 3);
      paramInt2 = computeAxisDuration(paramInt2, paramInt4, 0);
      float f3 = paramInt1;
      return (int)(f2 * paramInt2 + f1 * f3);
      f1 = i / i1;
      break;
    }
  }
  
  public static ViewDragHelper create(SwipeBackLayout paramSwipeBackLayout)
  {
    return new ViewDragHelper(paramSwipeBackLayout.getContext(), paramSwipeBackLayout);
  }
  
  private void dragTo(int paramInt1, int paramInt2)
  {
    int j;
    int i;
    if (paramInt2 != 0)
    {
      if (this.mTrackEdge == ViewDragHelper.TrackEdge.EDGE_NONE)
      {
        if (paramInt1 != 0) {
          break label205;
        }
        this.mTrackEdge = ViewDragHelper.TrackEdge.EDGE_LEFT;
      }
      if (this.mTrackEdge != ViewDragHelper.TrackEdge.EDGE_LEFT) {
        break label215;
      }
      j = this.mCapturedView.getLeft();
      i = Math.min(this.mCapturedView.getWidth(), Math.max(paramInt1 + paramInt2, 0));
      this.mCapturedView.offsetLeftAndRight(i - j);
      this.mScrollPercent = Math.abs(i / this.mCapturedView.getWidth());
      this.mSwipeBackLayout.mContentLeft = i;
      label99:
      if (this.mScrollPercent >= 1.0F)
      {
        Log.i("zyw", ">>>>onBackPressed");
        if (this.mTrackEdge != ViewDragHelper.TrackEdge.EDGE_LEFT) {
          break label290;
        }
      }
    }
    for (;;)
    {
      this.mSwipeBackLayout.invalidate();
      Log.i("zyw", "dragTo currentLeft=" + paramInt1 + ",targetX=" + i + ",dx=" + paramInt2 + ",mScrollPercent=" + this.mScrollPercent + ",mTrackEdge=" + this.mTrackEdge);
      return;
      label205:
      this.mTrackEdge = ViewDragHelper.TrackEdge.EDGE_RIGHT;
      break;
      label215:
      j = this.mCapturedView.getLeft();
      i = Math.min(this.mCapturedView.getWidth(), Math.max(paramInt1 + paramInt2, 0));
      this.mCapturedView.offsetLeftAndRight(i - j);
      this.mScrollPercent = Math.abs((this.mCapturedView.getWidth() - i) / this.mCapturedView.getWidth());
      this.mSwipeBackLayout.mContentLeft = i;
      break label99;
      label290:
      if (this.mTrackEdge != ViewDragHelper.TrackEdge.EDGE_RIGHT) {}
    }
  }
  
  private void ensureMotionHistorySizeForId(int paramInt)
  {
    if ((this.mInitialMotionX == null) || (this.mInitialMotionX.length <= paramInt))
    {
      float[] arrayOfFloat1 = new float[paramInt + 1];
      float[] arrayOfFloat2 = new float[paramInt + 1];
      float[] arrayOfFloat3 = new float[paramInt + 1];
      float[] arrayOfFloat4 = new float[paramInt + 1];
      int[] arrayOfInt = new int[paramInt + 1];
      if (this.mInitialMotionX != null)
      {
        System.arraycopy(this.mInitialMotionX, 0, arrayOfFloat1, 0, this.mInitialMotionX.length);
        System.arraycopy(this.mInitialMotionY, 0, arrayOfFloat2, 0, this.mInitialMotionY.length);
        System.arraycopy(this.mLastMotionX, 0, arrayOfFloat3, 0, this.mLastMotionX.length);
        System.arraycopy(this.mLastMotionY, 0, arrayOfFloat4, 0, this.mLastMotionY.length);
      }
      this.mInitialMotionX = arrayOfFloat1;
      this.mInitialMotionY = arrayOfFloat2;
      this.mLastMotionX = arrayOfFloat3;
      this.mLastMotionY = arrayOfFloat4;
    }
  }
  
  private void setStateSettling()
  {
    if (this.mCapturedView == null) {
      return;
    }
    int j = this.mCapturedView.getWidth();
    int k = (int)this.mVelocityTracker.getXVelocity(this.mActivePointerId);
    int m = (int)this.mVelocityTracker.getYVelocity(this.mActivePointerId);
    int i;
    if (this.mTrackEdge == ViewDragHelper.TrackEdge.EDGE_LEFT)
    {
      i = j;
      if (this.mScrollPercent <= this.mScrollThreshold)
      {
        if ((k <= 0) || (k <= this.mMinVelocity)) {
          break label239;
        }
        i = j;
      }
    }
    for (;;)
    {
      label83:
      Log.i("zyw", "setStateSettling left=" + i + ",top=" + 0 + ",mScrollPercent=" + this.mScrollPercent + ",mTrackEdge=" + this.mTrackEdge + ",xvel=" + k + ",mMinVelocity=" + this.mMinVelocity + ",mMaxVelocity=" + this.mMaxVelocity);
      j = this.mCapturedView.getLeft();
      int n = this.mCapturedView.getTop();
      i -= j;
      if (i == 0)
      {
        this.mScroller.abortAnimation();
        setDragState(0);
      }
      for (;;)
      {
        this.mSwipeBackLayout.invalidate();
        if (this.mDragState != 1) {
          break;
        }
        setDragState(0);
        return;
        label239:
        i = 0;
        break label83;
        if (this.mTrackEdge != ViewDragHelper.TrackEdge.EDGE_RIGHT) {
          break label327;
        }
        if (this.mScrollPercent <= this.mScrollThreshold)
        {
          i = j;
          if (k >= 0) {
            break label83;
          }
          i = j;
          if (Math.abs(k) <= this.mMinVelocity) {
            break label83;
          }
        }
        i = 0;
        break label83;
        k = computeSettleDuration(this.mCapturedView, i, 0, k, m);
        this.mScroller.startScroll(j, n, i, 0, k);
        setDragState(2);
      }
      label327:
      i = 0;
    }
  }
  
  public void abort()
  {
    cancel();
    if (this.mDragState == 2)
    {
      this.mScroller.getCurrX();
      this.mScroller.abortAnimation();
      this.mScroller.getCurrX();
    }
    setDragState(0);
  }
  
  public void cancel()
  {
    this.mActivePointerId = -1;
    clearMotionHistory();
    if (this.mVelocityTracker != null)
    {
      this.mVelocityTracker.recycle();
      this.mVelocityTracker = null;
    }
  }
  
  public boolean continueSettling(boolean paramBoolean)
  {
    boolean bool2 = false;
    if (this.mDragState == 2)
    {
      boolean bool3 = this.mScroller.computeScrollOffset();
      int i = this.mScroller.getCurrX();
      int j = this.mCapturedView.getLeft();
      int k = i - j;
      if (k != 0)
      {
        this.mCapturedView.offsetLeftAndRight(k);
        this.mScrollPercent = Math.abs(i / this.mCapturedView.getWidth());
        this.mSwipeBackLayout.mContentLeft = i;
        if (this.mScrollPercent >= 1.0F)
        {
          Log.i("zyw", ">>>>onBackPressed");
          if (this.mTrackEdge != ViewDragHelper.TrackEdge.EDGE_LEFT) {
            break label264;
          }
        }
        this.mSwipeBackLayout.invalidate();
      }
      Log.i("zyw", "continueSettling currentLeft=" + j + ",targetX=" + i + ",dx=" + k + ",mScrollPercent=" + this.mScrollPercent + ",mTrackEdge=" + this.mTrackEdge);
      boolean bool1 = bool3;
      if (bool3)
      {
        bool1 = bool3;
        if (i == this.mScroller.getFinalX())
        {
          this.mScroller.abortAnimation();
          bool1 = this.mScroller.isFinished();
        }
      }
      if (!bool1)
      {
        if (!paramBoolean) {
          break label277;
        }
        this.mSwipeBackLayout.post(this.mSetIdleRunnable);
      }
    }
    for (;;)
    {
      paramBoolean = bool2;
      if (this.mDragState == 2) {
        paramBoolean = true;
      }
      return paramBoolean;
      label264:
      if (this.mTrackEdge != ViewDragHelper.TrackEdge.EDGE_RIGHT) {
        break;
      }
      break;
      label277:
      setDragState(0);
    }
  }
  
  public int getViewDragState()
  {
    return this.mDragState;
  }
  
  public void onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = 0;
    int j = paramMotionEvent.getActionMasked();
    if (j == 0) {
      cancel();
    }
    if (this.mVelocityTracker == null) {
      this.mVelocityTracker = VelocityTracker.obtain();
    }
    this.mVelocityTracker.addMovement(paramMotionEvent);
    switch (j)
    {
    default: 
    case 0: 
    case 2: 
      float f1;
      float f2;
      do
      {
        return;
        f1 = paramMotionEvent.getX();
        f2 = paramMotionEvent.getY();
        i = paramMotionEvent.getPointerId(0);
        ensureMotionHistorySizeForId(i);
        paramMotionEvent = this.mInitialMotionX;
        this.mLastMotionX[i] = f1;
        paramMotionEvent[i] = f1;
        paramMotionEvent = this.mInitialMotionY;
        this.mLastMotionY[i] = f2;
        paramMotionEvent[i] = f2;
        return;
      } while ((this.mLastMotionX == null) || (this.mLastMotionX.length <= 0));
      if (this.mDragState == 1)
      {
        j = paramMotionEvent.findPointerIndex(this.mActivePointerId);
        if ((j >= 0) && (j < paramMotionEvent.getPointerCount()))
        {
          j = (int)(paramMotionEvent.getX(j) - this.mLastMotionX[this.mActivePointerId]);
          dragTo(this.mCapturedView.getLeft(), j);
        }
      }
      for (;;)
      {
        j = paramMotionEvent.getPointerCount();
        int k;
        while (i < j)
        {
          k = paramMotionEvent.getPointerId(i);
          f1 = paramMotionEvent.getX(i);
          f2 = paramMotionEvent.getY(i);
          this.mLastMotionX[k] = f1;
          this.mLastMotionY[k] = f2;
          i += 1;
        }
        if (this.mDragState == 0)
        {
          j = paramMotionEvent.getPointerId(0);
          k = paramMotionEvent.findPointerIndex(j);
          if ((k >= 0) && (k < paramMotionEvent.getPointerCount()))
          {
            f1 = paramMotionEvent.getX(k);
            f2 = paramMotionEvent.getY(k);
            this.mActivePointerId = j;
            k = (int)(f1 - this.mInitialMotionX[this.mActivePointerId]);
            int m = (int)(f2 - this.mInitialMotionY[this.mActivePointerId]);
            if ((Math.abs(k) > this.mTouchSlop) && (Math.abs(m) < this.mTouchSlop) && (this.mSwipeBackLayout != null) && (this.mSwipeBackLayout.mContentView != null)) {
              setStateDragging(this.mSwipeBackLayout.mContentView, j);
            }
          }
        }
      }
    }
    if (this.mDragState == 1)
    {
      if (this.mVelocityTracker != null) {
        this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxVelocity);
      }
      setStateSettling();
    }
    for (;;)
    {
      cancel();
      return;
      if (this.mDragState == 0) {
        this.mActivityHandler.sendEmptyMessage(289);
      }
    }
  }
  
  public void setActivityHandler(Handler paramHandler)
  {
    this.mActivityHandler = paramHandler;
  }
  
  void setDragState(int paramInt)
  {
    if (this.mDragState != paramInt)
    {
      this.mDragState = paramInt;
      if (paramInt == 0)
      {
        this.mCapturedView = null;
        this.mTrackEdge = ViewDragHelper.TrackEdge.EDGE_NONE;
      }
    }
  }
  
  public void setMinVelocity(float paramFloat)
  {
    this.mMinVelocity = paramFloat;
  }
  
  boolean setStateDragging(View paramView, int paramInt)
  {
    if ((paramView == this.mCapturedView) && (this.mActivePointerId == paramInt)) {
      return true;
    }
    if (paramView != null)
    {
      this.mActivePointerId = paramInt;
      this.mCapturedView = paramView;
      setDragState(1);
      return true;
    }
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\ViewDragHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */