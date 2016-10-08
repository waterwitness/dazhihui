package com.e.a.a;

import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.HttpEntity;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

public class z
  implements Serializable
{
  protected boolean a;
  protected boolean b;
  protected boolean c;
  protected final ConcurrentHashMap<String, String> d = new ConcurrentHashMap();
  protected final ConcurrentHashMap<String, ab> e = new ConcurrentHashMap();
  protected final ConcurrentHashMap<String, aa> f = new ConcurrentHashMap();
  protected final ConcurrentHashMap<String, Object> g = new ConcurrentHashMap();
  protected String h = "UTF-8";
  
  public z()
  {
    this(null);
  }
  
  public z(Map<String, String> paramMap)
  {
    if (paramMap != null) {
      paramMap = paramMap.entrySet().iterator();
    }
    for (;;)
    {
      if (!paramMap.hasNext()) {
        return;
      }
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      a((String)localEntry.getKey(), (String)localEntry.getValue());
    }
  }
  
  private List<BasicNameValuePair> a(String paramString, Object paramObject)
  {
    LinkedList localLinkedList = new LinkedList();
    Map localMap;
    Iterator localIterator;
    if ((paramObject instanceof Map))
    {
      localMap = (Map)paramObject;
      paramObject = new ArrayList(localMap.keySet());
      if ((((List)paramObject).size() > 0) && ((((List)paramObject).get(0) instanceof Comparable))) {
        Collections.sort((List)paramObject);
      }
      localIterator = ((List)paramObject).iterator();
      if (localIterator.hasNext()) {}
    }
    for (;;)
    {
      return localLinkedList;
      paramObject = localIterator.next();
      if (!(paramObject instanceof String)) {
        break;
      }
      Object localObject = localMap.get(paramObject);
      if (localObject == null) {
        break;
      }
      if (paramString == null) {}
      for (paramObject = (String)paramObject;; paramObject = String.format("%s[%s]", new Object[] { paramString, paramObject }))
      {
        localLinkedList.addAll(a((String)paramObject, localObject));
        break;
      }
      int j;
      int i;
      if ((paramObject instanceof List))
      {
        paramObject = (List)paramObject;
        j = ((List)paramObject).size();
        i = 0;
        while (i < j)
        {
          localLinkedList.addAll(a(String.format("%s[%d]", new Object[] { paramString, Integer.valueOf(i) }), ((List)paramObject).get(i)));
          i += 1;
        }
      }
      else if ((paramObject instanceof Object[]))
      {
        paramObject = (Object[])paramObject;
        j = paramObject.length;
        i = 0;
        while (i < j)
        {
          localLinkedList.addAll(a(String.format("%s[%d]", new Object[] { paramString, Integer.valueOf(i) }), paramObject[i]));
          i += 1;
        }
      }
      else
      {
        if (!(paramObject instanceof Set)) {
          break label356;
        }
        paramObject = ((Set)paramObject).iterator();
        while (((Iterator)paramObject).hasNext()) {
          localLinkedList.addAll(a(paramString, ((Iterator)paramObject).next()));
        }
      }
    }
    label356:
    localLinkedList.add(new BasicNameValuePair(paramString, paramObject.toString()));
    return localLinkedList;
  }
  
  private HttpEntity b(ac paramac)
  {
    boolean bool;
    Iterator localIterator;
    if ((this.f.isEmpty()) && (this.e.isEmpty()))
    {
      bool = false;
      paramac = new r(paramac, bool);
      localIterator = this.d.entrySet().iterator();
      label47:
      if (localIterator.hasNext()) {
        break label130;
      }
      localIterator = this.g.entrySet().iterator();
      label69:
      if (localIterator.hasNext()) {
        break label162;
      }
      localIterator = this.f.entrySet().iterator();
      label91:
      if (localIterator.hasNext()) {
        break label194;
      }
      localIterator = this.e.entrySet().iterator();
    }
    for (;;)
    {
      if (!localIterator.hasNext())
      {
        return paramac;
        bool = true;
        break;
        label130:
        localEntry = (Map.Entry)localIterator.next();
        paramac.a((String)localEntry.getKey(), localEntry.getValue());
        break label47;
        label162:
        localEntry = (Map.Entry)localIterator.next();
        paramac.a((String)localEntry.getKey(), localEntry.getValue());
        break label69;
        label194:
        localEntry = (Map.Entry)localIterator.next();
        paramac.a((String)localEntry.getKey(), localEntry.getValue());
        break label91;
      }
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      ab localab = (ab)localEntry.getValue();
      if (localab.a != null) {
        paramac.a((String)localEntry.getKey(), ab.a(localab.a, localab.b, localab.c, localab.d));
      }
    }
  }
  
  private HttpEntity c()
  {
    try
    {
      UrlEncodedFormEntity localUrlEncodedFormEntity = new UrlEncodedFormEntity(a(), this.h);
      return localUrlEncodedFormEntity;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      Log.e("RequestParams", "createFormEntity failed", localUnsupportedEncodingException);
    }
    return null;
  }
  
  private HttpEntity c(ac paramac)
  {
    paramac = new af(paramac);
    paramac.a(this.a);
    Iterator localIterator = this.d.entrySet().iterator();
    if (!localIterator.hasNext())
    {
      localIterator = a(null, this.g).iterator();
      label54:
      if (localIterator.hasNext()) {
        break label148;
      }
      localIterator = this.e.entrySet().iterator();
      label76:
      if (localIterator.hasNext()) {
        break label177;
      }
      localIterator = this.f.entrySet().iterator();
    }
    for (;;)
    {
      if (!localIterator.hasNext())
      {
        return paramac;
        localObject1 = (Map.Entry)localIterator.next();
        paramac.b((String)((Map.Entry)localObject1).getKey(), (String)((Map.Entry)localObject1).getValue(), this.h);
        break;
        label148:
        localObject1 = (BasicNameValuePair)localIterator.next();
        paramac.b(((BasicNameValuePair)localObject1).getName(), ((BasicNameValuePair)localObject1).getValue(), this.h);
        break label54;
        label177:
        localObject1 = (Map.Entry)localIterator.next();
        localObject2 = (ab)((Map.Entry)localObject1).getValue();
        if (((ab)localObject2).a == null) {
          break label76;
        }
        paramac.a((String)((Map.Entry)localObject1).getKey(), ((ab)localObject2).b, ((ab)localObject2).a, ((ab)localObject2).c);
        break label76;
      }
      Object localObject1 = (Map.Entry)localIterator.next();
      Object localObject2 = (aa)((Map.Entry)localObject1).getValue();
      paramac.a((String)((Map.Entry)localObject1).getKey(), ((aa)localObject2).a, ((aa)localObject2).b, ((aa)localObject2).c);
    }
  }
  
  protected List<BasicNameValuePair> a()
  {
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = this.d.entrySet().iterator();
    for (;;)
    {
      if (!localIterator.hasNext())
      {
        localLinkedList.addAll(a(null, this.g));
        return localLinkedList;
      }
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localLinkedList.add(new BasicNameValuePair((String)localEntry.getKey(), (String)localEntry.getValue()));
    }
  }
  
  public HttpEntity a(ac paramac)
  {
    if (this.b) {
      return b(paramac);
    }
    if ((this.e.isEmpty()) && (this.f.isEmpty())) {
      return c();
    }
    return c(paramac);
  }
  
  public void a(String paramString, File paramFile)
  {
    a(paramString, paramFile, null, null);
  }
  
  public void a(String paramString1, File paramFile, String paramString2, String paramString3)
  {
    if ((paramFile == null) || (!paramFile.exists())) {
      throw new FileNotFoundException();
    }
    if (paramString1 != null) {
      this.f.put(paramString1, new aa(paramFile, paramString2, paramString3));
    }
  }
  
  public void a(String paramString1, InputStream paramInputStream, String paramString2)
  {
    a(paramString1, paramInputStream, paramString2, null);
  }
  
  public void a(String paramString1, InputStream paramInputStream, String paramString2, String paramString3)
  {
    a(paramString1, paramInputStream, paramString2, paramString3, this.c);
  }
  
  public void a(String paramString1, InputStream paramInputStream, String paramString2, String paramString3, boolean paramBoolean)
  {
    if ((paramString1 != null) && (paramInputStream != null)) {
      this.e.put(paramString1, ab.a(paramInputStream, paramString2, paramString3, paramBoolean));
    }
  }
  
  public void a(String paramString1, String paramString2)
  {
    if ((paramString1 != null) && (paramString2 != null)) {
      this.d.put(paramString1, paramString2);
    }
  }
  
  protected String b()
  {
    return URLEncodedUtils.format(a(), this.h);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = this.d.entrySet().iterator();
    if (!localIterator.hasNext())
    {
      localIterator = this.e.entrySet().iterator();
      label43:
      if (localIterator.hasNext()) {
        break label167;
      }
      localIterator = this.f.entrySet().iterator();
      label65:
      if (localIterator.hasNext()) {
        break label225;
      }
      localIterator = a(null, this.g).iterator();
    }
    for (;;)
    {
      if (!localIterator.hasNext())
      {
        return localStringBuilder.toString();
        localObject = (Map.Entry)localIterator.next();
        if (localStringBuilder.length() > 0) {
          localStringBuilder.append("&");
        }
        localStringBuilder.append((String)((Map.Entry)localObject).getKey());
        localStringBuilder.append("=");
        localStringBuilder.append((String)((Map.Entry)localObject).getValue());
        break;
        label167:
        localObject = (Map.Entry)localIterator.next();
        if (localStringBuilder.length() > 0) {
          localStringBuilder.append("&");
        }
        localStringBuilder.append((String)((Map.Entry)localObject).getKey());
        localStringBuilder.append("=");
        localStringBuilder.append("STREAM");
        break label43;
        label225:
        localObject = (Map.Entry)localIterator.next();
        if (localStringBuilder.length() > 0) {
          localStringBuilder.append("&");
        }
        localStringBuilder.append((String)((Map.Entry)localObject).getKey());
        localStringBuilder.append("=");
        localStringBuilder.append("FILE");
        break label65;
      }
      Object localObject = (BasicNameValuePair)localIterator.next();
      if (localStringBuilder.length() > 0) {
        localStringBuilder.append("&");
      }
      localStringBuilder.append(((BasicNameValuePair)localObject).getName());
      localStringBuilder.append("=");
      localStringBuilder.append(((BasicNameValuePair)localObject).getValue());
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\e\a\a\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */