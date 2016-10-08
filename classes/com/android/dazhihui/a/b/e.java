package com.android.dazhihui.a.b;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.apache.http.HttpEntity;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.message.BasicNameValuePair;

public class e
  extends t
{
  private String i;
  private String j;
  private Map<String, String> k = new HashMap();
  
  public e()
  {
    this.h.put("Content-Type", "application/x-www-form-urlencoded");
  }
  
  public void a(String paramString)
  {
    this.j = paramString;
    this.h.put("Authorization", paramString);
  }
  
  public void a(String paramString1, String paramString2)
  {
    this.k.put(paramString1, paramString2);
  }
  
  public void b(String paramString)
  {
    this.i = paramString;
  }
  
  public String m()
  {
    return this.i;
  }
  
  public HttpEntity n()
  {
    ArrayList localArrayList = new ArrayList();
    StringBuffer localStringBuffer = new StringBuffer();
    if (this.k != null)
    {
      Iterator localIterator = this.k.entrySet().iterator();
      int m = 0;
      if (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        if (m == 0)
        {
          m += 1;
          localStringBuffer.append((String)localEntry.getKey() + "=" + (String)localEntry.getValue());
        }
        for (;;)
        {
          localArrayList.add(new BasicNameValuePair((String)localEntry.getKey(), (String)localEntry.getValue()));
          break;
          localStringBuffer.append("&" + (String)localEntry.getKey() + "=" + (String)localEntry.getValue());
        }
      }
    }
    return new UrlEncodedFormEntity(localArrayList, m());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\a\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */