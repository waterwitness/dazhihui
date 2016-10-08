package com.tencent.open.a;

import android.os.Environment;
import android.text.TextUtils;
import com.tencent.open.utils.Global;
import java.io.File;

public class f
{
  public static f a = null;
  protected static final b c;
  private static boolean d = false;
  protected a b = new a(c);
  
  static
  {
    int i = c.m;
    long l = c.n;
    c = new b(c(), i, c.g, c.h, c.c, c.i, 10, c.e, l);
  }
  
  public static f a()
  {
    if (a == null) {}
    try
    {
      if (a == null)
      {
        a = new f();
        d = true;
      }
      return a;
    }
    finally {}
  }
  
  public static final void a(String paramString1, String paramString2)
  {
    a().a(1, paramString1, paramString2, null);
  }
  
  public static final void a(String paramString1, String paramString2, Throwable paramThrowable)
  {
    a().a(2, paramString1, paramString2, paramThrowable);
  }
  
  public static void b()
  {
    try
    {
      a().d();
      if (a != null) {
        a = null;
      }
      return;
    }
    finally {}
  }
  
  public static final void b(String paramString1, String paramString2)
  {
    a().a(2, paramString1, paramString2, null);
  }
  
  public static final void b(String paramString1, String paramString2, Throwable paramThrowable)
  {
    a().a(16, paramString1, paramString2, paramThrowable);
  }
  
  protected static File c()
  {
    int j = 0;
    String str = c.d;
    d.c localc = d.b.b();
    int i = j;
    if (localc != null)
    {
      i = j;
      if (localc.c() > c.f) {
        i = 1;
      }
    }
    if (i != 0) {
      return new File(Environment.getExternalStorageDirectory(), str);
    }
    return new File(Global.getFilesDir(), str);
  }
  
  public static final void c(String paramString1, String paramString2)
  {
    a().a(4, paramString1, paramString2, null);
  }
  
  public static final void d(String paramString1, String paramString2)
  {
    a().a(8, paramString1, paramString2, null);
  }
  
  public static final void e(String paramString1, String paramString2)
  {
    a().a(16, paramString1, paramString2, null);
  }
  
  protected void a(int paramInt, String paramString1, String paramString2, Throwable paramThrowable)
  {
    String str;
    if (d)
    {
      str = Global.getPackageName();
      if (!TextUtils.isEmpty(str)) {
        break label54;
      }
    }
    for (;;)
    {
      e.a.b(paramInt, Thread.currentThread(), System.currentTimeMillis(), paramString1, paramString2, paramThrowable);
      if ((d.a.a(c.b, paramInt)) && (this.b != null)) {
        break;
      }
      label54:
      do
      {
        return;
        str = str + " SDK_VERSION:" + "2.9.4.lite";
      } while (this.b == null);
      e.a.b(32, Thread.currentThread(), System.currentTimeMillis(), "openSDK_LOG", str, null);
      this.b.b(32, Thread.currentThread(), System.currentTimeMillis(), "openSDK_LOG", str, null);
      d = false;
    }
    this.b.b(paramInt, Thread.currentThread(), System.currentTimeMillis(), paramString1, paramString2, paramThrowable);
  }
  
  protected void d()
  {
    if (this.b != null)
    {
      this.b.a();
      this.b.b();
      this.b = null;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\open\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */