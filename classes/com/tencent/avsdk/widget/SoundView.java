package com.tencent.avsdk.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.view.View;
import java.util.Random;

public class SoundView
  extends View
{
  private int mBgColor = 33058;
  private int mCount = 6;
  private int mGraphColor = -1;
  private int mHeight;
  private Paint mPaint = new Paint(1);
  private Random mRandom = new Random();
  private int mWidth;
  
  public SoundView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SoundView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 0);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if ((this.mWidth <= 0) || (this.mHeight <= 0)) {}
    do
    {
      return;
      this.mPaint.setColor(this.mBgColor);
      this.mPaint.setStyle(Paint.Style.FILL);
      this.mPaint.setStrokeWidth(0.0F);
      paramCanvas.drawCircle(this.mWidth / 2, this.mHeight / 2, Math.min(this.mWidth / 2, this.mHeight / 2), this.mPaint);
      this.mPaint.setColor(this.mGraphColor);
      float f1 = this.mWidth;
      float f2 = this.mCount;
      f1 /= (0.5F * (this.mCount - 1) + f2 + 2.0F * 2.0F);
      f2 = f1 * 2.0F;
      float f3 = (this.mWidth - f1 * 2.0F - f1 - f2 - (this.mCount - 1) * f1) / (this.mCount - 1);
      int i = 0;
      while (i < this.mCount)
      {
        float f4 = i;
        f4 = i * f3 + (f4 * f1 + f2);
        float f5 = this.mHeight / 4 * 3;
        paramCanvas.drawRect(f4, f5 - this.mRandom.nextInt(this.mHeight / 2), f4 + f1, f5, this.mPaint);
        i += 1;
      }
    } while (getVisibility() != 0);
    postInvalidateDelayed(100L);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    this.mWidth = paramInt1;
    this.mHeight = paramInt2;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\SoundView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */