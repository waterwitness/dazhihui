package com.e.a.a;

import java.io.InputStream;

public class ab
{
  public final InputStream a;
  public final String b;
  public final String c;
  public final boolean d;
  
  public ab(InputStream paramInputStream, String paramString1, String paramString2, boolean paramBoolean)
  {
    this.a = paramInputStream;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramBoolean;
  }
  
  static ab a(InputStream paramInputStream, String paramString1, String paramString2, boolean paramBoolean)
  {
    String str = paramString2;
    if (paramString2 == null) {
      str = "application/octet-stream";
    }
    return new ab(paramInputStream, paramString1, str, paramBoolean);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\e\a\a\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */