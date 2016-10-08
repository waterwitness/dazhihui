package com.android.dazhihui.ui.widget;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;

public class kx
  extends Fragment
{
  private int a;
  
  public kx() {}
  
  public kx(int paramInt, SlideableFrame paramSlideableFrame)
  {
    this.a = paramInt;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(2130903126, paramViewGroup, false);
    paramViewGroup = paramLayoutInflater.findViewById(2131558467);
    paramBundle = (FrameLayout.LayoutParams)paramViewGroup.getLayoutParams();
    if (this.a > 0)
    {
      paramBundle.gravity = 3;
      paramViewGroup.setBackgroundResource(2130837964);
      return paramLayoutInflater;
    }
    paramBundle.gravity = 5;
    paramViewGroup.setBackgroundResource(2130837963);
    return paramLayoutInflater;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\kx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */