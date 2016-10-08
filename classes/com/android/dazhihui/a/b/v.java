package com.android.dazhihui.a.b;

import android.util.Log;
import com.android.dazhihui.ui.delegate.b.g;
import com.android.dazhihui.ui.delegate.b.h;
import com.android.dazhihui.ui.delegate.b.u;
import java.util.ArrayList;
import java.util.List;

public class v
  extends o
{
  private u b;
  private int c;
  
  public v(u paramu, int paramInt)
  {
    this.b = paramu;
    this.c = paramInt;
  }
  
  public static List<o> a(byte[] paramArrayOfByte)
  {
    for (;;)
    {
      ArrayList localArrayList;
      int i;
      try
      {
        localArrayList = new ArrayList();
        try
        {
          paramArrayOfByte = u.a(paramArrayOfByte);
          if (paramArrayOfByte != null)
          {
            int j = paramArrayOfByte.length;
            i = 0;
            if (i < j)
            {
              b1 = paramArrayOfByte[i];
              localArrayList.add(new v(b1, b1.f()));
              Log.d("Protocol", "response tradepack tag: " + b1.f() + "   ");
              if (b1.d() == 13) {
                Log.d("Protocol", "response tradepack protocol: D协议   ");
              }
            }
          }
        }
        catch (Exception paramArrayOfByte)
        {
          byte b1;
          paramArrayOfByte.printStackTrace();
          paramArrayOfByte = null;
          continue;
          try
          {
            h localh = h.c(g.c(b1.e()));
            Log.d("Protocol", "response tradepack protocol: " + localh.a() + "   ");
          }
          catch (Exception localException)
          {
            Log.d("Protocol", "response tradepack error: ");
            localException.printStackTrace();
          }
        }
      }
      finally {}
      return localArrayList;
      i += 1;
    }
  }
  
  public static void c()
  {
    try
    {
      u.g();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public int a()
  {
    return this.c;
  }
  
  public u b()
  {
    return this.b;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\a\b\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */