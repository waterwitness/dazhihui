package com.tencent.qalsdk.core;

import com.tencent.qalsdk.base.CloseConnReason;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import qalsdk.af;

public class c
{
  public static final int a = 0;
  public static final int b = 1;
  public static final String c = "00000";
  public static final String d = "http";
  public static final String e = "socket";
  public byte f = 1;
  public byte g = 0;
  public String h = "";
  public AtomicInteger i = new AtomicInteger();
  long j = 0L;
  public boolean k = false;
  private String l = "socket";
  private String m;
  private int n;
  private int o = 8000;
  private boolean p = false;
  
  public static c a(String paramString)
  {
    Object localObject = paramString.toLowerCase();
    paramString = new c();
    localObject = Pattern.compile("([a-zA-Z]+)://([a-zA-Z0-9.]+)(:([0-9]+))?(#([0-9_]*))?(:([0-9]+))?(:([0-9]+))?(:([0-9]+))?(:([a-zA-Z]+))?").matcher((CharSequence)localObject);
    if (((Matcher)localObject).matches())
    {
      if (((Matcher)localObject).group(1) != null) {
        paramString.l = ((Matcher)localObject).group(1);
      }
      if (((Matcher)localObject).group(2) != null) {
        paramString.m = ((Matcher)localObject).group(2);
      }
      if (((Matcher)localObject).group(4) == null) {
        break label210;
      }
    }
    label210:
    for (paramString.n = Integer.parseInt(((Matcher)localObject).group(4));; paramString.n = 80)
    {
      if (((Matcher)localObject).group(6) != null) {
        paramString.h = ((Matcher)localObject).group(6);
      }
      if (((Matcher)localObject).group(8) != null) {
        paramString.f = Byte.parseByte(((Matcher)localObject).group(8));
      }
      if (((Matcher)localObject).group(10) != null) {
        paramString.g = Byte.parseByte(((Matcher)localObject).group(10));
      }
      if (((Matcher)localObject).group(12) != null) {
        paramString.o = (Integer.parseInt(((Matcher)localObject).group(12)) * 1000);
      }
      if (((Matcher)localObject).group(14) != null) {
        paramString.p = Boolean.parseBoolean(((Matcher)localObject).group(14));
      }
      paramString.a(paramString.h.equals("00000"));
      return paramString;
    }
  }
  
  public static c a(af paramaf, int paramInt)
  {
    c localc = new c();
    if ((paramaf.e == 2) || (paramaf.e == 3))
    {
      localc.l = "http";
      localc.m = paramaf.a;
      localc.n = paramaf.b;
      localc.h = "";
      localc.f = 0;
      localc.g = paramaf.d;
      if (paramaf.f <= 20) {
        break label135;
      }
      localc.o = 20000;
      label81:
      if (paramInt != 0) {
        break label168;
      }
      localc.h = "00000";
      localc.a(true);
    }
    for (;;)
    {
      if (paramaf.g == 1) {
        localc.p = true;
      }
      return localc;
      if ((paramaf.e != 0) && (paramaf.e != 1)) {
        break;
      }
      localc.l = "socket";
      break;
      label135:
      if (paramaf.f < 5)
      {
        localc.o = 5000;
        break label81;
      }
      localc.o = (paramaf.f * 1000);
      break label81;
      label168:
      localc.a(false);
    }
  }
  
  public String a()
  {
    return this.m + ":" + this.n;
  }
  
  public void a(int paramInt)
  {
    this.n = paramInt;
  }
  
  public void a(boolean paramBoolean)
  {
    this.k = paramBoolean;
  }
  
  public boolean a(CloseConnReason paramCloseConnReason)
  {
    boolean bool = false;
    long l1 = System.currentTimeMillis();
    if ((paramCloseConnReason == CloseConnReason.writeError) || (paramCloseConnReason == CloseConnReason.readError)) {
      if ((this.j == 0L) || (l1 - this.j > 600000L))
      {
        this.j = l1;
        this.i.incrementAndGet();
      }
    }
    for (;;)
    {
      if (this.i.get() > 19)
      {
        this.i.set(0);
        bool = true;
      }
      return bool;
      this.i.addAndGet(10);
      continue;
      if (paramCloseConnReason == CloseConnReason.continueWaitRspTimeout) {
        this.i.addAndGet(10);
      } else if (paramCloseConnReason == CloseConnReason.closeByNetDetectFailed) {
        this.i.addAndGet(20);
      } else if ((paramCloseConnReason == CloseConnReason.invalidData) || (paramCloseConnReason == CloseConnReason.connFull)) {
        this.i.addAndGet(20);
      }
    }
  }
  
  public String b()
  {
    return this.l;
  }
  
  public void b(int paramInt)
  {
    this.o = paramInt;
  }
  
  public void b(String paramString)
  {
    this.l = paramString;
  }
  
  public void b(boolean paramBoolean)
  {
    this.p = paramBoolean;
  }
  
  public String c()
  {
    return this.m;
  }
  
  public void c(String paramString)
  {
    this.m = paramString;
  }
  
  public int d()
  {
    return this.n;
  }
  
  public int e()
  {
    return this.o;
  }
  
  public boolean equals(Object paramObject)
  {
    return ((paramObject instanceof c)) && (((c)paramObject).toString().equals(toString()));
  }
  
  public void f()
  {
    this.j = System.currentTimeMillis();
  }
  
  public boolean g()
  {
    return this.k;
  }
  
  public boolean h()
  {
    return this.p;
  }
  
  public int hashCode()
  {
    return toString().hashCode();
  }
  
  public String toString()
  {
    return this.l + "://" + this.m + ":" + this.n + "#" + this.h + ":" + this.f + ":" + this.g + ":" + this.o / 1000 + ":" + this.p;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\core\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */