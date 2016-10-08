package com.android.dazhihui.ui.delegate.b;

import com.android.dazhihui.ui.delegate.b.a.k;
import java.io.ByteArrayInputStream;

public class v
{
  public static byte[] a(byte[] paramArrayOfByte, int paramInt)
  {
    try
    {
      byte[] arrayOfByte1 = new byte[paramInt * 2];
      paramArrayOfByte = new ByteArrayInputStream(paramArrayOfByte);
      k localk = new k(paramArrayOfByte);
      int i;
      for (paramInt = 0;; paramInt = i + paramInt)
      {
        i = localk.read(arrayOfByte1, paramInt, paramInt + 1024);
        if (i == -1) {
          break;
        }
      }
      byte[] arrayOfByte2 = new byte[paramInt];
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, paramInt);
      localk.close();
      paramArrayOfByte.close();
      return arrayOfByte2;
    }
    catch (Exception paramArrayOfByte) {}
    return null;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\b\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */