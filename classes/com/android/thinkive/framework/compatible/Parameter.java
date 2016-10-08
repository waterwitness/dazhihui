package com.android.thinkive.framework.compatible;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Parameter
  implements Serializable
{
  private HashMap mParams = null;
  
  public void addFromMap(Map<String, Object> paramMap)
  {
    this.mParams.putAll(paramMap);
  }
  
  public void addParameter(String paramString, Object paramObject)
  {
    if (TextUtils.isEmpty(paramString)) {}
    while (this.mParams.containsKey(paramString)) {
      return;
    }
    this.mParams.put(paramString, paramObject);
  }
  
  public void clearParameter()
  {
    this.mParams.clear();
  }
  
  public Object getObject(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    return this.mParams.get(paramString);
  }
  
  public String[] getParameterNames()
  {
    String[] arrayOfString = new String[this.mParams.size()];
    Iterator localIterator = this.mParams.keySet().iterator();
    int i = 0;
    for (;;)
    {
      if (!localIterator.hasNext()) {
        return arrayOfString;
      }
      arrayOfString[i] = ((String)localIterator.next());
      i += 1;
    }
  }
  
  public HashMap getParams()
  {
    return this.mParams;
  }
  
  public String getString(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return "";
    }
    return (String)this.mParams.get(paramString);
  }
  
  public boolean isEmpty()
  {
    return this.mParams.isEmpty();
  }
  
  public boolean isExistKey(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return false;
    }
    return this.mParams.containsKey(paramString);
  }
  
  public Iterator keys()
  {
    return this.mParams.keySet().iterator();
  }
  
  public void removeParameter(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return;
    }
    this.mParams.remove(paramString);
  }
  
  public void setParameter(String paramString, Object paramObject)
  {
    if (TextUtils.isEmpty(paramString)) {}
    while (!this.mParams.containsKey(paramString)) {
      return;
    }
    this.mParams.put(paramString, paramObject);
  }
  
  public String toString()
  {
    return this.mParams.toString();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\compatible\Parameter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */