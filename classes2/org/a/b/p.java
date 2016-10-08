package org.a.b;

import java.io.OutputStream;
import java.security.MessageDigest;

class p
  extends OutputStream
{
  private final MessageDigest a;
  
  p(MessageDigest paramMessageDigest)
  {
    this.a = paramMessageDigest;
  }
  
  public void write(int paramInt)
  {
    this.a.update((byte)paramInt);
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.a.update(paramArrayOfByte, paramInt1, paramInt2);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\b\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */