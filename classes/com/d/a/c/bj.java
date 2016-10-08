package com.d.a.c;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

public class bj
  extends LinkedHashMap<String, List<String>>
  implements Iterable<NameValuePair>
{
  private static final bm a = new bk();
  private static final bm b = new bl();
  
  public String a(String paramString)
  {
    paramString = (List)get(paramString);
    if ((paramString == null) || (paramString.size() == 0)) {
      return null;
    }
    return (String)paramString.get(0);
  }
  
  protected List<String> a()
  {
    return new ArrayList();
  }
  
  public void a(String paramString1, String paramString2)
  {
    List localList2 = (List)get(paramString1);
    List localList1 = localList2;
    if (localList2 == null)
    {
      localList1 = a();
      put(paramString1, localList1);
    }
    localList1.add(paramString2);
  }
  
  public void b(String paramString1, String paramString2)
  {
    List localList = a();
    localList.add(paramString2);
    put(paramString1, localList);
  }
  
  public Iterator<NameValuePair> iterator()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator1 = keySet().iterator();
    for (;;)
    {
      if (!localIterator1.hasNext()) {
        return localArrayList.iterator();
      }
      String str = (String)localIterator1.next();
      Iterator localIterator2 = ((List)get(str)).iterator();
      while (localIterator2.hasNext()) {
        localArrayList.add(new BasicNameValuePair(str, (String)localIterator2.next()));
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\bj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */