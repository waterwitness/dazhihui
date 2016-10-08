package com.android.thinkive.framework.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class BaseWebViewLinearlayout
  extends LinearLayout
{
  private BaseWebViewLinearlayout.OnSoftKeyboardListener onSoftKeyboardListener;
  
  public BaseWebViewLinearlayout(Context paramContext)
  {
    super(paramContext);
  }
  
  public BaseWebViewLinearlayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public BaseWebViewLinearlayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if ((this.onSoftKeyboardListener != null) && (paramInt4 != 0))
    {
      if (paramInt4 > paramInt2) {
        this.onSoftKeyboardListener.onShown();
      }
    }
    else {
      return;
    }
    this.onSoftKeyboardListener.onHidden();
  }
  
  public final void setOnSoftKeyboardListener(BaseWebViewLinearlayout.OnSoftKeyboardListener paramOnSoftKeyboardListener)
  {
    this.onSoftKeyboardListener = paramOnSoftKeyboardListener;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\view\BaseWebViewLinearlayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */