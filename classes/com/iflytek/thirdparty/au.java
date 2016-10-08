package com.iflytek.thirdparty;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class au
{
  protected Context a;
  private aB b;
  private String[] c = null;
  private String[] d = null;
  private HashMap<String, String> e = new HashMap();
  private HashMap<String, String> f = new HashMap();
  private List<ay> g = new ArrayList();
  private HashMap<String, String> h = new HashMap();
  
  public au(Context paramContext, aB paramaB)
  {
    this.b = paramaB;
    this.a = paramContext;
  }
  
  private void b()
  {
    if (this.f.size() > 0)
    {
      this.f = null;
      this.f = new HashMap();
    }
    if (this.h.size() > 0)
    {
      this.h = null;
      this.h = new HashMap();
    }
    if (this.e.size() > 0)
    {
      this.e = null;
      this.e = new HashMap();
    }
    if ((this.c != null) && (this.c.length > 0)) {
      this.c = null;
    }
  }
  
  public String[] a()
  {
    b();
    Object localObject1 = new ArrayList();
    Object localObject2 = this.b.d();
    Object localObject3 = this.b.e();
    Object localObject4 = ((HashMap)localObject2).keySet().iterator();
    String str2;
    String str1;
    while (((Iterator)localObject4).hasNext())
    {
      str2 = (String)((Iterator)localObject4).next();
      str1 = (String)((HashMap)localObject2).get(str2);
      this.e.put(str2 + "p", str1);
      ((List)localObject1).add(str1);
      if (str1.contains("\000"))
      {
        str2 = str1.replace("\000", " ");
        this.h.put(str2, str1);
      }
    }
    localObject2 = ((List)localObject3).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (ay)((Iterator)localObject2).next();
      str1 = ((ay)localObject3).a();
      str2 = ((ay)localObject3).c();
      localObject4 = ((ay)localObject3).b();
      this.f.put(str1 + "s", str2);
      this.e.put(str1 + "s", localObject4);
      ((List)localObject1).add(localObject4);
      if (((String)localObject4).contains("\000"))
      {
        str1 = ((String)localObject4).replace("\000", " ");
        this.h.put(str1, localObject4);
      }
      this.g.add(localObject3);
    }
    localObject1 = new HashSet((Collection)localObject1);
    this.c = ((String[])((Set)localObject1).toArray(new String[((Set)localObject1).size()]));
    return this.c;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */