package com.android.dazhihui.ui.widget.adv;

import com.android.dazhihui.ui.a.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class c
{
  com.android.dazhihui.ui.a.c a = new d(this);
  private List<ac> b = new ArrayList();
  
  private void d()
  {
    int i = 0;
    while (i < this.b.size())
    {
      ((ac)this.b.get(i)).e();
      i += 1;
    }
  }
  
  public void a()
  {
    a.c().b(this.a);
    int i = 0;
    while (i < this.b.size())
    {
      ac localac = (ac)this.b.get(i);
      localac.b();
      localac.e();
      i += 1;
    }
  }
  
  public void a(int paramInt)
  {
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (ac)localIterator.next();
      if ((localObject instanceof AdvertView))
      {
        localObject = (AdvertView)localObject;
        if (((AdvertView)localObject).a == paramInt) {
          ((AdvertView)localObject).c();
        }
      }
    }
  }
  
  public void a(ac paramac)
  {
    if (!this.b.contains(paramac))
    {
      this.b.add(paramac);
      a.c().b(this.a);
    }
  }
  
  public void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      c();
      return;
    }
    a();
  }
  
  public void b()
  {
    int i = 0;
    while (i < this.b.size())
    {
      ((ac)this.b.get(i)).d();
      i += 1;
    }
    this.b.clear();
  }
  
  public void b(ac paramac)
  {
    if (!this.b.contains(paramac)) {
      this.b.remove(paramac);
    }
  }
  
  public void c()
  {
    a.c().c(this.a);
    int i = 0;
    while (i < this.b.size())
    {
      ((ac)this.b.get(i)).a();
      i += 1;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\adv\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */