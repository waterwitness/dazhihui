package com.tencent.qalsdk.sdk;

import com.qq.taf.jce.JceDisplayer;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.qq.taf.jce.JceUtil;

public final class a
  extends JceStruct
  implements Cloneable
{
  static byte[] i;
  static byte[] j;
  static byte[] k;
  public String a = "";
  public String b = "";
  public byte[] c = null;
  public byte[] d = null;
  public byte[] e = null;
  public int f = 0;
  public byte g = 0;
  public long h = 0L;
  
  static
  {
    if (!a.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      l = bool;
      return;
    }
  }
  
  public a() {}
  
  public a(String paramString1, String paramString2, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, int paramInt, byte paramByte, long paramLong)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramArrayOfByte1;
    this.d = paramArrayOfByte2;
    this.e = paramArrayOfByte3;
    this.f = paramInt;
    this.g = paramByte;
    this.h = paramLong;
  }
  
  public String a()
  {
    return "Account.AccountInfo";
  }
  
  public void a(byte paramByte)
  {
    this.g = paramByte;
  }
  
  public void a(int paramInt)
  {
    this.f = paramInt;
  }
  
  public void a(long paramLong)
  {
    this.h = paramLong;
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    this.c = paramArrayOfByte;
  }
  
  public String b()
  {
    return "com.qq.Account.AccountInfo";
  }
  
  public void b(String paramString)
  {
    this.b = paramString;
  }
  
  public void b(byte[] paramArrayOfByte)
  {
    this.d = paramArrayOfByte;
  }
  
  public String c()
  {
    return this.a;
  }
  
  public void c(byte[] paramArrayOfByte)
  {
    this.e = paramArrayOfByte;
  }
  
  public Object clone()
  {
    Object localObject1 = null;
    try
    {
      Object localObject2 = super.clone();
      localObject1 = localObject2;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      while (l) {}
      throw new AssertionError();
    }
    return localObject1;
  }
  
  public String d()
  {
    return this.b;
  }
  
  public void display(StringBuilder paramStringBuilder, int paramInt)
  {
    paramStringBuilder = new JceDisplayer(paramStringBuilder, paramInt);
    paramStringBuilder.display(this.a, "userID");
    paramStringBuilder.display(this.b, "tinyID");
    paramStringBuilder.display(this.c, "a2");
    paramStringBuilder.display(this.d, "d2");
    paramStringBuilder.display(this.e, "d2Key");
    paramStringBuilder.display(this.f, "sdkAppID");
    paramStringBuilder.display(this.g, "bRegister");
    paramStringBuilder.display(this.h, "lastSendPackTime");
  }
  
  public byte[] e()
  {
    return this.c;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == null) {}
    do
    {
      return false;
      paramObject = (a)paramObject;
    } while ((!JceUtil.equals(this.a, ((a)paramObject).a)) || (!JceUtil.equals(this.b, ((a)paramObject).b)) || (!JceUtil.equals(this.c, ((a)paramObject).c)) || (!JceUtil.equals(this.d, ((a)paramObject).d)) || (!JceUtil.equals(this.e, ((a)paramObject).e)) || (!JceUtil.equals(this.f, ((a)paramObject).f)) || (!JceUtil.equals(this.g, ((a)paramObject).g)) || (!JceUtil.equals(this.h, ((a)paramObject).h)));
    return true;
  }
  
  public byte[] f()
  {
    return this.d;
  }
  
  public byte[] g()
  {
    return this.e;
  }
  
  public int h()
  {
    return this.f;
  }
  
  public int hashCode()
  {
    try
    {
      throw new Exception("Need define key first!");
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return 0;
  }
  
  public byte i()
  {
    return this.g;
  }
  
  public long j()
  {
    return this.h;
  }
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    this.a = paramJceInputStream.readString(1, true);
    this.b = paramJceInputStream.readString(2, true);
    if (i == null)
    {
      i = (byte[])new byte[1];
      ((byte[])i)[0] = 0;
    }
    this.c = ((byte[])paramJceInputStream.read(i, 3, true));
    if (j == null)
    {
      j = (byte[])new byte[1];
      ((byte[])j)[0] = 0;
    }
    this.d = ((byte[])paramJceInputStream.read(j, 4, true));
    if (k == null)
    {
      k = (byte[])new byte[1];
      ((byte[])k)[0] = 0;
    }
    this.e = ((byte[])paramJceInputStream.read(k, 5, true));
    this.f = paramJceInputStream.read(this.f, 6, true);
    this.g = paramJceInputStream.read(this.g, 7, true);
    this.h = paramJceInputStream.read(this.h, 8, true);
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.a, 1);
    paramJceOutputStream.write(this.b, 2);
    paramJceOutputStream.write(this.c, 3);
    paramJceOutputStream.write(this.d, 4);
    paramJceOutputStream.write(this.e, 5);
    paramJceOutputStream.write(this.f, 6);
    paramJceOutputStream.write(this.g, 7);
    paramJceOutputStream.write(this.h, 8);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\qalsdk\sdk\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */