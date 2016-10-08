package com.cairh.app.sjkh.util;

import com.e.a.a.i;
import org.apache.http.Header;

class FileUploadUtil$1
  extends i
{
  FileUploadUtil$1(FileUploadUtil paramFileUploadUtil, String paramString) {}
  
  public void onFailure(int paramInt, Header[] paramArrayOfHeader, byte[] paramArrayOfByte, Throwable paramThrowable)
  {
    FileUploadUtil.access$0(this.this$0).onDownError();
  }
  
  public void onSuccess(int paramInt, Header[] paramArrayOfHeader, byte[] paramArrayOfByte)
  {
    FileUploadUtil.access$0(this.this$0).onDownloadCompletion(paramArrayOfByte, this.val$_fileName);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\util\FileUploadUtil$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */