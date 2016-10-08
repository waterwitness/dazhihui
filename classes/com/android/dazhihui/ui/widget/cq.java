package com.android.dazhihui.ui.widget;

import android.content.res.Resources;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

class cq
{
  LinearLayout a;
  ImageView b;
  GridView c;
  Rect d = new Rect();
  int e;
  
  public cq(DzhHeader paramDzhHeader)
  {
    this.e = ((int)TypedValue.applyDimension(1, 3.0F, paramDzhHeader.getResources().getDisplayMetrics()));
  }
  
  void a(View paramView, int paramInt)
  {
    this.a.setGravity(5);
    paramView.getHitRect(this.d);
    if (this.b.getMeasuredWidth() == 0) {
      DzhHeader.a(this.f, this.b, Integer.MAX_VALUE, Integer.MAX_VALUE);
    }
    int[] arrayOfInt = new int[2];
    paramView.getLocationOnScreen(arrayOfInt);
    int i = arrayOfInt[0];
    int j = paramView.getMeasuredWidth() / 2;
    int k = this.b.getMeasuredWidth() / 2;
    ((LinearLayout.LayoutParams)this.b.getLayoutParams()).rightMargin = (paramInt - (i + j + k));
    this.a.requestLayout();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\cq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */