package com.android.dazhihui.ui.widget.a;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class o
  extends FilterOutputStream
{
  private o(n paramn, OutputStream paramOutputStream)
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
      n.a(this.a, true);
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
      n.a(this.a, true);
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
      n.a(this.a, true);
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
      n.a(this.a, true);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\a\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */