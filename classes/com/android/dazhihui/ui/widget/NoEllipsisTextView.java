package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;

public class NoEllipsisTextView
  extends TextView
{
  public NoEllipsisTextView(Context paramContext)
  {
    super(paramContext, null, 2130772129);
  }
  
  public NoEllipsisTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private void a(String paramString, int paramInt)
  {
    if ((paramInt > 0) && (!TextUtils.isEmpty(paramString)))
    {
      int i = getPaddingLeft();
      int j = getPaddingRight();
      TextPaint localTextPaint = new TextPaint();
      localTextPaint.set(getPaint());
      localTextPaint.setTextSize(getTextSize());
      while (localTextPaint.measureText(paramString) > paramInt - i - j) {
        paramString = paramString.substring(0, paramString.length() - 1);
      }
      setText(paramString);
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramInt1 != paramInt3) {
      a(getText().toString(), paramInt1);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\NoEllipsisTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */