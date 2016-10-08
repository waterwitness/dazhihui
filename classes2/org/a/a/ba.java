package org.a.a;

import java.math.BigInteger;
import org.a.e.a;

public class ba
  extends l
{
  byte[] a;
  
  public ba(int paramInt)
  {
    this.a = BigInteger.valueOf(paramInt).toByteArray();
  }
  
  public ba(BigInteger paramBigInteger)
  {
    this.a = paramBigInteger.toByteArray();
  }
  
  public ba(byte[] paramArrayOfByte)
  {
    this.a = paramArrayOfByte;
  }
  
  public static ba a(Object paramObject)
  {
    if ((paramObject == null) || ((paramObject instanceof ba))) {
      return (ba)paramObject;
    }
    throw new IllegalArgumentException("illegal object in getInstance: " + paramObject.getClass().getName());
  }
  
  public static ba a(x paramx, boolean paramBoolean)
  {
    bd localbd = paramx.h();
    if ((paramBoolean) || ((localbd instanceof ba))) {
      return a(localbd);
    }
    return new j(n.a(paramx.h()).f());
  }
  
  void a(bh parambh)
  {
    parambh.a(2, this.a);
  }
  
  boolean a(bd parambd)
  {
    if (!(parambd instanceof ba)) {
      return false;
    }
    parambd = (ba)parambd;
    return a.a(this.a, parambd.a);
  }
  
  public BigInteger e()
  {
    return new BigInteger(this.a);
  }
  
  public int hashCode()
  {
    int i = 0;
    int j = 0;
    while (i != this.a.length)
    {
      j ^= (this.a[i] & 0xFF) << i % 4;
      i += 1;
    }
    return j;
  }
  
  public String toString()
  {
    return e().toString();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */