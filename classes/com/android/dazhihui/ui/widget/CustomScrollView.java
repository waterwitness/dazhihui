package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;

public class CustomScrollView
  extends ScrollView
{
  bf a;
  
  public CustomScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  protected boolean onRequestFocusInDescendants(int paramInt, Rect paramRect)
  {
    return false;
  }
  
  protected void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if ((getHeight() + paramInt2 == getChildAt(0).getHeight()) && (this.a != null)) {
      this.a.a();
    }
  }
  
  public void setBottomListener(bf parambf)
  {
    this.a = parambf;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\CustomScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */