package com.cairh.app.sjkh.handle;

import java.util.Map;

public abstract interface JtoJHandle$wvClientClickListener
{
  public abstract void checkAppVersion(String paramString);
  
  public abstract void checkSJKHSDKVersion(String paramString);
  
  public abstract void clearCookie();
  
  public abstract void closeBg();
  
  public abstract void closeSJKH();
  
  public abstract void getAccountInfo(String paramString);
  
  public abstract void getDeviceModel(String paramString);
  
  public abstract void getMacAddress();
  
  public abstract void getNetInfo(String paramString);
  
  public abstract void getProd(String paramString);
  
  public abstract void getRegistMobileNo();
  
  public abstract void getUser(String paramString);
  
  public abstract void location(String paramString);
  
  public abstract void openPreviewVideo(String paramString);
  
  public abstract void openVideoCall(String paramString1, String paramString2, String paramString3);
  
  public abstract void openWebNatrue(String paramString);
  
  public abstract void pushUploadAddr(String paramString1, String paramString2, String paramString3, String paramString4);
  
  public abstract void quickDial(String paramString);
  
  public abstract void retryUploadSVideo(String paramString1, String paramString2, String paramString3);
  
  public abstract void saveUser(String paramString1, String paramString2);
  
  public abstract void startSVideo(String paramString1, int paramInt1, int paramInt2, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String[] paramArrayOfString);
  
  public abstract void startSVideoVerify(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9);
  
  public abstract void startSVideoVerify(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, String paramString11);
  
  public abstract void syncOpenInfo(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7);
  
  public abstract void takePictures(int paramInt, String paramString);
  
  public abstract void takePictures(int paramInt, String paramString1, String paramString2);
  
  public abstract void takePictures(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4);
  
  public abstract void uploadLog();
  
  public abstract void witeMobile(String paramString);
  
  public abstract void wvHasClickEnvent(int paramInt);
  
  public abstract void wvHasClickEnvent(Map<String, String> paramMap);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\handle\JtoJHandle$wvClientClickListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */