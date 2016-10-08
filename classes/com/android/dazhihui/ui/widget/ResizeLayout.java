package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

public class ResizeLayout
  extends RelativeLayout
{
  private kh a;
  
  public ResizeLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.a != null) {
      this.a.a(paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public void setOnResizeListener(kh paramkh)
  {
    this.a = paramkh;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\ResizeLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */