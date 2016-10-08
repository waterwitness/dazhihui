package com.tencent;

import android.os.Handler;
import android.os.Looper;
import com.tencent.imcore.IMCoreUser;

public class TIMFileElem
  extends TIMElem
{
  private static final String tag = "TIMFileElem";
  private byte[] data = null;
  private String fileName;
  private long fileSize;
  private String path;
  private int taskId;
  private String uuid = null;
  
  public TIMFileElem()
  {
    this.type = TIMElemType.File;
  }
  
  byte[] getData()
  {
    return this.data;
  }
  
  public void getFile(TIMValueCallBack<byte[]> paramTIMValueCallBack)
  {
    if (paramTIMValueCallBack == null) {
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMValueCallBack.onError(6013, "sdk not initialized");
      return;
    }
    paramTIMValueCallBack = new ʻˏ(this, paramTIMValueCallBack, new Handler(Looper.getMainLooper()));
    TIMManager.getInstance().getCoreUser().applyDownloadFile(this.uuid, 1L, paramTIMValueCallBack);
  }
  
  public String getFileName()
  {
    return this.fileName;
  }
  
  public long getFileSize()
  {
    return this.fileSize;
  }
  
  public String getPath()
  {
    return this.path;
  }
  
  public int getTaskId()
  {
    return this.taskId;
  }
  
  public void getToFile(String paramString, TIMCallBack paramTIMCallBack)
  {
    if (paramTIMCallBack == null) {
      return;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMCallBack.onError(6013, "sdk not initialized");
      return;
    }
    paramString = new ʻˆ(this, paramTIMCallBack, new Handler(Looper.getMainLooper()), paramString);
    TIMManager.getInstance().getCoreUser().applyDownloadFile(this.uuid, 1L, paramString);
  }
  
  public String getUuid()
  {
    return this.uuid;
  }
  
  public void setData(byte[] paramArrayOfByte)
  {
    this.data = paramArrayOfByte;
    this.fileSize = paramArrayOfByte.length;
  }
  
  public void setFileName(String paramString)
  {
    this.fileName = paramString;
  }
  
  void setFileSize(long paramLong)
  {
    this.fileSize = paramLong;
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMFileElem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */