package com.android.dazhihui.d.b;

import com.android.dazhihui.d.n;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

public class o
{
  public static byte[] a(byte[] paramArrayOfByte)
  {
    GZIPOutputStream localGZIPOutputStream = null;
    Object localObject = localGZIPOutputStream;
    if (paramArrayOfByte != null)
    {
      localObject = localGZIPOutputStream;
      if (paramArrayOfByte.length <= 0) {}
    }
    try
    {
      localObject = new ByteArrayOutputStream();
      localGZIPOutputStream = new GZIPOutputStream((OutputStream)localObject);
      localGZIPOutputStream.write(paramArrayOfByte);
      localGZIPOutputStream.close();
      localObject = ((ByteArrayOutputStream)localObject).toByteArray();
      return (byte[])localObject;
    }
    catch (Exception paramArrayOfByte)
    {
      n.c("Error in compress:" + paramArrayOfByte.getMessage());
    }
    return null;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\d\b\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */