package com.tencent.avsdk.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class SwipeBackLayout
  extends FrameLayout
{
  private static final int MIN_FLING_VELOCITY = 400;
  private boolean DEBUG = true;
  private String TAG = "zyw";
  private Handler mActivityHandler;
  private int mBottomExclude;
  private boolean mCancelChild = false;
  public int mContentLeft;
  public View mContentView;
  private ViewDragHelper mDragHelper = ViewDragHelper.create(this);
  private boolean mEnable = false;
  private boolean mInLayout;
  private float mScrollPercent;
  private int mTopExclude;
  
  public SwipeBackLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SwipeBackLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
  }
  
  public SwipeBackLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    float f = getResources().getDisplayMetrics().density;
    this.mDragHelper.setMinVelocity(f * 400.0F);
    this.mTopExclude = paramContext.getResources().getDimensionPixelSize(2131230838);
    this.mBottomExclude = paramContext.getResources().getDimensionPixelSize(2131230838);
  }
  
  private View getFocusChild(View paramView, int paramInt1, int paramInt2)
  {
    int i = 0;
    Rect localRect = new Rect();
    Object localObject = new int[2];
    paramView.getLocationOnScreen((int[])localObject);
    int j = localObject[0];
    int k = localObject[1];
    int m = ((ViewGroup)paramView).getChildCount();
    while (i < m)
    {
      localObject = ((ViewGroup)paramView).getChildAt(i);
      ((View)localObject).getHitRect(localRect);
      if (localRect.contains(paramInt1 - j, paramInt2 - k)) {
        return (View)localObject;
      }
      i += 1;
    }
    return null;
  }
  
  private boolean isContainView(View paramView, int paramInt1, int paramInt2)
  {
    Rect localRect = new Rect();
    int[] arrayOfInt = new int[2];
    paramView.getLocationOnScreen(arrayOfInt);
    int i = arrayOfInt[0];
    int j = arrayOfInt[1];
    paramView.getHitRect(localRect);
    return localRect.contains(paramInt1 - i, paramInt2 - j);
  }
  
  public void computeScroll()
  {
    if (this.mDragHelper.continueSettling(true)) {
      postInvalidate();
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!this.mEnable) {}
    float f;
    do
    {
      return false;
      if ((this.mContentLeft != 0) || (this.mContentView == null)) {
        break;
      }
      paramMotionEvent.getRawX();
      paramMotionEvent.getRawY();
      paramMotionEvent.getX();
      f = paramMotionEvent.getY();
    } while ((f < this.mTopExclude) || (getMeasuredHeight() - f < this.mBottomExclude));
    return true;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.mInLayout = true;
    if (this.mContentView != null)
    {
      this.mContentView.layout(this.mContentLeft, 0, this.mContentLeft + this.mContentView.getMeasuredWidth(), this.mContentView.getMeasuredHeight());
      Log.i(this.TAG, "onLayout getLeft=" + this.mContentView.getLeft());
    }
    this.mInLayout = false;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!this.mEnable) {
      return false;
    }
    try
    {
      this.mDragHelper.onTouchEvent(paramMotionEvent);
      if (this.mContentLeft == 0)
      {
        if (this.mContentView != null)
        {
          this.mContentView.dispatchTouchEvent(paramMotionEvent);
          this.mCancelChild = true;
        }
      }
      else if ((this.mCancelChild) && (this.mContentView != null))
      {
        this.mCancelChild = false;
        MotionEvent localMotionEvent = MotionEvent.obtain(paramMotionEvent);
        localMotionEvent.setAction(paramMotionEvent.getActionIndex() << 8 | 0x3);
        this.mContentView.onTouchEvent(localMotionEvent);
        localMotionEvent.recycle();
      }
    }
    catch (ArrayIndexOutOfBoundsException paramMotionEvent)
    {
      return false;
    }
    return true;
  }
  
  public void requestLayout()
  {
    if (!this.mInLayout) {
      super.requestLayout();
    }
  }
  
  public void setActivityHandler(Handler paramHandler)
  {
    this.mActivityHandler = paramHandler;
    this.mDragHelper.setActivityHandler(paramHandler);
  }
  
  public void setContentView(View paramView)
  {
    this.mContentView = paramView;
  }
  
  public void setEnableGesture(boolean paramBoolean)
  {
    this.mEnable = paramBoolean;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\SwipeBackLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */