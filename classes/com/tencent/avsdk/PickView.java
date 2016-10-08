package com.tencent.avsdk;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Paint.Style;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

public class PickView
  extends View
{
  public static final float MARGIN_ALPHA = 2.8F;
  public static final float SPEED = 2.0F;
  public static final String TAG = "PickView";
  private boolean isInit = false;
  private int mColorText = 3355443;
  private int mCurrentSelected;
  private List<String> mDataList;
  private float mLastDownY;
  private float mMaxTextAlpha = 255.0F;
  private float mMaxTextSize = 80.0F;
  private float mMinTextAlpha = 120.0F;
  private float mMinTextSize = 40.0F;
  private float mMoveLen = 0.0F;
  private Paint mPaint;
  private PickView.onSelectListener mSelectListener;
  private PickView.MyTimerTask mTask;
  private int mViewHeight;
  private int mViewWidth;
  private Timer timer;
  Handler updateHandler = new PickView.1(this);
  
  public PickView(Context paramContext)
  {
    super(paramContext);
    init();
  }
  
  public PickView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  private void doDown(MotionEvent paramMotionEvent)
  {
    if (this.mTask != null)
    {
      this.mTask.cancel();
      this.mTask = null;
    }
    this.mLastDownY = paramMotionEvent.getY();
  }
  
  private void doMove(MotionEvent paramMotionEvent)
  {
    this.mMoveLen += paramMotionEvent.getY() - this.mLastDownY;
    if (this.mMoveLen > this.mMinTextSize * 2.8F / 2.0F)
    {
      moveTailToHead();
      this.mMoveLen -= this.mMinTextSize * 2.8F;
    }
    for (;;)
    {
      this.mLastDownY = paramMotionEvent.getY();
      invalidate();
      return;
      if (this.mMoveLen < -2.8F * this.mMinTextSize / 2.0F)
      {
        moveHeadToTail();
        this.mMoveLen += this.mMinTextSize * 2.8F;
      }
    }
  }
  
  private void doUp(MotionEvent paramMotionEvent)
  {
    if (Math.abs(this.mMoveLen) < 1.0E-4D)
    {
      this.mMoveLen = 0.0F;
      return;
    }
    if (this.mTask != null)
    {
      this.mTask.cancel();
      this.mTask = null;
    }
    this.mTask = new PickView.MyTimerTask(this, this.updateHandler);
    this.timer.schedule(this.mTask, 0L, 10L);
  }
  
  private void drawData(Canvas paramCanvas)
  {
    float f1 = parabola(this.mViewHeight / 4.0F, this.mMoveLen);
    float f2 = this.mMaxTextSize;
    f2 = this.mMinTextSize;
    f2 = this.mMinTextSize;
    this.mPaint.setTextSize(80.0F);
    this.mPaint.setAlpha((int)(f1 * (this.mMaxTextAlpha - this.mMinTextAlpha) + this.mMinTextAlpha));
    f1 = (float)(this.mViewWidth / 2.0D);
    f2 = (float)(this.mViewHeight / 2.0D + this.mMoveLen);
    Paint.FontMetricsInt localFontMetricsInt = this.mPaint.getFontMetricsInt();
    f2 = (float)(f2 - (localFontMetricsInt.bottom / 2.0D + localFontMetricsInt.top / 2.0D));
    paramCanvas.drawText((String)this.mDataList.get(this.mCurrentSelected), f1, f2, this.mPaint);
    int i = 1;
    while (this.mCurrentSelected - i >= 0)
    {
      drawOtherText(paramCanvas, i, -1);
      i += 1;
    }
    i = 1;
    while (this.mCurrentSelected + i < this.mDataList.size())
    {
      drawOtherText(paramCanvas, i, 1);
      i += 1;
    }
  }
  
  private void drawOtherText(Canvas paramCanvas, int paramInt1, int paramInt2)
  {
    float f1 = 2.8F * this.mMinTextSize * paramInt1 + paramInt2 * this.mMoveLen;
    float f2 = parabola(this.mViewHeight / 4.0F, f1);
    float f3 = this.mMaxTextSize;
    float f4 = this.mMinTextSize;
    float f5 = this.mMinTextSize;
    this.mPaint.setTextSize((f3 - f4) * f2 + f5);
    this.mPaint.setAlpha((int)(f2 * (this.mMaxTextAlpha - this.mMinTextAlpha) + this.mMinTextAlpha));
    double d1 = this.mViewHeight / 2.0D;
    f1 = (float)(f1 * paramInt2 + d1);
    Paint.FontMetricsInt localFontMetricsInt = this.mPaint.getFontMetricsInt();
    d1 = f1;
    double d2 = localFontMetricsInt.bottom / 2.0D;
    f1 = (float)(d1 - (localFontMetricsInt.top / 2.0D + d2));
    paramCanvas.drawText((String)this.mDataList.get(this.mCurrentSelected + paramInt2 * paramInt1), (float)(this.mViewWidth / 2.0D), f1, this.mPaint);
  }
  
  private void init()
  {
    this.timer = new Timer();
    this.mDataList = new ArrayList();
    this.mPaint = new Paint(1);
    this.mPaint.setStyle(Paint.Style.FILL);
    this.mPaint.setTextAlign(Paint.Align.CENTER);
    this.mPaint.setColor(this.mColorText);
  }
  
  private void moveHeadToTail()
  {
    String str = (String)this.mDataList.get(0);
    this.mDataList.remove(0);
    this.mDataList.add(str);
  }
  
  private void moveTailToHead()
  {
    String str = (String)this.mDataList.get(this.mDataList.size() - 1);
    this.mDataList.remove(this.mDataList.size() - 1);
    this.mDataList.add(0, str);
  }
  
  private float parabola(float paramFloat1, float paramFloat2)
  {
    paramFloat1 = (float)(1.0D - Math.pow(paramFloat2 / paramFloat1, 2.0D));
    if (paramFloat1 < 0.0F) {
      return 0.0F;
    }
    return paramFloat1;
  }
  
  private void performSelect()
  {
    if (this.mSelectListener != null) {
      this.mSelectListener.onSelect((String)this.mDataList.get(this.mCurrentSelected));
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (this.isInit) {
      drawData(paramCanvas);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    this.mViewHeight = getMeasuredHeight();
    this.mViewWidth = getMeasuredWidth();
    this.mMaxTextSize = (this.mViewHeight / 3.0F);
    this.mMinTextSize = (this.mMaxTextSize / 3.0F);
    this.isInit = true;
    invalidate();
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getActionMasked())
    {
    }
    for (;;)
    {
      return true;
      doDown(paramMotionEvent);
      continue;
      doMove(paramMotionEvent);
      continue;
      doUp(paramMotionEvent);
    }
  }
  
  public void setData(List<String> paramList, int paramInt)
  {
    this.mDataList = paramList;
    if (paramList.size() == 2)
    {
      this.mCurrentSelected = paramInt;
      invalidate();
      return;
    }
    this.mCurrentSelected = (paramList.size() / 2);
    if (paramInt != -1)
    {
      if (paramInt >= 2) {
        break label65;
      }
      moveTailToHead();
      moveTailToHead();
      this.mCurrentSelected = 2;
    }
    for (;;)
    {
      invalidate();
      return;
      label65:
      if (paramInt > paramList.size() - 3)
      {
        moveHeadToTail();
        moveHeadToTail();
        this.mCurrentSelected = (paramList.size() - 3);
      }
      else
      {
        this.mCurrentSelected = paramInt;
      }
    }
  }
  
  public void setOnSelectListener(PickView.onSelectListener paramonSelectListener)
  {
    this.mSelectListener = paramonSelectListener;
  }
  
  public void setSelected(int paramInt)
  {
    this.mCurrentSelected = paramInt;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\PickView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */