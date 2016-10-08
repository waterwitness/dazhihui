package com.android.dazhihui;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class o
{
  private static List<v> g = new ArrayList();
  private static o j;
  Handler a;
  b b = new p(this);
  public List<u> c = new ArrayList();
  public boolean d = false;
  Runnable e = new t(this);
  private w f = w.a();
  private int h = 1;
  private int i = 1;
  
  private o()
  {
    this.f.a(this.b);
  }
  
  public static o a()
  {
    if (j == null) {
      j = new o();
    }
    return j;
  }
  
  private String a(String paramString1, String paramString2)
  {
    try
    {
      paramString1 = new SecretKeySpec(paramString1.getBytes("UTF-8"), "HmacSHA1");
      Mac localMac = Mac.getInstance("HmacSHA1");
      localMac.init(paramString1);
      paramString1 = a(localMac.doFinal(paramString2.getBytes("UTF-8")));
      return paramString1;
    }
    catch (Exception paramString1) {}
    return "";
  }
  
  private String a(byte[] paramArrayOfByte)
  {
    StringBuffer localStringBuffer = new StringBuffer(paramArrayOfByte.length);
    int k = 0;
    while (k < paramArrayOfByte.length)
    {
      String str = Integer.toHexString(paramArrayOfByte[k] & 0xFF);
      if (str.length() < 2) {
        localStringBuffer.append(0);
      }
      localStringBuffer.append(str.toLowerCase());
      k += 1;
    }
    return localStringBuffer.toString();
  }
  
  private void a(u paramu)
  {
    if ((paramu != null) && (!this.c.contains(paramu))) {
      this.c.add(paramu);
    }
    if (this.d) {
      return;
    }
    w.a().a(new s(this, new r(this, paramu)));
  }
  
  public void a(v paramv)
  {
    if ((!g.contains(paramv)) && (paramv != null)) {
      g.add(paramv);
    }
  }
  
  public String b()
  {
    w localw = w.a();
    String str2 = "NoToken";
    String str1 = str2;
    if (localw.l())
    {
      str1 = str2;
      if (localw.p()) {
        str1 = localw.o();
      }
    }
    return str1;
  }
  
  public void b(v paramv)
  {
    g.remove(paramv);
  }
  
  public String c()
  {
    long l = (System.currentTimeMillis() + 86400000L) / 1000L;
    if ("formal".equals("beta"))
    {
      str = a("PGMVXuoQNmcr", "d16f5d6df63811e5b05ef6935de29a05_" + l + "_PGMVXuoQNmcr");
      return "00000001:" + l + ":" + str;
    }
    if ("formal".equals("local"))
    {
      str = a("CGVcxk3kAbHD", "8995b0c68cf711e5a86b0242ac111902_" + l + "_CGVcxk3kAbHD");
      return "00000001:" + l + ":" + str;
    }
    String str = a("3PoNZFjSKARo", "eeea786772d911e5ab560242ac110006_" + l + "_3PoNZFjSKARo");
    return "0000000a:" + l + ":" + str;
  }
  
  public void c(v paramv)
  {
    if (paramv == null) {
      return;
    }
    if (w.a().l())
    {
      if (w.a().p())
      {
        paramv.a(w.a().o());
        return;
      }
      a(new q(this, paramv));
      return;
    }
    paramv.a("NoToken");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */