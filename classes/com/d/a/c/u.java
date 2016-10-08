package com.d.a.c;

import android.net.Uri;
import android.util.Log;
import com.d.a.c.a.a;
import com.d.a.f;
import org.apache.http.RequestLine;

public class u
{
  Uri a;
  int b = 30000;
  String c;
  int d = -1;
  String e;
  int f;
  long g;
  private String i;
  private av j = new av();
  private boolean k = true;
  private a l;
  
  static
  {
    if (!u.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      h = bool;
      return;
    }
  }
  
  public u(Uri paramUri, String paramString)
  {
    this(paramUri, paramString, null);
  }
  
  public u(Uri paramUri, String paramString, av paramav)
  {
    if ((!h) && (paramUri == null)) {
      throw new AssertionError();
    }
    this.i = paramString;
    this.a = paramUri;
    if (paramav == null) {}
    for (this.j = new av();; this.j = paramav)
    {
      if (paramav == null) {
        a(this.j, paramUri);
      }
      return;
    }
  }
  
  public static void a(av paramav, Uri paramUri)
  {
    if (paramUri != null)
    {
      String str2 = paramUri.getHost();
      String str1 = str2;
      if (paramUri.getPort() != -1) {
        str1 = str2 + ":" + paramUri.getPort();
      }
      if (str1 != null) {
        paramav.a("Host", str1);
      }
    }
    paramav.a("User-Agent", b());
    paramav.a("Accept-Encoding", "gzip, deflate");
    paramav.a("Connection", "keep-alive");
    paramav.a("Accept", "*/*");
  }
  
  protected static String b()
  {
    String str = System.getProperty("http.agent");
    if (str != null) {
      return str;
    }
    return "Java" + System.getProperty("java.version");
  }
  
  private String d(String paramString)
  {
    long l1 = 0L;
    if (this.g != 0L) {
      l1 = System.currentTimeMillis() - this.g;
    }
    return String.format("(%d ms) %s: %s", new Object[] { Long.valueOf(l1), d(), paramString });
  }
  
  public RequestLine a()
  {
    return new v(this);
  }
  
  public void a(f paramf) {}
  
  public void a(String paramString)
  {
    if (this.e == null) {}
    while (this.f > 4) {
      return;
    }
    Log.i(this.e, d(paramString));
  }
  
  public void a(String paramString, int paramInt)
  {
    this.c = paramString;
    this.d = paramInt;
  }
  
  public void a(String paramString, Exception paramException)
  {
    if (this.e == null) {}
    while (this.f > 6) {
      return;
    }
    Log.e(this.e, d(paramString));
    Log.e(this.e, paramException.getMessage(), paramException);
  }
  
  public void b(String paramString)
  {
    if (this.e == null) {}
    while (this.f > 2) {
      return;
    }
    Log.v(this.e, d(paramString));
  }
  
  public String c()
  {
    return this.i;
  }
  
  public void c(String paramString)
  {
    if (this.e == null) {}
    while (this.f > 3) {
      return;
    }
    Log.d(this.e, d(paramString));
  }
  
  public Uri d()
  {
    return this.a;
  }
  
  public av e()
  {
    return this.j;
  }
  
  public boolean f()
  {
    return this.k;
  }
  
  public a g()
  {
    return this.l;
  }
  
  public int h()
  {
    return this.b;
  }
  
  public String i()
  {
    return this.c;
  }
  
  public int j()
  {
    return this.d;
  }
  
  public String toString()
  {
    if (this.j == null) {
      return super.toString();
    }
    return this.j.e(this.a.toString());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */