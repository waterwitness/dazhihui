package com.tencent.qalsdk.sdk;

import com.qq.taf.jce.JceDisplayer;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.qq.taf.jce.JceUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class ag
  extends JceStruct
  implements Cloneable
{
  static ArrayList<Long> d;
  static Map<Long, String> e;
  public String a = "";
  public ArrayList<Long> b = null;
  public Map<Long, String> c = null;
  
  static
  {
    if (!ag.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      f = bool;
      return;
    }
  }
  
  public ag()
  {
    a(this.a);
    a(this.b);
    a(this.c);
  }
  
  public ag(String paramString, ArrayList<Long> paramArrayList, Map<Long, String> paramMap)
  {
    a(paramString);
    a(paramArrayList);
    a(paramMap);
  }
  
  public String a()
  {
    return "clientPushInfo.NotifyRegisterInfo";
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
  }
  
  public void a(ArrayList<Long> paramArrayList)
  {
    this.b = paramArrayList;
  }
  
  public void a(Map<Long, String> paramMap)
  {
    this.c = paramMap;
  }
  
  public String b()
  {
    return "clientPushInfo.NotifyRegisterInfo";
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
      while (f) {}
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
    paramStringBuilder.display(this.b, "notifyIds");
    paramStringBuilder.display(this.c, "notifyProperties");
  }
  
  public Map<Long, String> e()
  {
    return this.c;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == null) {}
    do
    {
      return false;
      paramObject = (ag)paramObject;
    } while ((!JceUtil.equals(this.a, ((ag)paramObject).a)) || (!JceUtil.equals(this.b, ((ag)paramObject).b)) || (!JceUtil.equals(this.c, ((ag)paramObject).c)));
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
    if (d == null)
    {
      d = new ArrayList();
      d.add(Long.valueOf(0L));
    }
    a((ArrayList)paramJceInputStream.read(d, 2, true));
    if (e == null)
    {
      e = new HashMap();
      e.put(Long.valueOf(0L), "");
    }
    a((Map)paramJceInputStream.read(e, 3, true));
  }
  
  public void writeTo(JceOutputStream paramJceOutputStream)
  {
    paramJceOutputStream.write(this.a, 1);
    paramJceOutputStream.write(this.b, 2);
    paramJceOutputStream.write(this.c, 3);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\sdk\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */