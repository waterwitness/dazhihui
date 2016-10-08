package com.tencent.open.a;

import android.os.Environment;

public final class d$b
{
  public static boolean a()
  {
    String str = Environment.getExternalStorageState();
    return ("mounted".equals(str)) || ("mounted_ro".equals(str));
  }
  
  public static d.c b()
  {
    if (!a()) {
      return null;
    }
    return d.c.b(Environment.getExternalStorageDirectory());
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\open\a\d$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */