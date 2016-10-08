package com.tencent;

import android.os.Handler;
import android.os.Looper;
import java.net.HttpURLConnection;
import java.net.URL;

public class TIMImage
{
  private static Handler mainHandler = new Handler(Looper.getMainLooper());
  private long height;
  private long size;
  private TIMImageType type;
  private String url;
  private String uuid;
  private long width;
  
  public long getHeight()
  {
    return this.height;
  }
  
  public void getImage(TIMValueCallBack<byte[]> paramTIMValueCallBack)
  {
    try
    {
      HttpURLConnection localHttpURLConnection = (HttpURLConnection)new URL(this.url).openConnection();
      new Thread(new ˆˏ(this, localHttpURLConnection, paramTIMValueCallBack)).start();
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      paramTIMValueCallBack.onError(6010, localException.toString());
    }
  }
  
  public void getImage(String paramString, TIMCallBack paramTIMCallBack)
  {
    try
    {
      HttpURLConnection localHttpURLConnection = (HttpURLConnection)new URL(this.url).openConnection();
      new Thread(new ˆـ(this, localHttpURLConnection, paramString, paramTIMCallBack)).start();
      return;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
      paramTIMCallBack.onError(6010, paramString.toString());
    }
  }
  
  public long getSize()
  {
    return this.size;
  }
  
  public TIMImageType getType()
  {
    return this.type;
  }
  
  public String getUrl()
  {
    return this.url;
  }
  
  public String getUuid()
  {
    int i;
    switch (ˆᴵ.a[this.type.ordinal()])
    {
    default: 
      i = 0;
    }
    for (;;)
    {
      return String.format("%x_%s", new Object[] { Integer.valueOf(i), this.uuid });
      i = 1;
      continue;
      i = 2;
      continue;
      i = 3;
    }
  }
  
  public long getWidth()
  {
    return this.width;
  }
  
  void setHeight(long paramLong)
  {
    this.height = paramLong;
  }
  
  void setSize(long paramLong)
  {
    this.size = paramLong;
  }
  
  void setType(TIMImageType paramTIMImageType)
  {
    this.type = paramTIMImageType;
  }
  
  void setUrl(String paramString)
  {
    this.url = paramString;
  }
  
  void setUuid(String paramString)
  {
    this.uuid = paramString;
  }
  
  void setWidth(long paramLong)
  {
    this.width = paramLong;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMImage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */