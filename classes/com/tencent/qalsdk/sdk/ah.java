package com.tencent.qalsdk.sdk;

import com.qq.taf.jce.JceDisplayer;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.qq.taf.jce.JceUtil;
import java.util.ArrayList;

public final class ah
  extends JceStruct
  implements Cloneable
{
  static ArrayList<Long> g;
  public String a = "";
  public ArrayList<Long> b = null;
  public int c = 0;
  public byte d = 0;
  public byte e = 0;
  public long f = 0L;
  
  static
  {
    if (!ah.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      h = bool;
      return;
    }
  }
  
  public ah()
  {
    a(this.a);
    a(this.b);
    a(this.c);
    a(this.d);
    b(this.e);
    a(this.f);
  }
  
  public ah(String paramString, ArrayList<Long> paramArrayList, int paramInt, byte paramByte1, byte paramByte2, long paramLong)
  {
    a(paramString);
    a(paramArrayList);
    a(paramInt);
    a(paramByte1);
    b(paramByte2);
    a(paramLong);
  }
  
  public String a()
  {
    return "clientPushInfo.PushRegisterInfo";
  }
  
  public void a(byte paramByte)
  {
    this.d = paramByte;
  }
  
  public void a(int paramInt)
  {
    this.c = paramInt;
  }
  
  public void a(long paramLong)
  {
    this.f = paramLong;
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
  }
  
  public void a(ArrayList<Long> paramArrayList)
  {
    this.b = paramArrayList;
  }
  
  public String b()
  {
    return "clientPushInfo.PushRegisterInfo";
  }
  
  public void b(byte paramByte)
  {
    this.e = paramByte;
  }
  
  public String c()
  {
    return this.a;
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
      while (h) {}
      throw new AssertionError();
    }
    return localObject1;
  }
  
  public ArrayList<Long> d()
  {
    return this.b;
  }
  
  public void display(StringBuilder paramStringBuilder, int paramInt)
  {
    paramStringBuilder = new JceDisplayer(paramStringBuilder, paramInt);
    paramStringBuilder.display(this.a, "uin");
    paramStringBuilder.display(this.b, "pushIds");
    paramStringBuilder.display(this.c, "iStatus");
    paramStringBuilder.display(this.d, "bKikPC");
    paramStringBuilder.display(this.e, "bKikWeak");
    paramStringBuilder.display(this.f, "timeStamp");
  }
  
  public int e()
  {
    return this.c;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == null) {}
    do
    {
      return false;
      paramObject = (ah)paramObject;
    } while ((!JceUtil.equals(this.a, ((ah)paramObject).a)) || (!JceUtil.equals(this.b, ((ah)paramObject).b)) || (!JceUtil.equals(this.c, ((ah)paramObject).c)) || (!JceUtil.equals(this.d, ((ah)paramObject).d)) || (!JceUtil.equals(this.e, ((ah)paramObject).e)) || (!JceUtil.equals(this.f, ((ah)paramObject).f)));
    return true;
  }
  
  public byte f()
  {
    return this.d;
  }
  
  public byte g()
  {
    return this.e;
  }
  
  public long h()
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
  
  public void readFrom(JceInputStream paramJceInputStream)
  {
    a(paramJceInputStream.readString(1, true));
    if (g == null)
    {
      g = new ArrayList();
      g.add(Long.valueOf(0L));
    }
    a((ArrayList)paramJceInputStream.read(g, 2, true));
    a(paramJceInputStream.read(this.c, 3, true));
    a(paramJceInputStream.read(this.d, 4, true));
    b(paramJceInputStream.read(this.e, 5, true));
    a(paramJceInputStream.read(this.f, 6, true));
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.a, 1);
    paramJceOutputStream.write(this.b, 2);
    paramJceOutputStream.write(this.c, 3);
    paramJceOutputStream.write(this.d, 4);
    paramJceOutputStream.write(this.e, 5);
    paramJceOutputStream.write(this.f, 6);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\qalsdk\sdk\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */