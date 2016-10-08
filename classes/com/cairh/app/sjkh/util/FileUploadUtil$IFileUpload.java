package com.cairh.app.sjkh.util;

public abstract interface FileUploadUtil$IFileUpload
{
  public static final String FILE_TYPE_IMAGE = "IMAGE";
  public static final String FILE_TYPE_TXT = "TXT";
  public static final String FILE_TYPE_VIDEO = "VIDEO";
  
  public abstract void onDownError();
  
  public abstract void onDownloadCompletion(byte[] paramArrayOfByte, String paramString);
  
  public abstract void onStartUpload(String paramString);
  
  public abstract void onUploadFailure(String paramString1, String paramString2);
  
  public abstract void onUploadSuccess(String paramString1, String paramString2);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\util\FileUploadUtil$IFileUpload.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */