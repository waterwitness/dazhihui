package com.android.dazhihui.a.b;

import android.util.Log;
import com.android.dazhihui.ui.delegate.b.g;
import com.android.dazhihui.ui.delegate.b.h;
import com.android.dazhihui.ui.delegate.newtrade.a.b;
import java.util.ArrayList;
import java.util.List;

public class l
  extends o
{
  private b b;
  private int c;
  
  public l(b paramb, int paramInt)
  {
    this.b = paramb;
    this.c = paramInt;
  }
  
  public static List<o> a(byte[] paramArrayOfByte)
  {
    ArrayList localArrayList;
    try
    {
      localArrayList = new ArrayList();
      try
      {
        paramArrayOfByte = b.a(paramArrayOfByte);
        if (paramArrayOfByte != null)
        {
          int j = paramArrayOfByte.length;
          i = 0;
          if (i < j)
          {
            b1 = paramArrayOfByte[i];
            localArrayList.add(new l(b1, b1.e()));
            Log.d("Protocol", "response tradepack tag: " + b1.e() + "   ");
          }
        }
      }
      catch (Exception paramArrayOfByte)
      {
        try
        {
          for (;;)
          {
            int i;
            byte b1;
            h localh = h.c(g.b(b1.d()));
            Log.d("Protocol", "response tradepack protocol: " + localh.a() + "   ");
            i += 1;
          }
          paramArrayOfByte = paramArrayOfByte;
          paramArrayOfByte.printStackTrace();
          paramArrayOfByte = null;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            Log.d("Protocol", "response tradepack error: ");
            localException.printStackTrace();
          }
        }
      }
    }
    finally {}
    return localArrayList;
  }
  
  public static void c()
  {
    try
    {
      b.f();
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
  
  public b b()
  {
    return this.b;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\a\b\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */