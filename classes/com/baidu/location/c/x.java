package com.baidu.location.c;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

 enum x
{
  private final int e;
  private final String f;
  private final String g;
  private final String h;
  private final int i;
  
  private x(String paramString2, String paramString3, String paramString4, int paramInt2, int paramInt3)
  {
    this.f = paramString2;
    this.g = paramString3;
    this.h = paramString4;
    this.e = paramInt2;
    this.i = paramInt3;
  }
  
  private String a(int paramInt, double paramDouble1, double paramDouble2)
  {
    Object localObject2 = new HashSet();
    ((HashSet)localObject2).add(v.a(paramInt, paramDouble1, paramDouble2));
    double d1 = this.e;
    if (this.e > 0)
    {
      int k = 0;
      while (k < v.c().length)
      {
        localObject1 = v.a(paramDouble2, paramDouble1, d1 * 1.414D, v.c()[k]);
        ((HashSet)localObject2).add(v.a(paramInt, localObject1[1], localObject1[0]));
        k += 1;
      }
    }
    Object localObject1 = new StringBuffer();
    localObject2 = ((HashSet)localObject2).iterator();
    paramInt = 1;
    if (((Iterator)localObject2).hasNext())
    {
      String str = (String)((Iterator)localObject2).next();
      if (paramInt != 0) {
        paramInt = 0;
      }
      for (;;)
      {
        ((StringBuffer)localObject1).append("\"").append(str).append("\"");
        break;
        ((StringBuffer)localObject1).append(',');
      }
    }
    return String.format("SELECT * FROM %s WHERE gridkey IN (%s);", new Object[] { this.f, ((StringBuffer)localObject1).toString() });
  }
  
  private String a(JSONObject paramJSONObject)
  {
    paramJSONObject = paramJSONObject.keys();
    StringBuffer localStringBuffer = new StringBuffer();
    while (paramJSONObject.hasNext())
    {
      String str = (String)paramJSONObject.next();
      if (localStringBuffer.length() != 0) {
        localStringBuffer.append(",");
      }
      localStringBuffer.append("\"").append(str).append("\"");
    }
    return String.format(Locale.US, "DELETE FROM %s WHERE gridkey IN (%s)", new Object[] { this.f, localStringBuffer });
  }
  
  public static x[] a()
  {
    return (x[])j.clone();
  }
  
  private static void b(StringBuffer paramStringBuffer, String paramString1, String paramString2, int paramInt)
  {
    if (paramStringBuffer.length() > 0) {
      paramStringBuffer.append(",");
    }
    paramStringBuffer.append("(\"").append(paramString1).append("\",\"").append(paramString2).append("\",").append(paramInt).append(",").append(System.currentTimeMillis() / 86400000L).append(")");
  }
  
  abstract List a(JSONObject paramJSONObject, String paramString, int paramInt);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\c\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */