package com.android.dazhihui.ui.delegate.newtrade;

import android.content.res.Resources;
import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout.LayoutParams;
import com.android.dazhihui.ui.delegate.newtrade.widge.UpdateHeaderView;

class e
  extends TranslateAnimation
{
  public e(d paramd, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    super(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
  }
  
  protected void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    paramTransformation = (LinearLayout.LayoutParams)d.a(this.a).getLayoutParams();
    paramTransformation.setMargins(0, -(int)(this.a.getResources().getDimensionPixelOffset(2131230749) * paramFloat), 0, 0);
    d.a(this.a).setLayoutParams(paramTransformation);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\newtrade\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */