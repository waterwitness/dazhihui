package com.android.thinkive.framework.network.http;

import java.io.OutputStream;
import org.apache.http.HttpEntity;

class ProgressEntity$1ProgressiveOutputStream
  extends ProgressEntity.1ProxyOutputStream
{
  private final ProgressEntity.ProgressListener listener;
  private long transferred = 0L;
  
  public ProgressEntity$1ProgressiveOutputStream(ProgressEntity paramProgressEntity, OutputStream paramOutputStream)
  {
    super(paramProgressEntity, paramOutputStream);
    this.listener = null;
  }
  
  public ProgressEntity$1ProgressiveOutputStream(ProgressEntity paramProgressEntity, OutputStream paramOutputStream, ProgressEntity.ProgressListener paramProgressListener)
  {
    super(paramProgressEntity, paramOutputStream);
    this.listener = paramProgressListener;
  }
  
  public void write(int paramInt)
  {
    this.out.write(paramInt);
    this.transferred += 1L;
    if (this.listener != null) {
      this.listener.transferred(this.transferred, ProgressEntity.access$0(this.this$0).getContentLength());
    }
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.out.write(paramArrayOfByte, paramInt1, paramInt2);
    this.transferred += paramInt2;
    if (this.listener != null) {
      this.listener.transferred(this.transferred, ProgressEntity.access$0(this.this$0).getContentLength());
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\network\http\ProgressEntity$1ProgressiveOutputStream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */