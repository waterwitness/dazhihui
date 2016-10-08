package com.android.dazhihui.ui.model.stock;

import java.io.FilterOutputStream;
import java.io.OutputStream;

public class ProgressMultipartEntity$CountingOutputStream
  extends FilterOutputStream
{
  private final ProgressMultipartEntity.ProgressListener listener;
  private long transferred;
  
  public ProgressMultipartEntity$CountingOutputStream(OutputStream paramOutputStream, ProgressMultipartEntity.ProgressListener paramProgressListener)
  {
    super(paramOutputStream);
    this.listener = paramProgressListener;
    this.transferred = 0L;
  }
  
  public void write(int paramInt)
  {
    if (ProgressMultipartEntity.access$000()) {
      this.out.close();
    }
    do
    {
      return;
      this.out.write(paramInt);
      this.transferred += 1L;
    } while (this.listener == null);
    this.listener.transferred(this.transferred);
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (ProgressMultipartEntity.access$000()) {
      this.out.close();
    }
    for (;;)
    {
      return;
      int i = paramInt1;
      while ((i <= paramInt1 + paramInt2 - 1) && (!ProgressMultipartEntity.access$000()))
      {
        this.out.write(paramArrayOfByte, i, 1);
        int j = i + 1;
        this.transferred += 1L;
        i = j;
        if (this.listener != null)
        {
          this.listener.transferred(this.transferred);
          i = j;
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\ProgressMultipartEntity$CountingOutputStream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */