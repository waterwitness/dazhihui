package com.android.dazhihui.a.b;

import android.util.Log;
import com.android.dazhihui.ui.delegate.b.g;
import java.util.ArrayList;
import java.util.List;

public class r
  extends m
{
  private List<com.android.dazhihui.ui.delegate.b.m> l = new ArrayList();
  
  public r(com.android.dazhihui.ui.delegate.b.m[] paramArrayOfm)
  {
    if (paramArrayOfm != null)
    {
      int j = paramArrayOfm.length;
      int i = 0;
      while (i < j)
      {
        com.android.dazhihui.ui.delegate.b.m localm = paramArrayOfm[i];
        this.l.add(localm);
        i += 1;
      }
    }
    this.j = this.l.size();
    this.i = n.d;
  }
  
  public byte[] n()
  {
    g localg = new g();
    localg.e(this.h);
    int i = 0;
    while (i < this.l.size())
    {
      com.android.dazhihui.ui.delegate.b.m localm = (com.android.dazhihui.ui.delegate.b.m)this.l.get(i);
      localg.f(localm.a());
      localg.f(0);
      localg.f(localm.b().length);
      localg.a(localm.b());
      if (i < this.l.size() - 1) {
        localg.e(this.h);
      }
      Log.d("Protocol", localm.a() + " QuotePack");
      i += 1;
    }
    return localg.a();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\a\b\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */