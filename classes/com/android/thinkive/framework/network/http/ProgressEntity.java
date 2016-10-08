package com.android.thinkive.framework.network.http;

import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;

public class ProgressEntity
  implements HttpEntity
{
  private HttpEntity defaultEntity;
  private final ProgressEntity.ProgressListener mListener;
  
  public ProgressEntity(HttpEntity paramHttpEntity, ProgressEntity.ProgressListener paramProgressListener)
  {
    this.defaultEntity = paramHttpEntity;
    this.mListener = paramProgressListener;
  }
  
  public void consumeContent()
  {
    this.defaultEntity.consumeContent();
  }
  
  public InputStream getContent()
  {
    return this.defaultEntity.getContent();
  }
  
  public Header getContentEncoding()
  {
    return this.defaultEntity.getContentEncoding();
  }
  
  public long getContentLength()
  {
    return this.defaultEntity.getContentLength();
  }
  
  public Header getContentType()
  {
    return this.defaultEntity.getContentType();
  }
  
  public boolean isChunked()
  {
    return this.defaultEntity.isChunked();
  }
  
  public boolean isRepeatable()
  {
    return this.defaultEntity.isRepeatable();
  }
  
  public boolean isStreaming()
  {
    return this.defaultEntity.isStreaming();
  }
  
  public void writeTo(OutputStream paramOutputStream)
  {
    this.defaultEntity.writeTo(new ProgressEntity.1ProgressiveOutputStream(this, paramOutputStream, this.mListener));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\network\http\ProgressEntity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */