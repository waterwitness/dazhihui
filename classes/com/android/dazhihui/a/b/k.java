package com.android.dazhihui.a.b;

import android.util.Log;
import com.android.dazhihui.ui.a.h;
import com.android.dazhihui.ui.delegate.b.a.j;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.newtrade.a.b;

public class k
  extends m
{
  private b[] l = null;
  private int m;
  
  public k(b[] paramArrayOfb)
  {
    this.l = paramArrayOfb;
    this.j = this.l.length;
    this.i = n.d;
    this.f = d.c;
    this.c = 7000L;
  }
  
  protected boolean a(int paramInt, Object paramObject)
  {
    switch (paramInt)
    {
    }
    String str2;
    do
    {
      do
      {
        do
        {
          return false;
        } while ((!com.android.dazhihui.a.g.a().o()) || (!o.r()) || (j.b == null));
        h.a().b(false);
        return false;
        paramObject = ((l)paramObject).b();
      } while ((this.l[0].c() != 12) || (paramObject == null));
      str2 = com.android.dazhihui.ui.delegate.b.g.b(((b)paramObject).d());
      String str1 = "";
      paramObject = str1;
      if (str2 != null)
      {
        paramInt = str2.indexOf("21008");
        int i = str2.indexOf("\001", paramInt);
        paramObject = str1;
        if (paramInt > 0)
        {
          paramObject = str1;
          if (i > 0) {
            paramObject = str2.substring(paramInt + 6, i);
          }
        }
      }
    } while ((paramObject == null) || ((str2.indexOf("10000") < 0) && (((String)paramObject).indexOf("20000") < 0) && (((String)paramObject).indexOf("20001") < 0)));
    Log.d("trade", "C Error");
    h.a().b(false);
    return true;
  }
  
  public void b(int paramInt)
  {
    this.m = paramInt;
  }
  
  public int m()
  {
    return this.m;
  }
  
  public byte[] n()
  {
    b[] arrayOfb = this.l;
    int j = arrayOfb.length;
    int i = 0;
    while (i < j)
    {
      b localb = arrayOfb[i];
      i += 1;
    }
    return b.a(this.l, this);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\a\b\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */