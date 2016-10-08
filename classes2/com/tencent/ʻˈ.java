package com.tencent;

import android.os.Handler;
import com.tencent.imsdk.QLog;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

final class ʻˈ
  implements Runnable
{
  ʻˈ(ʻˆ paramʻˆ, List paramList) {}
  
  public final void run()
  {
    Object localObject1 = this.b.iterator();
    int i = 0;
    for (;;)
    {
      Object localObject3;
      int j;
      if (((Iterator)localObject1).hasNext())
      {
        localObject3 = (String)((Iterator)localObject1).next();
        j = i + 1;
      }
      try
      {
        QLog.d("TIMFileElem", 1, "downloading from url: " + (String)localObject3);
        localObject3 = (HttpURLConnection)new URL((String)localObject3).openConnection();
        QLog.d("TIMFileElem", 1, "http resp code: " + ((HttpURLConnection)localObject3).getResponseCode() + "|descr: " + ((HttpURLConnection)localObject3).getResponseMessage());
        if (((HttpURLConnection)localObject3).getResponseCode() != 200)
        {
          i = j;
          if (j < this.b.size()) {
            continue;
          }
          localObject1 = ((HttpURLConnection)localObject3).getResponseCode() + "|" + ((HttpURLConnection)localObject3).getResponseMessage();
          this.a.b.post(new ʻˉ(this, (String)localObject1));
          return;
        }
      }
      catch (Exception localException1)
      {
        localException1.printStackTrace();
        this.a.b.post(new ʻˊ(this, localException1));
        return;
      }
      try
      {
        BufferedInputStream localBufferedInputStream = new BufferedInputStream(((HttpURLConnection)localObject3).getInputStream());
        localFileOutputStream = new FileOutputStream(this.a.c);
        byte[] arrayOfByte = new byte['⠀'];
        for (;;)
        {
          i = localBufferedInputStream.read(arrayOfByte);
          if (i < 0) {
            break;
          }
          localFileOutputStream.write(arrayOfByte, 0, i);
        }
      }
      catch (Exception localException2)
      {
        FileOutputStream localFileOutputStream;
        localException2.printStackTrace();
        String str = localException2.toString();
        this.a.b.post(new ʻˎ(this, str));
        ((HttpURLConnection)localObject3).disconnect();
        i = j;
        continue;
        localFileOutputStream.close();
        this.a.b.post(new ʻˋ(this));
        return;
      }
      finally
      {
        ((HttpURLConnection)localObject3).disconnect();
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\ʻˈ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */