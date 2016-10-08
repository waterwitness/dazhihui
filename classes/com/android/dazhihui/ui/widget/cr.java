package com.android.dazhihui.ui.widget;

import android.content.res.Resources;
import android.graphics.Rect;
import android.util.TypedValue;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;

class cr
{
  LinearLayout a;
  ImageView b;
  ListView c;
  Rect d = new Rect();
  int e;
  
  public cr(DzhHeader paramDzhHeader)
  {
    this.e = ((int)TypedValue.applyDimension(1, 3.0F, paramDzhHeader.getResources().getDisplayMetrics()));
  }
  
  void a()
  {
    this.a.setGravity(1);
    ((LinearLayout.LayoutParams)this.b.getLayoutParams()).rightMargin = 0;
    this.a.requestLayout();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\cr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */