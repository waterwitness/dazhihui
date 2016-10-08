package com.e.a.a;

import android.text.TextUtils;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

class ag
{
  public File a;
  public byte[] b;
  
  public ag(af paramaf, String paramString1, File paramFile, String paramString2, String paramString3)
  {
    paramaf = paramString3;
    if (TextUtils.isEmpty(paramString3)) {
      paramaf = paramFile.getName();
    }
    this.b = a(paramString1, paramaf, paramString2);
    this.a = paramFile;
  }
  
  private byte[] a(String paramString1, String paramString2, String paramString3)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    try
    {
      localByteArrayOutputStream.write(af.a(this.c));
      localByteArrayOutputStream.write(af.a(this.c, paramString1, paramString2));
      localByteArrayOutputStream.write(af.a(this.c, paramString3));
      localByteArrayOutputStream.write(af.a());
      localByteArrayOutputStream.write(af.b());
      return localByteArrayOutputStream.toByteArray();
    }
    catch (IOException paramString1)
    {
      for (;;)
      {
        Log.e("SimpleMultipartEntity", "createHeader ByteArrayOutputStream exception", paramString1);
      }
    }
  }
  
  public long a()
  {
    return this.a.length() + af.b().length + this.b.length;
  }
  
  public void a(OutputStream paramOutputStream)
  {
    paramOutputStream.write(this.b);
    af.a(this.c, this.b.length);
    FileInputStream localFileInputStream = new FileInputStream(this.a);
    byte[] arrayOfByte = new byte['က'];
    for (;;)
    {
      int i = localFileInputStream.read(arrayOfByte);
      if (i == -1)
      {
        paramOutputStream.write(af.b());
        af.a(this.c, af.b().length);
        paramOutputStream.flush();
        b.a(localFileInputStream);
        return;
      }
      paramOutputStream.write(arrayOfByte, 0, i);
      af.a(this.c, i);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\e\a\a\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */