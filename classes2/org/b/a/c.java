package org.b.a;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class c
{
  public static final Object a = new d((byte)0);
  private Map b;
  
  public c()
  {
    this.b = new HashMap();
  }
  
  public c(String paramString)
  {
    this(new e(paramString));
  }
  
  public c(Map paramMap)
  {
    Object localObject = paramMap;
    if (paramMap == null) {
      localObject = new HashMap();
    }
    this.b = ((Map)localObject);
  }
  
  public c(e parame)
  {
    this();
    if (parame.c() != '{') {
      throw parame.a("A JSONObject text must begin with '{'");
    }
    do
    {
      parame.a();
      String str;
      int i;
      switch (parame.c())
      {
      default: 
        parame.a();
        str = parame.d().toString();
        i = parame.c();
        if (i == 61) {
          if (parame.b() != '>') {
            parame.a();
          }
        }
      case '\000': 
        Object localObject;
        while (i == 58)
        {
          localObject = parame.d();
          if (str != null) {
            break;
          }
          throw new a("Null key.");
          throw parame.a("A JSONObject text must end with '}'");
        }
        throw parame.a("Expected a ':' after a key");
        if (localObject != null)
        {
          b(localObject);
          this.b.put(str, localObject);
        }
        for (;;)
        {
          switch (parame.c())
          {
          default: 
            throw parame.a("Expected a ',' or '}'");
            this.b.remove(str);
          }
        }
      }
    } while (parame.c() != '}');
  }
  
  static String a(Object paramObject)
  {
    if ((paramObject == null) || (paramObject.equals(null))) {
      paramObject = "null";
    }
    String str;
    do
    {
      do
      {
        do
        {
          do
          {
            return (String)paramObject;
            if (!(paramObject instanceof Number)) {
              break;
            }
            paramObject = (Number)paramObject;
            if (paramObject == null) {
              throw new a("Null pointer");
            }
            b(paramObject);
            str = paramObject.toString();
            paramObject = str;
          } while (str.indexOf('.') <= 0);
          paramObject = str;
        } while (str.indexOf('e') >= 0);
        paramObject = str;
      } while (str.indexOf('E') >= 0);
      while (str.endsWith("0")) {
        str = str.substring(0, str.length() - 1);
      }
      paramObject = str;
    } while (!str.endsWith("."));
    return str.substring(0, str.length() - 1);
    if (((paramObject instanceof Boolean)) || ((paramObject instanceof c)) || ((paramObject instanceof b))) {
      return paramObject.toString();
    }
    if ((paramObject instanceof Map)) {
      return new c((Map)paramObject).toString();
    }
    if ((paramObject instanceof Collection)) {
      return new b((Collection)paramObject).toString();
    }
    if (paramObject.getClass().isArray()) {
      return new b(paramObject).toString();
    }
    return c(paramObject.toString());
  }
  
  private static void b(Object paramObject)
  {
    if (paramObject != null) {
      if ((paramObject instanceof Double))
      {
        if ((((Double)paramObject).isInfinite()) || (((Double)paramObject).isNaN())) {
          throw new a("JSON does not allow non-finite numbers.");
        }
      }
      else if (((paramObject instanceof Float)) && ((((Float)paramObject).isInfinite()) || (((Float)paramObject).isNaN()))) {
        throw new a("JSON does not allow non-finite numbers.");
      }
    }
  }
  
  public static String c(String paramString)
  {
    int i = 0;
    if ((paramString == null) || (paramString.length() == 0)) {
      return "\"\"";
    }
    int k = paramString.length();
    StringBuffer localStringBuffer = new StringBuffer(k + 4);
    localStringBuffer.append('"');
    int j = 0;
    if (i < k)
    {
      char c = paramString.charAt(i);
      switch (c)
      {
      default: 
        if ((c < ' ') || ((c >= '') && (c < ' ')) || ((c >= ' ') && (c < '℀')))
        {
          String str = "000" + Integer.toHexString(c);
          localStringBuffer.append("\\u" + str.substring(str.length() - 4));
        }
        break;
      }
      for (;;)
      {
        i += 1;
        j = c;
        break;
        localStringBuffer.append('\\');
        localStringBuffer.append(c);
        continue;
        if (j == 60) {
          localStringBuffer.append('\\');
        }
        localStringBuffer.append(c);
        continue;
        localStringBuffer.append("\\b");
        continue;
        localStringBuffer.append("\\t");
        continue;
        localStringBuffer.append("\\n");
        continue;
        localStringBuffer.append("\\f");
        continue;
        localStringBuffer.append("\\r");
        continue;
        localStringBuffer.append(c);
      }
    }
    localStringBuffer.append('"');
    return localStringBuffer.toString();
  }
  
  public final Object a(String paramString)
  {
    if (paramString == null) {}
    for (Object localObject = null; localObject == null; localObject = this.b.get(paramString)) {
      throw new a("JSONObject[" + c(paramString) + "] not found.");
    }
    return localObject;
  }
  
  public final Iterator a()
  {
    return this.b.keySet().iterator();
  }
  
  public final boolean b(String paramString)
  {
    return this.b.containsKey(paramString);
  }
  
  public String toString()
  {
    try
    {
      Object localObject1 = a();
      StringBuffer localStringBuffer = new StringBuffer("{");
      while (((Iterator)localObject1).hasNext())
      {
        if (localStringBuffer.length() > 1) {
          localStringBuffer.append(',');
        }
        Object localObject2 = ((Iterator)localObject1).next();
        localStringBuffer.append(c(localObject2.toString()));
        localStringBuffer.append(':');
        localStringBuffer.append(a(this.b.get(localObject2)));
      }
      localStringBuffer.append('}');
      localObject1 = localStringBuffer.toString();
      return (String)localObject1;
    }
    catch (Exception localException) {}
    return null;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\b\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */