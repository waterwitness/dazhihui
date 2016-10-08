package org.a.b;

import java.io.OutputStream;
import java.security.Signature;
import java.security.SignatureException;

class q
  extends OutputStream
{
  private final Signature a;
  
  q(Signature paramSignature)
  {
    this.a = paramSignature;
  }
  
  public void write(int paramInt)
  {
    try
    {
      this.a.update((byte)paramInt);
      return;
    }
    catch (SignatureException localSignatureException)
    {
      throw new l("signature problem: " + localSignatureException, localSignatureException);
    }
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      this.a.update(paramArrayOfByte, paramInt1, paramInt2);
      return;
    }
    catch (SignatureException paramArrayOfByte)
    {
      throw new l("signature problem: " + paramArrayOfByte, paramArrayOfByte);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\b\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */