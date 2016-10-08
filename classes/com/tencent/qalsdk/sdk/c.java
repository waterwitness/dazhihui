package com.tencent.qalsdk.sdk;

import com.qq.taf.jce.JceDisplayer;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.qq.taf.jce.JceUtil;
import java.util.ArrayList;

public final class c
  extends JceStruct
  implements Cloneable
{
  static ArrayList<String> c;
  public String a = "";
  public ArrayList<String> b = null;
  
  static
  {
    if (!c.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      d = bool;
      return;
    }
  }
  
  public c()
  {
    a(this.a);
    a(this.b);
  }
  
  public c(String paramString, ArrayList<String> paramArrayList)
  {
    a(paramString);
    a(paramArrayList);
  }
  
  public String a()
  {
    return "clientPushInfo.CommandCallbackerInfo";
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
  }
  
  public void a(ArrayList<String> paramArrayList)
  {
    this.b = paramArrayList;
  }
  
  public String b()
  {
    return "clientPushInfo.CommandCallbackerInfo";
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
      while (d) {}
      throw new AssertionError();
    }
    return localObject1;
  }
  
  public ArrayList<String> d()
  {
    return this.b;
  }
  
  public void display(StringBuilder paramStringBuilder, int paramInt)
  {
    paramStringBuilder = new JceDisplayer(paramStringBuilder, paramInt);
    paramStringBuilder.display(this.a, "uin");
    paramStringBuilder.display(this.b, "cmds");
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == null) {}
    do
    {
      return false;
      paramObject = (c)paramObject;
    } while ((!JceUtil.equals(this.a, ((c)paramObject).a)) || (!JceUtil.equals(this.b, ((c)paramObject).b)));
    return true;
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
    if (c == null)
    {
      c = new ArrayList();
      c.add("");
    }
    a((ArrayList)paramJceInputStream.read(c, 2, true));
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.a, 1);
    paramJceOutputStream.write(this.b, 2);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\qalsdk\sdk\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */