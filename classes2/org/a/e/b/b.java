package org.a.e.b;

import java.io.OutputStream;

public class b
  extends OutputStream
{
  private OutputStream a;
  private OutputStream b;
  
  public b(OutputStream paramOutputStream1, OutputStream paramOutputStream2)
  {
    this.a = paramOutputStream1;
    this.b = paramOutputStream2;
  }
  
  public void close()
  {
    this.a.close();
    this.b.close();
  }
  
  public void flush()
  {
    this.a.flush();
    this.b.flush();
  }
  
  public void write(int paramInt)
  {
    this.a.write(paramInt);
    this.b.write(paramInt);
  }
  
  public void write(byte[] paramArrayOfByte)
  {
    this.a.write(paramArrayOfByte);
    this.b.write(paramArrayOfByte);
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.a.write(paramArrayOfByte, paramInt1, paramInt2);
    this.b.write(paramArrayOfByte, paramInt1, paramInt2);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\e\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */