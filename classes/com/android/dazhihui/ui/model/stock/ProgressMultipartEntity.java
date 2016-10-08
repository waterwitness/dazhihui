package com.android.dazhihui.ui.model.stock;

import java.io.OutputStream;
import java.nio.charset.Charset;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntity;

public class ProgressMultipartEntity
  extends MultipartEntity
{
  private static volatile boolean mCancel = false;
  private ProgressMultipartEntity.ProgressListener listener;
  
  public ProgressMultipartEntity() {}
  
  public ProgressMultipartEntity(HttpMultipartMode paramHttpMultipartMode)
  {
    super(paramHttpMultipartMode);
  }
  
  public ProgressMultipartEntity(HttpMultipartMode paramHttpMultipartMode, String paramString, Charset paramCharset)
  {
    super(paramHttpMultipartMode, paramString, paramCharset);
  }
  
  public static void cancel()
  {
    mCancel = true;
  }
  
  public static void enable()
  {
    mCancel = false;
  }
  
  public void setListener(ProgressMultipartEntity.ProgressListener paramProgressListener)
  {
    this.listener = paramProgressListener;
  }
  
  public void writeTo(OutputStream paramOutputStream)
  {
    super.writeTo(new ProgressMultipartEntity.CountingOutputStream(paramOutputStream, this.listener));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\ProgressMultipartEntity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */