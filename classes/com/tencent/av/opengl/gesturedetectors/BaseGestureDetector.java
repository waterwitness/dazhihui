package com.tencent.av.opengl.gesturedetectors;

import android.content.Context;
import android.view.MotionEvent;

public abstract class BaseGestureDetector
{
  protected static final float PRESSURE_THRESHOLD = 0.67F;
  protected final Context mContext;
  protected MotionEvent mCurrEvent;
  protected float mCurrPressure;
  protected boolean mGestureInProgress;
  protected MotionEvent mPrevEvent;
  protected float mPrevPressure;
  protected long mTimeDelta;
  
  public BaseGestureDetector(Context paramContext)
  {
    this.mContext = paramContext;
  }
  
  public long getEventTime()
  {
    return this.mCurrEvent.getEventTime();
  }
  
  public long getTimeDelta()
  {
    return this.mTimeDelta;
  }
  
  protected abstract void handleInProgressEvent(int paramInt, MotionEvent paramMotionEvent);
  
  protected abstract void handleStartProgressEvent(int paramInt, MotionEvent paramMotionEvent);
  
  public boolean isInProgress()
  {
    return this.mGestureInProgress;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction() & 0xFF;
    if (!this.mGestureInProgress) {
      handleStartProgressEvent(i, paramMotionEvent);
    }
    for (;;)
    {
      return true;
      handleInProgressEvent(i, paramMotionEvent);
    }
  }
  
  protected void resetState()
  {
    if (this.mPrevEvent != null)
    {
      this.mPrevEvent.recycle();
      this.mPrevEvent = null;
    }
    if (this.mCurrEvent != null)
    {
      this.mCurrEvent.recycle();
      this.mCurrEvent = null;
    }
    this.mGestureInProgress = false;
  }
  
  protected void updateStateByEvent(MotionEvent paramMotionEvent)
  {
    MotionEvent localMotionEvent = this.mPrevEvent;
    if (this.mCurrEvent != null)
    {
      this.mCurrEvent.recycle();
      this.mCurrEvent = null;
    }
    this.mCurrEvent = MotionEvent.obtain(paramMotionEvent);
    this.mTimeDelta = (paramMotionEvent.getEventTime() - localMotionEvent.getEventTime());
    this.mCurrPressure = paramMotionEvent.getPressure(paramMotionEvent.getActionIndex());
    this.mPrevPressure = localMotionEvent.getPressure(localMotionEvent.getActionIndex());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\opengl\gesturedetectors\BaseGestureDetector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */