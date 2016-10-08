package com.tencent;

import android.text.TextUtils;
import com.tencent.imcore.IMCoreUser;
import com.tencent.imsdk.QLog;
import java.util.concurrent.ConcurrentHashMap;

public class TIMImageUploader
{
  static String defaultId = "";
  static ConcurrentHashMap<String, TIMImageUploader> mutiMap = new ConcurrentHashMap();
  static final String tag = "TIMImageUploader";
  private String identifier = "";
  
  private TIMImageUploader(String paramString)
  {
    this.identifier = paramString;
  }
  
  private IMCoreUser getIMCoreUser()
  {
    if (TextUtils.isEmpty(this.identifier)) {
      return TIMManager.getInstance().getCoreUser();
    }
    return TIMManager.getInstanceById(this.identifier).getCoreUser();
  }
  
  public static TIMImageUploader getInstance()
  {
    return getInstanceById(TIMManager.getInstance().getIdentification());
  }
  
  public static TIMImageUploader getInstanceById(String paramString)
  {
    return new TIMImageUploader(paramString);
  }
  
  public void cancelTask(int paramInt)
  {
    getIMCoreUser().cancelTask(paramInt);
  }
  
  public int compressPic(String paramString1, String paramString2, int paramInt)
  {
    if ((paramString1 == null) || (paramString2 == null) || ((paramInt != 1) && (paramInt != 2)))
    {
      QLog.d("TIMImageUploader", 1, "invalid params");
      return -1;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      QLog.d("TIMImageUploader", 1, "sdk not initialized");
      return -1;
    }
    return getIMCoreUser().compressPic(paramString1, paramString2, paramInt);
  }
  
  public String getIdentifier()
  {
    return this.identifier;
  }
  
  public int getUploadProgress(long paramLong)
  {
    if (!IMCoreWrapper.get().isReady()) {
      return -1;
    }
    return getIMCoreUser().getImageUploadProgrss(paramLong);
  }
  
  public int submitUploadTask(String paramString, TIMValueCallBack<TIMImageElem> paramTIMValueCallBack)
  {
    if (paramTIMValueCallBack == null) {
      return -1;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMValueCallBack.onError(6013, "sdk not initialized");
      return -1;
    }
    return (int)getIMCoreUser().submitUploadTask(paramString, new TIMImageUploader.ʻ(this, paramTIMValueCallBack));
  }
  
  public int submitUploadTask(String paramString, TIMValueCallBack<TIMImageElem> paramTIMValueCallBack, int paramInt)
  {
    if (paramTIMValueCallBack == null) {
      return -1;
    }
    if (!IMCoreWrapper.get().isReady())
    {
      paramTIMValueCallBack.onError(6013, "sdk not initialized");
      return -1;
    }
    return (int)getIMCoreUser().submitUploadTask(paramString, new TIMImageUploader.ʻ(this, paramTIMValueCallBack), paramInt);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMImageUploader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */