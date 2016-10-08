package com.baidu.location.b;

import com.baidu.location.e.f;
import com.baidu.location.h.e;
import com.baidu.location.h.i;
import java.util.Locale;

public class m
{
  private long a = 0L;
  private long b = 0L;
  private long c = 0L;
  private long d = 0L;
  private int e = 0;
  private String f = null;
  private String g = null;
  private String h = null;
  
  public void a()
  {
    this.a = 0L;
    this.b = 0L;
    this.c = 0L;
    this.d = 0L;
    this.e = 0;
    this.f = null;
    this.g = null;
    this.h = null;
  }
  
  public void a(long paramLong)
  {
    this.a = paramLong;
  }
  
  public void a(String paramString)
  {
    this.g = paramString;
  }
  
  public void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.e = 1;
      return;
    }
    this.e = 0;
  }
  
  public String b()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    if (i.a().g()) {}
    for (this.f = "&cn=32";; this.f = String.format(Locale.CHINA, "&cn=%d", new Object[] { Integer.valueOf(e.a().e()) }))
    {
      localStringBuffer.append(this.f);
      localStringBuffer.append(String.format(Locale.CHINA, "&fir=%d&tim=%d&dsc=%d&det=%d&ded=%d&typ=%s", new Object[] { Integer.valueOf(this.e), Long.valueOf(this.a), Long.valueOf(this.b - this.a), Long.valueOf(this.c - this.b), Long.valueOf(this.d - this.c), this.g }));
      if (this.h != null) {
        localStringBuffer.append(this.h);
      }
      localStringBuffer.append(b.a().a(false));
      localStringBuffer.append(f.a().c());
      return localStringBuffer.toString();
    }
  }
  
  public void b(long paramLong)
  {
    this.b = paramLong;
  }
  
  public void b(String paramString)
  {
    if (this.h == null)
    {
      this.h = paramString;
      return;
    }
    this.h = String.format("%s%s", new Object[] { this.h, paramString });
  }
  
  public void c(long paramLong)
  {
    this.c = paramLong;
  }
  
  public void d(long paramLong)
  {
    this.d = paramLong;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\b\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */