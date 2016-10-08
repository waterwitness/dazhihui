package com.iflytek.sunflower.c;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class f
{
  HashMap<String, String> a = new HashMap();
  
  public String a(String paramString)
  {
    if (!this.a.containsKey(paramString)) {
      return null;
    }
    return (String)this.a.get(paramString);
  }
  
  public void a()
  {
    this.a.clear();
  }
  
  public void a(String paramString1, String paramString2)
  {
    a(paramString1, paramString2, true);
  }
  
  public void a(String paramString1, String paramString2, boolean paramBoolean)
  {
    if ((TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2))) {}
    while ((!paramBoolean) && (this.a.containsKey(paramString1))) {
      return;
    }
    this.a.put(paramString1, paramString2);
  }
  
  public f b()
  {
    f localf = new f();
    Iterator localIterator = this.a.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localf.a((String)localEntry.getKey(), (String)localEntry.getValue());
    }
    return localf;
  }
  
  public HashMap<String, String> c()
  {
    return this.a;
  }
  
  public void d()
  {
    Iterator localIterator = this.a.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      String str2 = ((String)localEntry.getValue()).replaceAll("[,\n ]", "|");
      String str1 = str2;
      if (str2.length() > 124) {
        str1 = str2.substring(0, 124);
      }
      localEntry.setValue(str1);
    }
  }
  
  public String toString()
  {
    d();
    StringBuffer localStringBuffer = new StringBuffer();
    Iterator localIterator = this.a.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localStringBuffer.append((String)localEntry.getKey());
      localStringBuffer.append("=");
      localStringBuffer.append((String)localEntry.getValue());
      localStringBuffer.append(",");
    }
    if (localStringBuffer.length() > 0) {
      localStringBuffer.deleteCharAt(localStringBuffer.length() - 1);
    }
    return localStringBuffer.toString();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\sunflower\c\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */