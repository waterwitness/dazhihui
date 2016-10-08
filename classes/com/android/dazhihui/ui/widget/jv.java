package com.android.dazhihui.ui.widget;

import java.util.ArrayList;

class jv
  extends Thread
{
  boolean a = true;
  ParticleView b;
  int c = 1;
  double d = 0.0D;
  double e = 0.005D;
  int f = 0;
  
  public jv(ParticleView paramParticleView1, ParticleView paramParticleView2)
  {
    this.b = paramParticleView2;
  }
  
  public void run()
  {
    while (this.a)
    {
      this.f += 1;
      if (this.f == 100)
      {
        this.f = 0;
        if (!ParticleView.a(this.g))
        {
          if (this.g.i < 10) {
            this.g.i = 10;
          }
          this.b.b.a(this.g.i / 10, this.d);
        }
      }
      ArrayList localArrayList = this.b.b.a;
      int j = localArrayList.size();
      int i = 0;
      while (i < j)
      {
        js localjs = (js)localArrayList.get(i);
        double d1 = this.d - localjs.h;
        float f1 = (float)(localjs.d + localjs.c * d1);
        float f2 = (float)(d1 * (2.0D * d1) + (localjs.e + localjs.b * d1));
        if (f2 > this.g.g)
        {
          localArrayList.remove(localjs);
          j = localArrayList.size();
        }
        localjs.f = f1;
        localjs.g = f2;
        i += 1;
      }
      this.d += this.e;
      if ((j == 0) && (ParticleView.a(this.g))) {
        this.a = false;
      }
      try
      {
        Thread.sleep(this.c);
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
      }
    }
    super.run();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\jv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */