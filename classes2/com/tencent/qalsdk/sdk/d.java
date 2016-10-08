package com.tencent.qalsdk.sdk;

import com.qq.taf.jce.JceDisplayer;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.qq.taf.jce.JceUtil;

public final class d
  extends JceStruct
  implements Cloneable
{
  public String a = "";
  public int b = 0;
  public String c = "";
  public String d = "";
  
  static
  {
    if (!d.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      e = bool;
      return;
    }
  }
  
  public d() {}
  
  public d(String paramString1, int paramInt, String paramString2, String paramString3)
  {
    this.a = paramString1;
    this.b = paramInt;
    this.c = paramString2;
    this.d = paramString3;
  }
  
  public String a()
  {
    return "QALConn.ConnInfo";
  }
  
  public void a(int paramInt)
  {
    this.b = paramInt;
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
  }
  
  public String b()
  {
    return "QALConn.ConnInfo";
  }
  
  public void b(String paramString)
  {
    this.c = paramString;
  }
  
  public String c()
  {
    return this.a;
  }
  
  public void c(String paramString)
  {
    this.d = paramString;
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
      while (e) {}
      throw new AssertionError();
    }
    return localObject1;
  }
  
  public int d()
  {
    return this.b;
  }
  
  public void display(StringBuilder paramStringBuilder, int paramInt)
  {
    paramStringBuilder = new JceDisplayer(paramStringBuilder, paramInt);
    paramStringBuilder.display(this.a, "apn");
    paramStringBuilder.display(this.b, "radioType");
    paramStringBuilder.display(this.c, "serverIP");
    paramStringBuilder.display(this.d, "gateIP");
  }
  
  public String e()
  {
    return this.c;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == null) {}
    do
    {
      return false;
      paramObject = (d)paramObject;
    } while ((!JceUtil.equals(this.a, ((d)paramObject).a)) || (!JceUtil.equals(this.b, ((d)paramObject).b)) || (!JceUtil.equals(this.c, ((d)paramObject).c)) || (!JceUtil.equals(this.d, ((d)paramObject).d)));
    return true;
  }
  
  public String f()
  {
    return this.d;
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
    this.a = paramJceInputStream.readString(1, true);
    this.b = paramJceInputStream.read(this.b, 2, true);
    this.c = paramJceInputStream.readString(3, true);
    this.d = paramJceInputStream.readString(4, true);
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.a, 1);
    paramJceOutputStream.write(this.b, 2);
    paramJceOutputStream.write(this.c, 3);
    paramJceOutputStream.write(this.d, 4);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\sdk\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */