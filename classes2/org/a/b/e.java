package org.a.b;

import java.io.OutputStream;
import org.a.a.b.d;

public class e
  implements m
{
  private final org.a.a.m a;
  private final byte[] b;
  
  public e(org.a.a.m paramm, byte[] paramArrayOfByte)
  {
    this.a = paramm;
    this.b = paramArrayOfByte;
  }
  
  public e(byte[] paramArrayOfByte)
  {
    this(new org.a.a.m(d.a.e()), paramArrayOfByte);
  }
  
  public org.a.a.m a()
  {
    return this.a;
  }
  
  public void a(OutputStream paramOutputStream)
  {
    paramOutputStream.write(this.b);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */