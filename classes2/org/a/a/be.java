package org.a.a;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.math.BigInteger;

public class be
  extends l
{
  String a;
  
  public be(String paramString)
  {
    if (!b(paramString)) {
      throw new IllegalArgumentException("string " + paramString + " not an OID");
    }
    this.a = paramString;
  }
  
  be(byte[] paramArrayOfByte)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    int i = 1;
    Object localObject1 = null;
    long l1 = 0L;
    int k = 0;
    int j;
    Object localObject2;
    long l2;
    if (k != paramArrayOfByte.length)
    {
      j = paramArrayOfByte[k] & 0xFF;
      if (l1 < 36028797018963968L)
      {
        l1 = l1 * 128L + (j & 0x7F);
        localObject2 = localObject1;
        l2 = l1;
        if ((j & 0x80) != 0) {
          break label284;
        }
        j = i;
        l2 = l1;
        if (i != 0) {}
        switch ((int)l1 / 40)
        {
        default: 
          localStringBuffer.append('2');
          l1 -= 80L;
          label136:
          j = 0;
          l2 = l1;
          localStringBuffer.append('.');
          localStringBuffer.append(l2);
          l1 = 0L;
          i = j;
        }
      }
    }
    for (;;)
    {
      k += 1;
      break;
      localStringBuffer.append('0');
      break label136;
      localStringBuffer.append('1');
      l1 -= 40L;
      break label136;
      localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = BigInteger.valueOf(l1);
      }
      localObject1 = ((BigInteger)localObject2).shiftLeft(7).or(BigInteger.valueOf(j & 0x7F));
      localObject2 = localObject1;
      l2 = l1;
      if ((j & 0x80) == 0)
      {
        localStringBuffer.append('.');
        localStringBuffer.append(localObject1);
        l1 = 0L;
        localObject1 = null;
        continue;
        this.a = localStringBuffer.toString();
      }
      else
      {
        label284:
        localObject1 = localObject2;
        l1 = l2;
      }
    }
  }
  
  public static be a(Object paramObject)
  {
    if ((paramObject == null) || ((paramObject instanceof be))) {
      return (be)paramObject;
    }
    throw new IllegalArgumentException("illegal object in getInstance: " + paramObject.getClass().getName());
  }
  
  private void a(OutputStream paramOutputStream, long paramLong)
  {
    byte[] arrayOfByte = new byte[9];
    int i = 8;
    arrayOfByte[8] = ((byte)((int)paramLong & 0x7F));
    while (paramLong >= 128L)
    {
      paramLong >>= 7;
      i -= 1;
      arrayOfByte[i] = ((byte)((int)paramLong & 0x7F | 0x80));
    }
    paramOutputStream.write(arrayOfByte, i, 9 - i);
  }
  
  private void a(OutputStream paramOutputStream, BigInteger paramBigInteger)
  {
    int j = (paramBigInteger.bitLength() + 6) / 7;
    if (j == 0)
    {
      paramOutputStream.write(0);
      return;
    }
    byte[] arrayOfByte = new byte[j];
    int i = j - 1;
    while (i >= 0)
    {
      arrayOfByte[i] = ((byte)(paramBigInteger.intValue() & 0x7F | 0x80));
      paramBigInteger = paramBigInteger.shiftRight(7);
      i -= 1;
    }
    i = j - 1;
    arrayOfByte[i] = ((byte)(arrayOfByte[i] & 0x7F));
    paramOutputStream.write(arrayOfByte);
  }
  
  private static boolean b(String paramString)
  {
    if ((paramString.length() < 3) || (paramString.charAt(1) != '.')) {}
    do
    {
      return false;
      i = paramString.charAt(0);
    } while ((i < 48) || (i > 50));
    int i = paramString.length() - 1;
    boolean bool = false;
    label47:
    if (i >= 2)
    {
      int j = paramString.charAt(i);
      if ((48 <= j) && (j <= 57)) {}
      for (bool = true;; bool = false)
      {
        i -= 1;
        break label47;
        if ((j != 46) || (!bool)) {
          break;
        }
      }
    }
    return bool;
  }
  
  void a(bh parambh)
  {
    cb localcb = new cb(this.a);
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    bh localbh = new bh(localByteArrayOutputStream);
    a(localByteArrayOutputStream, Integer.parseInt(localcb.b()) * 40 + Integer.parseInt(localcb.b()));
    while (localcb.a())
    {
      String str = localcb.b();
      if (str.length() < 18) {
        a(localByteArrayOutputStream, Long.parseLong(str));
      } else {
        a(localByteArrayOutputStream, new BigInteger(str));
      }
    }
    localbh.close();
    parambh.a(6, localByteArrayOutputStream.toByteArray());
  }
  
  boolean a(bd parambd)
  {
    if (!(parambd instanceof be)) {
      return false;
    }
    return this.a.equals(((be)parambd).a);
  }
  
  public String e()
  {
    return this.a;
  }
  
  public int hashCode()
  {
    return this.a.hashCode();
  }
  
  public String toString()
  {
    return e();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\a\be.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */