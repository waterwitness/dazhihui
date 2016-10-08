package com.tencent;

import android.os.Handler;
import android.os.Looper;
import com.tencent.imcore.IMCoreUser;

public class TIMVideo
{
  private static Handler mainHandler = new Handler(Looper.getMainLooper());
  private long duaration;
  private long size;
  private String type = "";
  private String uuid = "";
  
  public long getDuaration()
  {
    return this.duaration;
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
  
  public void getVideo(String paramString, TIMCallBack paramTIMCallBack)
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
    paramString = new ˈᵎ(this, paramTIMCallBack, paramString);
    TIMManager.getInstance().getCoreUser().applyDownloadFile(this.uuid, 2L, paramString);
  }
  
  public void setDuaration(long paramLong)
  {
    this.duaration = paramLong;
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
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMVideo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */