package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

public class MyLinearLayout
  extends LinearLayout
  implements ks
{
  private Context a;
  private LayoutInflater b;
  private ks c;
  
  public MyLinearLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public MyLinearLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.a = paramContext;
    this.b = LayoutInflater.from(paramContext);
  }
  
  public boolean c()
  {
    if (this.c != null) {
      return this.c.c();
    }
    return false;
  }
  
  public boolean d()
  {
    if (this.c != null) {
      return this.c.d();
    }
    return false;
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
  }
  
  public void setOnScrollPeakListener(ks paramks)
  {
    this.c = paramks;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\MyLinearLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */