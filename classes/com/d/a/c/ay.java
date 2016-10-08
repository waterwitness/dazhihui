package com.d.a.c;

import android.text.TextUtils;
import com.d.a.a.a;
import com.d.a.af;
import java.io.IOException;

class ay
  implements com.d.a.ax
{
  av a = new av();
  String b;
  
  ay(ax paramax, n paramn) {}
  
  public void a(String paramString)
  {
    try
    {
      paramString = paramString.trim();
      if (this.b == null)
      {
        this.b = paramString;
        return;
      }
      if (!TextUtils.isEmpty(paramString))
      {
        this.a.b(paramString);
        return;
      }
    }
    catch (Exception paramString)
    {
      this.d.h.a(paramString);
      return;
    }
    paramString = this.b.split(" ", 3);
    if (paramString.length < 2) {
      throw new Exception(new IOException("Not HTTP"));
    }
    this.d.f.a(this.a);
    String str = paramString[0];
    this.d.f.a(str);
    this.d.f.a(Integer.parseInt(paramString[1]));
    s locals = this.d.f;
    if (paramString.length == 3) {}
    for (paramString = paramString[2];; paramString = "")
    {
      locals.b(paramString);
      this.d.h.a(null);
      paramString = this.d.f.e();
      if (paramString != null)
      {
        if ("HEAD".equalsIgnoreCase(this.d.j.c())) {}
        for (paramString = ba.a(paramString.l(), null);; paramString = az.a(paramString, bn.a(str), this.a, false))
        {
          this.d.f.b(paramString);
          return;
        }
      }
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\ay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */