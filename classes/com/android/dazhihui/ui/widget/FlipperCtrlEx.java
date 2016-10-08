package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Gallery;

public class FlipperCtrlEx
  extends Gallery
{
  private String[] a;
  private String b;
  
  public FlipperCtrlEx(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setPadding(0, 3, 0, 3);
    setSpacing(0);
    setBackgroundResource(2130837581);
  }
  
  public void setSelection(int paramInt)
  {
    super.setSelection(paramInt);
    this.b = this.a[paramInt];
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\FlipperCtrlEx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */