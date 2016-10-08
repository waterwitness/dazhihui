package com.android.thinkive.framework.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.TextView;
import com.android.thinkive.framework.util.ScreenUtil;

public class RoundedCornerTextView
  extends TextView
{
  private int mCornerRadius = 0;
  private GradientDrawable mRoundedCornerBG = new GradientDrawable();
  
  public RoundedCornerTextView(Context paramContext)
  {
    super(paramContext);
  }
  
  public RoundedCornerTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public RoundedCornerTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    int j = getPaddingBottom();
    int m = getPaddingRight();
    int k = getPaddingLeft();
    int n = getPaddingTop();
    int i = j;
    if (j < this.mCornerRadius) {
      i = this.mCornerRadius;
    }
    j = k;
    if (k < this.mCornerRadius) {
      j = this.mCornerRadius;
    }
    k = m;
    if (m < this.mCornerRadius) {
      k = this.mCornerRadius;
    }
    m = n;
    if (n < this.mCornerRadius) {
      m = this.mCornerRadius;
    }
    setPadding(j, m, k, i);
    if (this.mCornerRadius > 0) {
      setBackgroundColor(0);
    }
    this.mRoundedCornerBG.setBounds(0, 0, getWidth(), getHeight());
    this.mRoundedCornerBG.draw(paramCanvas);
    super.onDraw(paramCanvas);
  }
  
  public void setCornerRadius(int paramInt)
  {
    this.mCornerRadius = ((int)ScreenUtil.dpToPx(getContext(), paramInt));
    this.mRoundedCornerBG.setCornerRadius(this.mCornerRadius);
  }
  
  public void setRoundedCornerBgAlpha(int paramInt)
  {
    this.mRoundedCornerBG.setAlpha(paramInt);
  }
  
  public void setRoundedCornerBgColor(int paramInt)
  {
    this.mRoundedCornerBG.setColor(paramInt);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\view\RoundedCornerTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */