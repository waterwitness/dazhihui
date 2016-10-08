package com.android.volley.toolbox;

import java.io.FilterInputStream;
import java.io.InputStream;

class DiskBasedCache$CountingInputStream
  extends FilterInputStream
{
  private int bytesRead = 0;
  
  private DiskBasedCache$CountingInputStream(InputStream paramInputStream)
  {
    super(paramInputStream);
  }
  
  public int read()
  {
    int i = super.read();
    if (i != -1) {
      this.bytesRead += 1;
    }
    return i;
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramInt1 = super.read(paramArrayOfByte, paramInt1, paramInt2);
    if (paramInt1 != -1) {
      this.bytesRead += paramInt1;
    }
    return paramInt1;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\volley\toolbox\DiskBasedCache$CountingInputStream.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */