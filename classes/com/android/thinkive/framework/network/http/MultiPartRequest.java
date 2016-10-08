package com.android.thinkive.framework.network.http;

import java.util.Map;
import org.apache.http.entity.mime.content.FileBody;

public abstract interface MultiPartRequest
{
  public abstract void addFileUpload(String paramString, FileBody paramFileBody);
  
  public abstract void addStringUpload(String paramString1, String paramString2);
  
  public abstract Map<String, FileBody> getFileUploads();
  
  public abstract ProgressEntity.ProgressListener getProgressListener();
  
  public abstract Map<String, String> getStringUploads();
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\network\http\MultiPartRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */