package com.tencent;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.tencent.imcore.IMCoreUser;

public class TIMSoundElem
  extends TIMElem
{
  private static final String tag = "TIMSoundElem";
  private byte[] data = null;
  private long dataSize;
  private long duration;
  private String path;
  private int taskId;
  private String uuid = null;
  
  public TIMSoundElem()
  {
    this.type = TIMElemType.Sound;
  }
  
  byte[] getData()
  {
    return this.data;
  }
  
  public long getDataSize()
  {
    return this.dataSize;
  }
  
  public long getDuration()
  {
    return this.duration;
  }
  
  public String getPath()
  {
    return this.path;
  }
  
  public void getSound(TIMValueCallBack<byte[]> paramTIMValueCallBack)
  {
    if (paramTIMValueCallBack == null) {
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMValueCallBack.onError(6013, "sdk not initialized");
      return;
    }
    paramTIMValueCallBack = new ˈˑ(this, paramTIMValueCallBack, new Handler(Looper.getMainLooper()));
    TIMManager.getInstance().getCoreUser().applyDownloadFile(this.uuid, 3L, paramTIMValueCallBack);
  }
  
  public void getSoundToFile(String paramString, TIMCallBack paramTIMCallBack)
  {
    if (paramTIMCallBack == null) {
      return;
    }
    if (TextUtils.isEmpty(paramString))
    {
      paramTIMCallBack.onError(6017, "invalid parameters");
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMCallBack.onError(6013, "sdk not initialized");
      return;
    }
    paramString = new ˈˆ(this, paramTIMCallBack, new Handler(Looper.getMainLooper()), paramString);
    TIMManager.getInstance().getCoreUser().applyDownloadFile(this.uuid, 3L, paramString);
  }
  
  public int getTaskId()
  {
    return this.taskId;
  }
  
  public String getUuid()
  {
    return this.uuid;
  }
  
  public void setData(byte[] paramArrayOfByte)
  {
    this.data = paramArrayOfByte;
    this.dataSize = paramArrayOfByte.length;
  }
  
  void setDataSize(long paramLong)
  {
    this.dataSize = paramLong;
  }
  
  public void setDuration(long paramLong)
  {
    this.duration = paramLong;
  }
  
  public void setPath(String paramString)
  {
    this.path = paramString;
  }
  
  void setTaskId(int paramInt)
  {
    this.taskId = paramInt;
  }
  
  void setUuid(String paramString)
  {
    this.uuid = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMSoundElem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */