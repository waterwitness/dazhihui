package org.b.a;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

public class b
{
  private ArrayList a;
  
  public b()
  {
    this.a = new ArrayList();
  }
  
  public b(Object paramObject)
  {
    this();
    if (paramObject.getClass().isArray())
    {
      int j = Array.getLength(paramObject);
      int i = 0;
      while (i < j)
      {
        Object localObject = Array.get(paramObject, i);
        this.a.add(localObject);
        i += 1;
      }
    }
    throw new a("JSONArray initial value should be a string or collection or array.");
  }
  
  public b(String paramString)
  {
    this(new e(paramString));
  }
  
  public b(Collection paramCollection)
  {
    if (paramCollection == null) {}
    for (paramCollection = new ArrayList();; paramCollection = new ArrayList(paramCollection))
    {
      this.a = paramCollection;
      return;
    }
  }
  
  public b(e parame)
  {
    this();
    int i = parame.c();
    char c;
    if (i == 91)
    {
      c = ']';
      if (parame.c() != ']') {
        break label47;
      }
    }
    label47:
    do
    {
      return;
      if (i == 40)
      {
        c = ')';
        break;
      }
      throw parame.a("A JSONArray text must start with '['");
      parame.a();
      for (;;)
      {
        if (parame.c() == ',')
        {
          parame.a();
          this.a.add(null);
        }
        for (;;)
        {
          i = parame.c();
          switch (i)
          {
          default: 
            throw parame.a("Expected a ',' or ']'");
            parame.a();
            this.a.add(parame.d());
          }
        }
        if (parame.c() == ']') {
          break;
        }
        parame.a();
      }
    } while (c == i);
    throw parame.a("Expected a '" + new Character(c) + "'");
  }
  
  private String a(String paramString)
  {
    int j = this.a.size();
    StringBuffer localStringBuffer = new StringBuffer();
    int i = 0;
    while (i < j)
    {
      if (i > 0) {
        localStringBuffer.append(paramString);
      }
      localStringBuffer.append(c.a(this.a.get(i)));
      i += 1;
    }
    return localStringBuffer.toString();
  }
  
  public final int a()
  {
    return this.a.size();
  }
  
  public final Object a(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.a.size())) {}
    for (Object localObject = null; localObject == null; localObject = this.a.get(paramInt)) {
      throw new a("JSONArray[" + paramInt + "] not found.");
    }
    return localObject;
  }
  
  public String toString()
  {
    try
    {
      String str = "[" + a(",") + ']';
      return str;
    }
    catch (Exception localException) {}
    return null;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\b\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */