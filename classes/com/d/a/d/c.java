package com.d.a.d;

import java.io.Closeable;
import java.io.IOException;

public class c
{
  public static void a(Closeable... paramVarArgs)
  {
    if (paramVarArgs == null) {
      return;
    }
    int j = paramVarArgs.length;
    int i = 0;
    while (i < j)
    {
      Closeable localCloseable = paramVarArgs[i];
      if (localCloseable != null) {}
      try
      {
        localCloseable.close();
        i += 1;
      }
      catch (IOException localIOException)
      {
        for (;;) {}
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\d\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */