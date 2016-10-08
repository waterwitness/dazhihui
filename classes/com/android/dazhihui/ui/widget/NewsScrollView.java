package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

public class NewsScrollView
  extends ScrollView
{
  private jf a;
  
  public NewsScrollView(Context paramContext)
  {
    super(paramContext);
    a();
  }
  
  public NewsScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
  }
  
  public NewsScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a();
  }
  
  private void a() {}
  
  protected void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.a != null) {
      this.a.a(paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public void setOnScrollChangedListener(jf paramjf)
  {
    this.a = paramjf;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\NewsScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */