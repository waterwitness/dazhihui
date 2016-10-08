package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public class CustomImgview
  extends ImageView
{
  public boolean a = false;
  
  public CustomImgview(Context paramContext)
  {
    super(paramContext);
  }
  
  public CustomImgview(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public CustomImgview(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public boolean a()
  {
    return this.a;
  }
  
  public void setChecked(boolean paramBoolean)
  {
    this.a = paramBoolean;
    if (paramBoolean)
    {
      setImageResource(2130838594);
      return;
    }
    setImageResource(2130838593);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\CustomImgview.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */