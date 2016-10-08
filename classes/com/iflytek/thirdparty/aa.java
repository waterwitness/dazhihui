package com.iflytek.thirdparty;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class aa
{
  HashMap<String, String> a = new HashMap();
  
  public aa() {}
  
  public aa(String paramString, String[][] paramArrayOfString)
  {
    a(paramString);
    a(paramArrayOfString);
  }
  
  public static String f(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    return paramString.replaceAll("[,\n ]", "|");
  }
  
  public int a(String paramString, int paramInt)
  {
    paramString = (String)this.a.get(paramString);
    int i = paramInt;
    if (paramString != null) {}
    try
    {
      i = Integer.parseInt(paramString);
      return i;
    }
    catch (Exception paramString) {}
    return paramInt;
  }
  
  public void a()
  {
    this.a.clear();
  }
  
  public void a(aa paramaa)
  {
    if (paramaa != null) {
      this.a.putAll(paramaa.c());
    }
  }
  
  public void a(aa paramaa, String paramString)
  {
    if (paramaa == null) {
      return;
    }
    a(paramString, paramaa.e(paramString));
  }
  
  public void a(String paramString)
  {
    this.a.clear();
    b(paramString);
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
  
  public void a(String[][] paramArrayOfString)
  {
    if (paramArrayOfString == null) {}
    for (;;)
    {
      return;
      int i = 0;
      while (i < paramArrayOfString.length)
      {
        String[] arrayOfString = paramArrayOfString[i];
        if (this.a.containsKey(arrayOfString[0]))
        {
          String str = (String)this.a.get(arrayOfString[0]);
          this.a.remove(arrayOfString[0]);
          int j = 1;
          while (j < arrayOfString.length)
          {
            this.a.put(arrayOfString[j], str);
            j += 1;
          }
        }
        i += 1;
      }
    }
  }
  
  public boolean a(String paramString, boolean paramBoolean)
  {
    paramString = (String)this.a.get(paramString);
    boolean bool = paramBoolean;
    if (paramString != null)
    {
      if ((!paramString.equals("true")) && (!paramString.equals("1"))) {
        break label40;
      }
      bool = true;
    }
    label40:
    do
    {
      return bool;
      if (paramString.equals("false")) {
        break;
      }
      bool = paramBoolean;
    } while (!paramString.equals("0"));
    return false;
  }
  
  public aa b()
  {
    aa localaa = new aa();
    localaa.a = ((HashMap)this.a.clone());
    return localaa;
  }
  
  public String b(String paramString1, String paramString2)
  {
    paramString1 = (String)this.a.get(paramString1);
    if (paramString1 == null) {
      return paramString2;
    }
    return paramString1;
  }
  
  public void b(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      paramString = paramString.split(",");
      int j = paramString.length;
      int i = 0;
      while (i < j)
      {
        String str2 = paramString[i];
        int k = str2.indexOf("=");
        if ((k > 0) && (k < str2.length()))
        {
          String str1 = str2.substring(0, k);
          str2 = str2.substring(k + 1);
          this.a.put(str1, str2);
        }
        i += 1;
      }
    }
  }
  
  public Boolean c(String paramString)
  {
    if (this.a.remove(paramString) != null) {}
    for (boolean bool = true;; bool = false) {
      return Boolean.valueOf(bool);
    }
  }
  
  public HashMap<String, String> c()
  {
    return this.a;
  }
  
  public String d(String paramString)
  {
    return (String)this.a.remove(paramString);
  }
  
  public void d()
  {
    Iterator localIterator = this.a.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localEntry.setValue(f((String)localEntry.getValue()));
    }
  }
  
  public String e(String paramString)
  {
    return (String)this.a.get(paramString);
  }
  
  public boolean g(String paramString)
  {
    return this.a.containsKey(paramString);
  }
  
  public String toString()
  {
    Object localObject = new StringBuffer();
    Iterator localIterator = this.a.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      ((StringBuffer)localObject).append((String)localEntry.getKey());
      ((StringBuffer)localObject).append("=");
      ((StringBuffer)localObject).append((String)localEntry.getValue());
      ((StringBuffer)localObject).append(",");
    }
    if (((StringBuffer)localObject).length() > 0) {
      ((StringBuffer)localObject).deleteCharAt(((StringBuffer)localObject).length() - 1);
    }
    localObject = ((StringBuffer)localObject).toString();
    X.c((String)localObject);
    return (String)localObject;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */