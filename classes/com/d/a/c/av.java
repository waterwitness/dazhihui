package com.d.a.c;

import com.d.a.d.d;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class av
{
  final bj a = new aw(this);
  
  public av a(String paramString1, String paramString2)
  {
    if ((paramString2 != null) && ((paramString2.contains("\n")) || (paramString2.contains("\r")))) {
      throw new IllegalArgumentException("value must not contain a new line or line feed");
    }
    String str = paramString1.toLowerCase();
    this.a.b(str, paramString2);
    ((d)this.a.get(str)).a(paramString1);
    return this;
  }
  
  public bj a()
  {
    return this.a;
  }
  
  public String a(String paramString)
  {
    return this.a.a(paramString.toLowerCase());
  }
  
  public av b(String paramString)
  {
    if (paramString != null)
    {
      paramString = paramString.trim().split(":", 2);
      if (paramString.length == 2) {
        b(paramString[0].trim(), paramString[1].trim());
      }
    }
    else
    {
      return this;
    }
    b(paramString[0].trim(), "");
    return this;
  }
  
  public av b(String paramString1, String paramString2)
  {
    String str = paramString1.toLowerCase();
    this.a.a(str, paramString2);
    ((d)this.a.get(str)).a(paramString1);
    return this;
  }
  
  public StringBuilder b()
  {
    StringBuilder localStringBuilder = new StringBuilder(256);
    Iterator localIterator1 = this.a.keySet().iterator();
    for (;;)
    {
      if (!localIterator1.hasNext())
      {
        localStringBuilder.append("\r\n");
        return localStringBuilder;
      }
      Object localObject = (String)localIterator1.next();
      localObject = (d)this.a.get(localObject);
      Iterator localIterator2 = ((d)localObject).iterator();
      while (localIterator2.hasNext())
      {
        String str = (String)localIterator2.next();
        localStringBuilder.append((String)((d)localObject).a()).append(": ").append(str).append("\r\n");
      }
    }
  }
  
  public List<String> c(String paramString)
  {
    return (List)this.a.remove(paramString.toLowerCase());
  }
  
  public String d(String paramString)
  {
    paramString = c(paramString.toLowerCase());
    if ((paramString == null) || (paramString.size() == 0)) {
      return null;
    }
    return (String)paramString.get(0);
  }
  
  public String e(String paramString)
  {
    return b().insert(0, paramString + "\r\n").toString();
  }
  
  public String toString()
  {
    return b().toString();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */