package com.tencent;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class ʽʽ
  implements Runnable
{
  ʽʽ(HttpURLConnection paramHttpURLConnection, byte[] paramArrayOfByte, Map paramMap, IMFunc.RequestListener paramRequestListener) {}
  
  public final void run()
  {
    try
    {
      this.a.setRequestMethod("POST");
      this.a.setDoOutput(true);
      this.a.setRequestProperty("Content-Length", String.valueOf(this.b.length));
      Iterator localIterator = this.c.entrySet().iterator();
      Object localObject3;
      while (localIterator.hasNext())
      {
        localObject3 = (Map.Entry)localIterator.next();
        this.a.setRequestProperty((String)((Map.Entry)localObject3).getKey(), (String)((Map.Entry)localObject3).getValue());
      }
      Object localObject1;
      byte[] arrayOfByte2;
      int i;
      arrayOfByte1 = ((ByteArrayOutputStream)localObject3).toByteArray();
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      localObject1 = localException.toString();
      if (this.d != null) {
        this.d.onFail((String)localObject1);
      }
      return;
      this.a.getOutputStream().write(this.b);
      localObject1 = new BufferedInputStream(this.a.getInputStream());
      localObject3 = new ByteArrayOutputStream(10240);
      arrayOfByte2 = new byte['⠀'];
      for (;;)
      {
        i = ((InputStream)localObject1).read(arrayOfByte2);
        if (i < 0) {
          break;
        }
        ((ByteArrayOutputStream)localObject3).write(arrayOfByte2, 0, i);
      }
    }
    finally
    {
      this.a.disconnect();
    }
    byte[] arrayOfByte1;
    if (this.d != null) {
      this.d.onSuccess(arrayOfByte1);
    }
    this.a.disconnect();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\ʽʽ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */