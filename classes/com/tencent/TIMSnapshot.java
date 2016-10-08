package com.tencent;

import android.os.Handler;
import android.os.Looper;
import com.tencent.imcore.IMCoreUser;

public class TIMSnapshot
{
  private static Handler mainHandler = new Handler(Looper.getMainLooper());
  private long height;
  private String identifier;
  private long size;
  private String type = "";
  private String uuid = "";
  private long width;
  
  public TIMSnapshot()
  {
    this(TIMManager.getInstance().getIdentification());
  }
  
  public TIMSnapshot(String paramString)
  {
    this.identifier = paramString;
  }
  
  public long getHeight()
  {
    return this.height;
  }
  
  public void getImage(String paramString, TIMCallBack paramTIMCallBack)
  {
    if (paramTIMCallBack == null) {
      return;
    }
    if ((paramString == null) || (paramString.length() == 0))
    {
      paramTIMCallBack.onError(6017, "invalid path");
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMCallBack.onError(6013, "sdk not initialized");
      return;
    }
    paramString = new ˆﾞ(this, paramTIMCallBack, paramString);
    TIMManager.getInstanceById(this.identifier).getCoreUser().applyDownloadFile(this.uuid, 0L, paramString);
  }
  
  public long getSize()
  {
    return this.size;
  }
  
  public String getType()
  {
    return this.type;
  }
  
  public String getUuid()
  {
    return this.uuid;
  }
  
  public long getWidth()
  {
    return this.width;
  }
  
  public void setHeight(long paramLong)
  {
    this.height = paramLong;
  }
  
  void setSize(long paramLong)
  {
    this.size = paramLong;
  }
  
  public void setType(String paramString)
  {
    this.type = paramString;
  }
  
  void setUuid(String paramString)
  {
    this.uuid = paramString;
  }
  
  public void setWidth(long paramLong)
  {
    this.width = paramLong;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMSnapshot.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */