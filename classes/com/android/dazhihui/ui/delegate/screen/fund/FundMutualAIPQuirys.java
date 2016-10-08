package com.android.dazhihui.ui.delegate.screen.fund;

import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.a.g;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.delegate.b.o;
import java.util.Hashtable;

public class FundMutualAIPQuirys
  extends AbstractQuirys
{
  private com.android.dazhihui.a.b.u r;
  
  private void b(Object paramObject)
  {
    if (!o.r()) {
      return;
    }
    paramObject = (Hashtable)paramObject;
    String[] arrayOfString = new String[4];
    arrayOfString[0] = "1115";
    arrayOfString[1] = "1090";
    arrayOfString[2] = "1038";
    arrayOfString[3] = "1042";
    com.android.dazhihui.ui.delegate.b.h localh = o.g(String.valueOf(12084));
    int i = 0;
    while (i < arrayOfString.length)
    {
      String str = arrayOfString[i];
      localh.a(str, n.t((String)((Hashtable)paramObject).get(str)));
      i += 1;
    }
    this.r = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(localh.h()) });
    this.r.a(this);
    g.a().a(this.r);
  }
  
  protected com.android.dazhihui.ui.delegate.b.h a(com.android.dazhihui.ui.delegate.b.h paramh)
  {
    if ((this.g == 12086) || (this.g == 11118))
    {
      paramh.a("1022", o.y());
      paramh.a("1023", o.y());
      return paramh;
    }
    return super.a(paramh);
  }
  
  protected void a(Object paramObject)
  {
    if (this.q == 12084) {
      b(paramObject);
    }
  }
  
  protected void a(String paramString, com.android.dazhihui.ui.delegate.b.h paramh)
  {
    if (paramString.equals(g(12084))) {
      c(paramh.a(0, "1208"));
    }
  }
  
  public String[] a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 12086: 
      return az.a;
    }
    return az.c;
  }
  
  public String[] d(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 12086: 
      return az.b;
    }
    return az.d;
  }
  
  public String g(int paramInt)
  {
    return String.valueOf(paramInt + 1);
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    paramj = ((v)paramj).b();
    if ((paramj != null) && (paramh == this.r)) {
      c(com.android.dazhihui.ui.delegate.b.h.b(paramj.e()));
    }
  }
  
  protected void k()
  {
    if (this.q > 0) {
      l();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\FundMutualAIPQuirys.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */