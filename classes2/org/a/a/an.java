package org.a.a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.a.e.a;

public class an
  extends l
{
  private final boolean a;
  private final int b;
  private final byte[] c;
  
  public an(int paramInt, e parame)
  {
    this.b = paramInt;
    this.a = true;
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    paramInt = 0;
    while (paramInt != parame.a()) {
      try
      {
        localByteArrayOutputStream.write(((d)parame.a(paramInt)).a());
        paramInt += 1;
      }
      catch (IOException parame)
      {
        throw new q("malformed object: " + parame, parame);
      }
    }
    this.c = localByteArrayOutputStream.toByteArray();
  }
  
  an(boolean paramBoolean, int paramInt, byte[] paramArrayOfByte)
  {
    this.a = paramBoolean;
    this.b = paramInt;
    this.c = paramArrayOfByte;
  }
  
  void a(bh parambh)
  {
    int i = 64;
    if (this.a) {
      i = 96;
    }
    parambh.a(i, this.b, this.c);
  }
  
  boolean a(bd parambd)
  {
    if (!(parambd instanceof an)) {}
    do
    {
      return false;
      parambd = (an)parambd;
    } while ((this.a != parambd.a) || (this.b != parambd.b) || (!a.a(this.c, parambd.c)));
    return true;
  }
  
  public int hashCode()
  {
    if (this.a) {}
    for (int i = 1;; i = 0) {
      return i ^ this.b ^ a.a(this.c);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */