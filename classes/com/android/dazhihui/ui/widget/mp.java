package com.android.dazhihui.ui.widget;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class mp
  extends Thread
{
  boolean a = true;
  ThumbUpAnimationView b;
  int c = 5;
  double d = 0.0D;
  double e = 0.01D;
  
  public mp(ThumbUpAnimationView paramThumbUpAnimationView1, ThumbUpAnimationView paramThumbUpAnimationView2)
  {
    this.b = paramThumbUpAnimationView2;
  }
  
  public void a(int paramInt, boolean paramBoolean)
  {
    if ((this.b != null) && (this.b.b.a.size() + paramInt < 100)) {
      this.b.b.a(paramInt, this.d, paramBoolean);
    }
  }
  
  public void run()
  {
    for (;;)
    {
      if (this.a)
      {
        ArrayList localArrayList2;
        for (;;)
        {
          mn localmn;
          try
          {
            ArrayList localArrayList1 = this.b.b.a;
            localArrayList1.size();
            localArrayList2 = new ArrayList();
            Iterator localIterator = localArrayList1.iterator();
            if (!localIterator.hasNext()) {
              break label342;
            }
            localmn = (mn)localIterator.next();
            double d1 = this.d - localmn.h;
            float f1 = (float)(localmn.d + localmn.c * d1);
            float f2 = (float)(d1 * (10.0D * d1) + (localmn.e + localmn.b * d1));
            if (f2 >= this.f.g / 5) {
              break label327;
            }
            localmn.a = ((int)(ThumbUpAnimationView.b(this.f) * f2 / (this.f.g / 5)));
            if (f2 >= this.f.g * 2 / 3) {
              localmn.i = ((int)(200.0F * (this.f.g - f2) / (this.f.g / 3)));
            }
            if (localmn.i > 200) {
              localmn.i = 200;
            }
            if ((f2 > this.f.g) || (localmn.i < 0)) {
              localmn.i = 0;
            }
            if (f2 > this.f.g) {
              localArrayList2.add(localmn);
            }
            localmn.f = f1;
            localmn.g = (this.f.g - f2);
            continue;
          }
          catch (Exception localException1)
          {
            localException1.printStackTrace();
            try
            {
              Thread.sleep(this.c);
            }
            catch (Exception localException2) {}
          }
          break;
          label327:
          localmn.a = ThumbUpAnimationView.b(this.f);
        }
        label342:
        this.d += this.e;
        if (localArrayList2.size() > 0) {
          localException2.removeAll(localArrayList2);
        }
        if ((localException2.size() != 0) || (ThumbUpAnimationView.a(this.f) >= 1)) {}
      }
      try
      {
        synchronized (this.f)
        {
          this.f.wait();
        }
        try
        {
          Thread.sleep(this.c);
        }
        catch (Exception localException3) {}
        continue;
        super.run();
        return;
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;) {}
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\mp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */