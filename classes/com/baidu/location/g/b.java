package com.baidu.location.g;

import android.os.SystemClock;
import com.baidu.location.Jni;
import com.baidu.location.b.m;
import com.baidu.location.h.l;
import com.baidu.location.h.n;
import java.text.SimpleDateFormat;

public class b
{
  private static SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
  n a = null;
  l b = null;
  a c = null;
  boolean d = false;
  long e = 0L;
  private m g = new m();
  
  public b() {}
  
  public b(n paramn, l paraml, boolean paramBoolean)
  {
    this.a = paramn;
    this.b = paraml;
    this.d = paramBoolean;
    this.g.a();
    long l = SystemClock.uptimeMillis();
    this.g.a(l);
    this.g.b(l);
  }
  
  public void a()
  {
    Object localObject2 = null;
    StringBuffer localStringBuffer = new StringBuffer(1024);
    if ((this.b != null) && (this.b.a() > 1)) {}
    for (String str = this.b.b(15);; str = null)
    {
      Object localObject1 = localObject2;
      if (this.a != null)
      {
        localObject1 = localObject2;
        if (this.a.c()) {
          localObject1 = this.a.i();
        }
      }
      if ((str != null) || (localObject1 != null))
      {
        localStringBuffer.append("<LocationRQ xmlns=\"http://skyhookwireless.com/wps/2005\"\nversion=\"2.21\"\nstreet-address-lookup=\"full\">\n<authentication version=\"2.2\">\n<key key=\"" + Jni.a() + "\"\n" + "username=\"BAIDULOC\"/></authentication>\n");
        if (str != null) {
          localStringBuffer.append(str);
        }
        if (localObject1 != null) {
          localStringBuffer.append((String)localObject1);
        }
        localStringBuffer.append("</LocationRQ>");
        new c(this).a(localStringBuffer.toString());
        this.e = System.currentTimeMillis();
      }
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\g\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */