package com.android.dazhihui.d;

import android.util.Log;
import java.io.Closeable;
import java.io.IOException;

public final class o
{
  public static void a(Closeable paramCloseable)
  {
    if (paramCloseable != null) {}
    try
    {
      paramCloseable.close();
      return;
    }
    catch (IOException paramCloseable)
    {
      Log.e("IOUtilities", "Could not close stream", paramCloseable);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\d\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */