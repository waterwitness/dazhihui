package com.android.dazhihui.ui.widget.a;

import android.widget.ImageView;
import java.lang.ref.WeakReference;

class w
  extends a<String, Void, v>
{
  private String e;
  private final WeakReference<ImageView> f;
  private aa g;
  
  public w(r paramr, ImageView paramImageView, aa paramaa)
  {
    this.f = new WeakReference(paramImageView);
    this.g = paramaa;
  }
  
  private ImageView e()
  {
    ImageView localImageView = (ImageView)this.f.get();
    if (this == r.a(localImageView)) {
      return localImageView;
    }
    return null;
  }
  
  protected v a(String... arg1)
  {
    this.e = ???[0];
    String str = String.valueOf(this.e);
    Object localObject1 = null;
    v localv = new v();
    synchronized (r.a(this.a))
    {
      while (this.a.a)
      {
        boolean bool = d();
        if (bool) {
          break;
        }
        try
        {
          r.a(this.a).wait();
        }
        catch (InterruptedException localInterruptedException) {}
      }
      ??? = (String[])localObject1;
      if (r.b(this.a) != null)
      {
        ??? = (String[])localObject1;
        if (!d())
        {
          ??? = (String[])localObject1;
          if (!r.c(this.a))
          {
            ??? = r.b(this.a).b(str);
            localv.a(1);
          }
        }
      }
      localObject1 = ???;
      if (??? == null)
      {
        localObject1 = ???;
        if (!d())
        {
          localObject1 = ???;
          if (!r.c(this.a))
          {
            localObject1 = r.b(str);
            localv.a(0);
          }
        }
      }
      if ((localObject1 != null) && (r.b(this.a) != null)) {
        r.b(this.a).a(str, (byte[])localObject1);
      }
      localv.a((byte[])localObject1);
      return localv;
    }
  }
  
  protected void a(v paramv)
  {
    Object localObject1 = null;
    if ((d()) || (r.c(this.a))) {
      paramv = null;
    }
    Object localObject2 = e();
    if ((paramv != null) && (localObject2 != null) && (paramv.a() != null)) {
      r.a(this.a, (ImageView)localObject2, paramv);
    }
    String str;
    if (this.g != null)
    {
      localObject2 = this.g;
      str = this.e;
      if (paramv != null) {
        break label84;
      }
    }
    label84:
    for (paramv = (v)localObject1;; paramv = paramv.a())
    {
      ((aa)localObject2).loadOver(str, paramv);
      return;
    }
  }
  
  protected void b(v arg1)
  {
    super.b(???);
    synchronized (r.a(this.a))
    {
      r.a(this.a).notifyAll();
      if (this.g != null) {
        this.g.loadOver(this.e, null);
      }
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\a\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */