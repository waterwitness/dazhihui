package com.android.dazhihui.ui.widget;

import java.util.ArrayList;
import java.util.Random;

class mo
{
  ArrayList<mn> a = new ArrayList();
  
  public mo(ThumbUpAnimationView paramThumbUpAnimationView) {}
  
  public void a(int paramInt, double paramDouble, boolean paramBoolean)
  {
    int i = 0;
    if (i < paramInt)
    {
      int m = this.b.h;
      double d1 = this.b.i;
      double d2 = this.b.j;
      double d3 = Math.random();
      double d4 = this.b.k;
      double d5 = this.b.l;
      double d6 = Math.random();
      float f1 = this.b.f - ThumbUpAnimationView.b(this.b) * 2;
      float f2 = -m;
      int k = new Random().nextInt(ThumbUpAnimationView.c(this.b).length);
      int j = k;
      if (paramBoolean)
      {
        if (ThumbUpAnimationView.d(this.b) != -1) {
          break label205;
        }
        ThumbUpAnimationView.a(this.b, k);
      }
      label205:
      for (j = k;; j = ThumbUpAnimationView.d(this.b))
      {
        mn localmn = new mn(this.b, m, d1 + d2 * d3, d4 + d5 * d6, f1, f2, paramDouble, j);
        this.a.add(localmn);
        i += 1;
        break;
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\mo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */