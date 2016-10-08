package com.android.thinkive.framework.cache;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class DiskLruCache$Editor$FaultHidingOutputStream
  extends FilterOutputStream
{
  private DiskLruCache$Editor$FaultHidingOutputStream(DiskLruCache.Editor paramEditor, OutputStream paramOutputStream)
  {
    super(paramOutputStream);
  }
  
  public void close()
  {
    try
    {
      this.out.close();
      return;
    }
    catch (IOException localIOException)
    {
      DiskLruCache.Editor.access$0(this.this$1, true);
    }
  }
  
  public void flush()
  {
    try
    {
      this.out.flush();
      return;
    }
    catch (IOException localIOException)
    {
      DiskLruCache.Editor.access$0(this.this$1, true);
    }
  }
  
  public void write(int paramInt)
  {
    try
    {
      this.out.write(paramInt);
      return;
    }
    catch (IOException localIOException)
    {
      DiskLruCache.Editor.access$0(this.this$1, true);
    }
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      this.out.write(paramArrayOfByte, paramInt1, paramInt2);
      return;
    }
    catch (IOException paramArrayOfByte)
    {
      DiskLruCache.Editor.access$0(this.this$1, true);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\cache\DiskLruCache$Editor$FaultHidingOutputStream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */