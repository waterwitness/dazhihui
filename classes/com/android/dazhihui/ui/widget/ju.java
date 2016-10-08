package com.android.dazhihui.ui.widget;

import java.util.ArrayList;

class ju
{
  ArrayList<js> a = new ArrayList();
  
  public ju(ParticleView paramParticleView) {}
  
  public void a(int paramInt, double paramDouble)
  {
    int i = 0;
    while (i < paramInt)
    {
      int j = this.b.j + (int)(this.b.k * Math.random());
      double d1 = this.b.l;
      double d2 = this.b.m;
      double d3 = Math.random();
      double d4 = this.b.n;
      double d5 = this.b.o;
      double d6 = Math.random();
      float f1 = (float)(this.b.f * Math.random());
      float f2 = -j;
      js localjs = new js(this.b, j, d1 + d2 * d3, d4 + d5 * d6, f1, f2, paramDouble);
      this.a.add(localjs);
      i += 1;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\ju.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */