package com.android.thinkive.framework.keyboard;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.android.thinkive.framework.util.ScreenUtil;

public final class KeyInputPreviewView
  extends View
{
  private int mLargeTextSize = 40;
  private int mSmallTextSize = 20;
  private String mText = "";
  private int mTextColor = -1;
  
  public KeyInputPreviewView(Context paramContext)
  {
    this(paramContext, null, 0);
  }
  
  public KeyInputPreviewView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public KeyInputPreviewView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    Rect localRect = new Rect();
    Paint localPaint = new Paint(1);
    localPaint.setColor(this.mTextColor);
    localPaint.setTextSize(ScreenUtil.spToPx(getContext(), this.mLargeTextSize));
    localPaint.getTextBounds(this.mText, 0, this.mText.length(), localRect);
    int i = (getWidth() - localRect.width()) / 2;
    int j = getHeight() * 6 / 11;
    int k = (getHeight() * 6 / 11 - localRect.height()) / 2;
    paramCanvas.drawText(this.mText, i, j - k, localPaint);
    localPaint.setTextSize(ScreenUtil.spToPx(getContext(), this.mSmallTextSize));
    localPaint.getTextBounds(this.mText, 0, this.mText.length(), localRect);
    i = (getWidth() - localRect.width()) / 2;
    j = getHeight();
    k = (getHeight() * 5 / 11 - localRect.height()) / 2;
    paramCanvas.drawText(this.mText, i, j - k, localPaint);
  }
  
  public void setLargeTextSize(int paramInt)
  {
    this.mLargeTextSize = paramInt;
  }
  
  public void setSmallTextSize(int paramInt)
  {
    this.mSmallTextSize = paramInt;
  }
  
  public void setText(String paramString)
  {
    this.mText = paramString;
  }
  
  public void setTextColor(int paramInt)
  {
    this.mTextColor = paramInt;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\keyboard\KeyInputPreviewView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */